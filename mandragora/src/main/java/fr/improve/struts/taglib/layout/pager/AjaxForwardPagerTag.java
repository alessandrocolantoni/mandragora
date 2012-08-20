package fr.improve.struts.taglib.layout.pager;

import fr.improve.struts.taglib.layout.event.StartLayoutEvent;
import fr.improve.struts.taglib.layout.event.EndLayoutEvent;
import fr.improve.struts.taglib.layout.collection.CollectionTag;
import fr.improve.struts.taglib.layout.util.LayoutUtils;
import fr.improve.struts.taglib.layout.util.TagUtils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;


public class AjaxForwardPagerTag extends PagerTag{


    protected String forward;
    protected String ajax;

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getAjax() {
        return ajax;
    }

    public void setAjax(String ajax) {
        this.ajax = ajax;
    }


    public Object processStartLayoutEvent(StartLayoutEvent in_event) throws JspException {
		Tag lc_source = in_event.getSource();
		if (lc_source instanceof PagerContainer) {
			PagerContainer lc_pagerContainer = (PagerContainer) lc_source;
			lc_pagerContainer.setOffset(getIndexFirstItem());
			lc_pagerContainer.setLength(getIndexLastItem() - getIndexFirstItem());

			// ask for sort.
			((CollectionTag) lc_pagerContainer).setSortType(CollectionTag.SORT_PAGER);

            if (TOP.equalsIgnoreCase(getLinksLocation())
                    || BOTH.equalsIgnoreCase(getLinksLocation())) {
                // put an anchor so that the javascript knows where to add the pager
                new StartLayoutEvent(this, null).send();

                StringBuffer lc_pagerAnchor = new StringBuffer();
                //lc_pagerAnchor.append("<div colspan=\"");
                lc_pagerAnchor.append("<div ");
                //lc_pagerAnchor.append(String.valueOf(LayoutUtils.getSkin(pageContext.getSession()).getFieldInterface().getColumnNumber()));
                if (styleClass!=null) {
                    lc_pagerAnchor.append(" class=\"");
                    lc_pagerAnchor.append(styleClass+"\"");
                }
                //lc_pagerAnchor.append("\"><a id=\"");
                lc_pagerAnchor.append("><a id=\"");
                //lc_pagerAnchor.append(pagerId + "Anchor");
                lc_pagerAnchor.append(getPagerId() + "Anchor");
                //lc_pagerAnchor.append("\"/></td>");
                lc_pagerAnchor.append("\"/></div>");

                TagUtils.write(pageContext, lc_pagerAnchor.toString());
                new EndLayoutEvent(this, null).send();
            }
		}
		// Resent the event.
		return in_event.sendToParent(this);
	}

    public String getURL(int in_page) {
        String l_url = url;
		if (l_url.indexOf("?")==-1) {
			l_url += "?";
		} else {
			//l_url += "&";  changed for entity not defined
			l_url += "&amp;";
		}
		l_url += PAGE_NUMBER_KEY;
		l_url += "=";
		l_url += in_page;
		if (sessionPagerId!=null) {
			//l_url += "&";
			l_url += "&amp;";
			l_url += PAGER_SESSION_KEY;
			l_url += "=";
			l_url += sessionPagerId;
		}
        if (forward!=null){
            l_url += "&amp;";
            l_url += "forward";
            l_url += "=";
            l_url += forward;
        }
		return l_url;
    }

    public java.lang.String getUrl() {
        if (forward!=null){
            return url+"&amp;forward=" + forward;
        } else return url;
	}
}
