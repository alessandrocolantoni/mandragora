package fr.improve.struts.taglib.layout.util;

import fr.improve.struts.taglib.layout.menu.MenuComponent;
import fr.improve.struts.taglib.layout.treeview.TreeItemInfo;
import fr.improve.struts.taglib.layout.treeview.TreeViewTag;
import fr.improve.struts.taglib.layout.skin.Skin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EncodeUrlBasicTreeview extends BasicTreeview implements TreeviewInterface{
    // Render the item image.
	public void renderImage(StringBuffer buffer, HttpServletRequest in_request, TreeItemInfo in_info, MenuComponent in_item) {
		if (in_item.getImage()!=null) {
			if (in_info.hasSubMenus) {
			    // javascript to fully collapse or expand a node
			    buffer.append("<a href=\"");
			    if (!in_info.useIndirection) {
			        buffer.append("javascript://\"");
			    } else {
                    buffer.append(in_request.getContextPath());
			        buffer.append("/");
			        buffer.append(LayoutUtils.getSkin(in_request.getSession()).getProperty(Skin.TREEVIEW_ACTION, TreeViewTag.DEFAULT_TREEVIEW_ACTION));
			        // start added by alessandro colantoni on 27-03-2007
                    buffer.append(";jsessionid="+in_request.getSession().getId());
			        // end added by alessandro colantoni on 27-03-2007
                    buffer.append("?open=");
			        buffer.append(in_info.path);
			        buffer.append("&bundle=");
			        buffer.append(in_info.bundle);
			        buffer.append("&name=");
			        buffer.append(in_info.name);
			        buffer.append("&class=");
			        buffer.append(in_info.styleClass);
			        buffer.append("\" id=\"treeViewNode");
			        buffer.append(in_info.path);
			        buffer.append("\"");
			    }

			    buffer.append(" onclick=\"return changeTreeAndSubtrees('");


	//	                buffer.append("<a href=\"");
	//	                buffer.append("javascript://\" onclick=\"return changeTreeAndSubtrees('");
			    buffer.append(in_info.path);
			    buffer.append("');");
			    buffer.append("\" target=\"treeFrame\">");
			}

			// Image
			buffer.append("<img src=\"");
			buffer.append(in_info.imageDirectory);
			buffer.append("/");
			buffer.append(in_item.getImage());
			buffer.append("\" border=\"0\">");

			if (in_info.hasSubMenus) {
				// javascript to fully collapse or expand a node
			    buffer.append("</a>&nbsp;");
			}
		}
	}

    public void startTreeUrl(StringBuffer buffer, HttpServletRequest in_request, TreeItemInfo in_info, String lc_closeImage, String lc_openImage) {
		buffer.append("<a href=\"");
		if (!in_info.useIndirection) {
			buffer.append("javascript://\" onclick=\"return changeTree('");
		} else {
			buffer.append(in_request.getContextPath());
			buffer.append("/");
			buffer.append(LayoutUtils.getSkin(in_request.getSession()).getProperty(Skin.TREEVIEW_ACTION, TreeViewTag.DEFAULT_TREEVIEW_ACTION));
            // start added by alessandro colantoni on 27-03-2007
            buffer.append(";jsessionid="+in_request.getSession().getId());
            // end added by alessandro colantoni on 27-03-2007
			buffer.append("?open=");
			buffer.append(in_info.path);
			buffer.append("&bundle=");
			buffer.append(in_info.bundle);
			buffer.append("&name=");
			buffer.append(in_info.name);
			buffer.append("&class=");
			buffer.append(in_info.styleClass);
			buffer.append("\" id=\"treeViewNode");
			buffer.append(in_info.path);
			buffer.append("\" onclick=\"return changeTree('");
		}
		buffer.append(in_info.path);
		buffer.append("','");
		buffer.append(in_info.imageDirectory);
		buffer.append("/");
		buffer.append(lc_openImage);
		buffer.append("','");
		buffer.append(in_info.imageDirectory);
		buffer.append("/");
		buffer.append(lc_closeImage);
		buffer.append("');");
		buffer.append("\" target=\"treeFrame\">");
	}
}
