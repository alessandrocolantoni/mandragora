package fr.improve.struts.taglib.layout.collection;


public class AjaxForwardCollectionTag extends CollectionTag{

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

}
