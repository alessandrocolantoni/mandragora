package fr.improve.struts.taglib.layout.renderer;

import fr.improve.struts.taglib.layout.util.IPagerRenderer;
import fr.improve.struts.taglib.layout.util.LayoutUtils;
import fr.improve.struts.taglib.layout.pager.PagerTag;

import javax.servlet.jsp.JspException;
import javax.servlet.http.HttpServletResponse;






public class EncodeURLBasicPagerRenderer extends BasicPagerRenderer implements IPagerRenderer {

    public void doPrintDirect(PagerTag in_tag, StringBuffer in_buffer, int in_maxPageItems, int in_currentPage) throws JspException {
		// Direct go section
        in_buffer.append("<th");
		if (in_tag.getStyleClass() != null) {
			in_buffer.append(" class=\"");
			in_buffer.append(in_tag.getStyleClass());
			in_buffer.append("\"");
		}
		in_buffer.append(">");
		in_buffer.append(LayoutUtils.getLabel(in_tag.getPageContext(), in_tag.getGotoProperty(), null));
		in_buffer.append(" <input type=\"text\" value=\"\" size=\"4\" maxlength=\"4\" onkeypress=\"pagerGoto(this, event, '");
		//in_buffer.append(in_tag.getUrl());
		in_buffer.append(((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getUrl()) );
		in_buffer.append("','");
		in_buffer.append(PagerTag.PAGE_NUMBER_KEY);
		in_buffer.append("',");
		in_buffer.append((int)Math.ceil((float)in_tag.getSize()/in_maxPageItems));
		//in_buffer.append(")\">");
		in_buffer.append(")\"/>");  //changed by ale on 22-07-2007
		in_buffer.append("</th>");

	}


}
