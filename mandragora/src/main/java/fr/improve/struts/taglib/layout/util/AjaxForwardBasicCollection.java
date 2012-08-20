package fr.improve.struts.taglib.layout.util;

import fr.improve.struts.taglib.layout.collection.AjaxForwardCollectionTag;


public class AjaxForwardBasicCollection extends BasicCollection{

    protected String doPrintSortUrl(String in_header, String in_sortUrl) {


        if (in_sortUrl == null) {
			return in_header;
		}

        //String realForward = LayoutUtils.getSkin(pageContext.getSession()).getProperty(((AjaxForwardCollectionTag)collectionTag).getForward());
        String in_forward=((AjaxForwardCollectionTag)collectionTag).getForward();
        String ajax = ((AjaxForwardCollectionTag)collectionTag).getAjax();
        if(in_forward!=null &&!in_forward.equals("")){
            in_sortUrl= in_sortUrl+"&amp;forward="+ in_forward;
            if(ajax!=null && ajax.toLowerCase().equals("true")){
                in_sortUrl = "javascript:updateCollection('"+in_sortUrl+"');";
            }

        }
        //return super.doPrintSortUrl(in_header,in_sortUrl);  deleted on 15/07/2007 to close the tag <img>
        // start added on 15/07/2007 to close the tag <img>
        if (in_sortUrl == null) {
			return in_header;
		}
        else if (collectionTag.getSortPictogram().equalsIgnoreCase("none")) {
            // pas d'image pour faire le tri, mais un lien sur le titre
			StringBuffer lc_tempBuffer = new StringBuffer("<table border=\"0\" width=\"100%\"><tr><td>");
            lc_tempBuffer.append("&nbsp;");
            lc_tempBuffer.append("</td><td>");
			lc_tempBuffer.append("<a href=\"");
			lc_tempBuffer.append(in_sortUrl);
            lc_tempBuffer.append("\">");
            lc_tempBuffer.append(in_header);
            lc_tempBuffer.append("</a>");
            lc_tempBuffer.append("</td></tr></table>");
            return lc_tempBuffer.toString();
        }
        else {
            // utilisation d'une image pour faire le tri
			StringBuffer lc_tempBuffer = new StringBuffer("<table border=\"0\" width=\"100%\"><tr><td>");
			lc_tempBuffer.append("<a href=\"");
			lc_tempBuffer.append(in_sortUrl);
			lc_tempBuffer.append("\"><img src=\"");
			lc_tempBuffer.append(LayoutUtils.getSkin(pageContext.getSession()).getImageDirectory(pageContext.getRequest()));
			lc_tempBuffer.append("/");
			lc_tempBuffer.append(LayoutUtils.getSkin(pageContext.getSession()).getProperty(collectionTag.getSortPictogram()));
			lc_tempBuffer.append("\" border=\"0\" alt=\"");
			lc_tempBuffer.append(LayoutUtils.getSkin(pageContext.getSession()).getProperty(collectionTag.getSortLabel()));
			lc_tempBuffer.append("\"/></a>");

			lc_tempBuffer.append("</td><td>");
			lc_tempBuffer.append(in_header);
			lc_tempBuffer.append("</td></tr></table>");

			return lc_tempBuffer.toString();
		}
        // end added on 15/07/2007 to close the tag <img>


	}

    public void doStartHeaders(StringBuffer out_buffer) {
		out_buffer.append("<script src=\"");
        out_buffer.append(LayoutUtils.getSkin(pageContext.getSession()).getConfigDirectory(pageContext.getRequest()));
        out_buffer.append("/collection.js\"></script>");
		super.doStartHeaders(out_buffer);
	}


}
