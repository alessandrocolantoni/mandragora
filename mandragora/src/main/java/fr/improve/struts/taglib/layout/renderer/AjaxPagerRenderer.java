package fr.improve.struts.taglib.layout.renderer;

import fr.improve.struts.taglib.layout.util.IPagerRenderer;
import fr.improve.struts.taglib.layout.util.LayoutUtils;
import fr.improve.struts.taglib.layout.pager.PagerTag;
import fr.improve.struts.taglib.layout.pager.AjaxForwardPagerTag;
import fr.improve.struts.taglib.layout.skin.Skin;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: Jul 24, 2007
 * Time: 11:51:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class AjaxPagerRenderer extends EncodeURLBasicPagerRenderer implements IPagerRenderer {


     public void doPrintDirect_old(PagerTag in_tag, StringBuffer in_buffer, int in_maxPageItems, int in_currentPage) throws JspException {
		// Direct go section
        in_buffer.append("<td><table><tr>");
		super.doPrintDirect( in_tag,  in_buffer,  in_maxPageItems,  in_currentPage);
        in_buffer.append("</tr></table></td>");
	}


    public void doPrintDirect(PagerTag in_tag, StringBuffer in_buffer, int in_maxPageItems, int in_currentPage) throws JspException {
		// Direct go section
        in_buffer.append("<td><table><tr>");
        String ajax = ((AjaxForwardPagerTag)in_tag).getAjax();
        if(ajax!=null && ajax.toLowerCase().equals("true")) {
            in_buffer.append("<th");
            if (in_tag.getStyleClass() != null) {
                in_buffer.append(" class=\"");
                in_buffer.append(in_tag.getStyleClass());
                in_buffer.append("\"");
            }
            in_buffer.append(">");
            in_buffer.append(LayoutUtils.getLabel(in_tag.getPageContext(), in_tag.getGotoProperty(), null));
            in_buffer.append(" <input type=\"text\" value=\"\" size=\"4\" maxlength=\"4\" onkeypress=\"ajaxPagerGoto(this, event, '");
            //in_buffer.append(in_tag.getUrl());
            in_buffer.append(((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getUrl()) );
            in_buffer.append("','");
            in_buffer.append(PagerTag.PAGE_NUMBER_KEY);
            in_buffer.append("',");
            in_buffer.append((int)Math.ceil((float)in_tag.getSize()/in_maxPageItems));
            //in_buffer.append(")\">");
            in_buffer.append(");\"/>");  //changed by ale on 22-07-2007
            in_buffer.append("</th>");
        } else{
            super.doPrintDirect( in_tag,  in_buffer,  in_maxPageItems,  in_currentPage);
        }

        in_buffer.append("</tr></table></td>");
	}




    /**
     * 21-07-2007 to make well formed current page
     * @param in_tag
     * @param in_buffer
     * @param l_maxPageItems
     * @param l_currentPage
     */
    public void doPrintMain(PagerTag in_tag, StringBuffer in_buffer, int l_maxPageItems, int l_currentPage) {
		// Main section
	    in_buffer.append("<td ");
			if (in_tag.getStyleClass() != null) {
				in_buffer.append(" class='");
				in_buffer.append(in_tag.getStyleClass());
				in_buffer.append("'");
			}
		in_buffer.append(">");
        in_buffer.append("\n<table>\n<tr>\n");  // added on 21-07-2007 to make well formed
		// Get the maximum number of links to display.
		int l_maxLinks = in_tag.computeMaxLinks();

		// Have we display a link previously ?
		boolean lc_previousDisplayed = true;

		// Iteration index.
		int i;
		for (i = 0; in_tag.getSize() > l_maxPageItems * i ; i++) {

			if (in_tag.shouldDisplay(i, l_currentPage, in_tag.getNumberOfPage(), l_maxLinks)) {
				// Ok, this page number must appear in the pager.
                in_buffer.append("<td>\n");  // added on 21-07-2007 to make well formed
				if (i != l_currentPage) {

					in_buffer.append("<a href=\"");
                    String ajax = ((AjaxForwardPagerTag)in_tag).getAjax();
                    if(ajax!=null && ajax.toLowerCase().equals("true")) {
                        in_buffer.append(" javascript:updateCollection('"+((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getURL(i))+"');");
                    } else{
                        in_buffer.append(((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getURL(i)));
                    }
					//in_buffer.append(((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getURL(i)));
					if (in_tag.getStyleClass() != null) {
						in_buffer.append("\" class=\"");
						in_buffer.append(in_tag.getStyleClass());
					}
					in_buffer.append("\">");
				}
				in_buffer.append((i+1));
				if (i != l_currentPage) {
					in_buffer.append("</a>\n");

				}
                in_buffer.append("</td>\n");  // added on 21-07-2007 to make well formed
				lc_previousDisplayed = true;
				//in_buffer.append("&nbsp;");
				//in_buffer.append("<td>&nbsp;</td>"); // changed on 21-07-2007 to make well formed

			} else {
				// There is too many pages, and we're not displaying a link to this page number.
				if (lc_previousDisplayed) {
                    in_buffer.append("<td>\n");  // added on 21-07-2007 to make well formed
					in_buffer.append("...");
					//in_buffer.append("&nbsp;");
                    in_buffer.append("</td>\n");  // added on 21-07-2007 to make well formed
				}
				lc_previousDisplayed = false;
			}
		}
        in_buffer.append("</tr>\n</table>\n");  // added on 21-07-2007 to make well formed
		in_buffer.append("</td>\n");
//		/return i;
	}

    /**
     * added by ale on 23-07-2007
     * @param in_tag
     * @param in_buffer
     * @param l_maxPageItems
     * @param l_currentPage
     */
    public void doPrintNext(PagerTag in_tag, StringBuffer in_buffer, int l_maxPageItems, int l_currentPage) {
        in_buffer.append("<td><table><tr>");
        String ajax = ((AjaxForwardPagerTag)in_tag).getAjax();
        if(ajax!=null && ajax.toLowerCase().equals("true")) {

            in_buffer.append("<td");
            if (in_tag.getAlign()==null) {
                in_buffer.append(" width=\"50%\" style=\"text-align : left\"");
            }
            if (in_tag.getStyleClass() != null) {
                in_buffer.append(" class='");
                in_buffer.append(in_tag.getStyleClass());
                in_buffer.append("'");
            }
            in_buffer.append(">");
            //Skin lc_skin = getSkin(in_tag.getPageContext());
            Skin lc_skin = LayoutUtils.getSkin(in_tag.getPageContext().getSession());
            if ((l_currentPage+1) * l_maxPageItems < in_tag.getSize()) {
                in_buffer.append("<a href=\"");
                in_buffer.append(" javascript:updateCollection('"+((HttpServletResponse)in_tag.getPageContext().getResponse()).encodeURL(in_tag.getURL(l_currentPage+1))+"');");
                in_buffer.append("\">");

                String lc_nextImgPath = lc_skin.getProperty(in_tag.getNextImgKey());
                String lc_nextLabel = lc_skin.getProperty(in_tag.getNextMsgKey());
                if (lc_nextImgPath == null || lc_nextImgPath.length()==0) {
                    in_buffer.append(lc_nextLabel);
                } else {
                    in_buffer.append("<img src='");
                    in_buffer.append(lc_skin.getImageDirectory(in_tag.getPageContext().getRequest()));
                    in_buffer.append("/");
                    in_buffer.append(lc_nextImgPath);
                    in_buffer.append("' border='0' alt='");
                    in_buffer.append(lc_nextLabel);
                    in_buffer.append("'>");
                }
                in_buffer.append("</a>");
            }
            in_buffer.append("</td>\n");
        } else{
            super.doPrintNext(in_tag, in_buffer, l_maxPageItems,  l_currentPage);
        }
        in_buffer.append("</tr></table></td>");
    }

    /**
     * added by ale on 23-07-2007
     * @param in_tag
     * @param in_buffer
     * @param l_currentPage
     */
    public void doPrintPrevious(PagerTag in_tag, StringBuffer in_buffer, int l_currentPage) {
        in_buffer.append("<td><table><tr>");
        String ajax = ((AjaxForwardPagerTag)in_tag).getAjax();
        if(ajax!=null && ajax.toLowerCase().equals("true")) {
            // Prev section
            in_buffer.append("<td");
            if (in_tag.getAlign()==null) {
                in_buffer.append(" width=\"50%\" style=\"text-align : right\"");
            }
            if (in_tag.getStyleClass() != null) {
                in_buffer.append(" class='");
                in_buffer.append(in_tag.getStyleClass());
                in_buffer.append("'");
            }
            in_buffer.append(">");
            if (l_currentPage >= 1) {
                PageContext pg = in_tag.getPageContext();
                in_buffer.append("<a href=\"");
                //in_buffer.append(((HttpServletResponse)pg.getResponse()).encodeURL(in_tag.getURL(l_currentPage-1)));
                in_buffer.append(" javascript:updateCollection('"+((HttpServletResponse)pg.getResponse()).encodeURL(in_tag.getURL(l_currentPage-1))+"');");
                in_buffer.append("\">");

                //String lc_previousImgPath = getSkin(pg).getProperty(in_tag.getPreviousImgKey());
                String lc_previousImgPath = LayoutUtils.getSkin(pg.getSession()).getProperty(in_tag.getPreviousImgKey());
                //String lc_previousLabel = getSkin(pg).getProperty(in_tag.getPreviousMsgKey());
                String lc_previousLabel = LayoutUtils.getSkin(pg.getSession()).getProperty(in_tag.getPreviousMsgKey());
                if (lc_previousImgPath == null || lc_previousImgPath.length()==0) {
                    in_buffer.append(lc_previousLabel);
                } else {
                    in_buffer.append("<img src='");
                    //in_buffer.append(getSkin(pg).getImageDirectory(pg.getRequest()));
                    in_buffer.append(LayoutUtils.getSkin(pg.getSession()).getImageDirectory(pg.getRequest()));
                    in_buffer.append("/");
                    in_buffer.append(lc_previousImgPath);
                    in_buffer.append("' border='0' alt='");
                    in_buffer.append(lc_previousLabel);
                    in_buffer.append("'>");
                }
                in_buffer.append("</a>");
		}
		in_buffer.append("</td>\n");
        }else{
            super.doPrintPrevious(in_tag, in_buffer,  l_currentPage);
        }
        in_buffer.append("</tr></table></td>");
    }
}
