package fr.improve.struts.taglib.layout.util;

//import fr.improve.struts.taglib.layout.collection.ForwardCollectionTag; deleted by alessandro on 20/10/2007
import fr.improve.struts.taglib.layout.collection.AjaxForwardCollectionTag; //added by alessandro on 20/10/2007


public class ForwardBasicCollection extends BasicCollection{

    protected String doPrintSortUrl(String in_header, String in_sortUrl) {


        if (in_sortUrl == null) {
			return in_header;
		}

        //String realForward = LayoutUtils.getSkin(pageContext.getSession()).getProperty(((ForwardCollectionTag)collectionTag).getForward());
        //String in_forward=((ForwardCollectionTag)collectionTag).getForward();  deleted by alessandro on 20/10/2007
        String in_forward=((AjaxForwardCollectionTag)collectionTag).getForward();   //added by alessandro on 20/10/2007
        if(in_forward!=null &&!in_forward.equals("")){
            in_sortUrl= in_sortUrl+"&amp;forward="+ in_forward;
            in_sortUrl = "javascript:updateCollection('"+in_sortUrl+"');";
        }
        return super.doPrintSortUrl(in_header,in_sortUrl);


	}

    public void doStartHeaders(StringBuffer out_buffer) {
		out_buffer.append("<script src=\"");
        out_buffer.append(LayoutUtils.getSkin(pageContext.getSession()).getConfigDirectory(pageContext.getRequest()));
        out_buffer.append("/collection.js\"></script>");
		super.doStartHeaders(out_buffer);
	}
}
