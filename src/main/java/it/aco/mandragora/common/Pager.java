//---------------------------------------------------------
// Application: Infranet
// Authors     : Karapan Sapi Struts Generator-Domenico Fioravanti-Alessandro Colantoni
// File       : Pager.java
//
// using Karapan Sapi Struts Generator
//---------------------------------------------------------
//
//




//TODO creo que esto ya se puede tirar!!!!!!!!!!!!!!


package it.aco.mandragora.common;

import java.util.*;
public class Pager {
  private static int MAX_PAGE_INDEX = 15;
  private static String HEADER = "Risultati ricerca";
  static {
    ResourceBundle prop = ResourceBundle.getBundle("resources.application");
    try {
      HEADER = prop.getString("pager.header.title");
    } catch (Exception e) {
    }
    try {
      MAX_PAGE_INDEX = Integer.parseInt(prop.getString("pager.max.page.index"));
    } catch (Exception e) {
    }
  }

  /*
  public static String generate(int offset, int length, int size, String url) {
    if (length > size) {
      String pref;
      if (url.indexOf("?") > -1) {
        pref = "&";
      } else {
        pref = "?";
      }
      String header = "<font face='Helvetica' size='-1'>"+HEADER+": ";
      if (offset > 0) {
        header += "&nbsp;<a href=\""+url+pref+"pager.offset="+(offset-size)+"\">[<< Prev]</a>\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size;i+=size) {
        if (i == offset) {
          header += "<b>"+(i/size+1)+"</b>\n";
        } else {
          header += "&nbsp;<a href=\""+url+pref+"pager.offset="+i+"\">"+(i/size+1)+"</a>\n";
        }
      }
      if(offset < length - size) {
        header += "&nbsp;<a href=\""+url+pref+"pager.offset="+((int)offset+(int)size)+"\">[Next >>]</a>\n";
      }
      header += "</font>";
      return header;
    } else {
      return "";
    }
  }
  */
  //Modifica DOMENICO
  public static String generate(int offset, int length, int size, String url) {
    if (length > size) {
      String pref;
      String header;
      if (url.indexOf("?") > -1) {
        pref = "&";
      } else {
        pref = "?";
      }
      if(length-offset<size) {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(length)+"): ";
      } else {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(offset+size)+"): ";
      }
      if (offset > 0) {
        header += "&nbsp;<a href=\""+url+pref+"pager.offset="+(offset-size)+"\">[<< Prev]</a>\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      if (start<0) start=0; // added by Alessandro Colantoni on 29/06/2005
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size+1;i+=size) {
        if(i>=0){
	 if (i == offset) {
            header += "<b>"+(i/size+1)+"</b>\n";
          } else {
            header += "&nbsp;<a href=\""+url+pref+"pager.offset="+i+"\">"+(i/size+1)+"</a>\n";
          }
	}
      }
      if(offset < length - size) {
        header += "&nbsp;<a href=\""+url+pref+"pager.offset="+((int)offset+(int)size)+"\">[Next >>]</a>\n";
      }
      header += "</font>";
      return header;
    } else {
            String header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length;
            header += "</font>";
      return header;
    }
  }
  //Domenico
  public static String generate(int offset, int length, int size, String url, String name) {
    if (length > size) {
      String pref;
      String header;
      if (url.indexOf("?") > -1) {
        pref = "&";
      } else {
        pref = "?";
      }
      if(length-offset<size) {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(length)+"): ";
      } else {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(offset+size)+"): ";
      }
      if (offset > 0) {
        header += "&nbsp;<a href=\""+url+pref+"pager"+name+".offset="+(offset-size)+"\">[<< Prev]</a>\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      if (start<0) start=0; // added by Alessandro Colantoni on 29/06/2005
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size+1;i+=size) {
        if (i == offset) {
          header += "<b>"+(i/size+1)+"</b>\n";
        } else {
          header += "&nbsp;<a href=\""+url+pref+"pager"+name+".offset="+i+"\">"+(i/size+1)+"</a>\n";
        }
      }
      if(offset < length - size) {
        header += "&nbsp;<a href=\""+url+pref+"pager"+name+".offset="+((int)offset+(int)size)+"\">[Next >>]</a>\n";
      }
      header += "</font>";
      return header;
    } else {
            String header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length;
            header += "</font>";
      return header;
    }
  }
  //Alessandro
  public static String generateForSubmit_old(int offset, int length, int size, String formName,  String fieldName) {
    if (length > size) {
      String pref;
      String header;
      header="<h2 id=\"anchor\"></h2>&nbsp;";

      if(length-offset<size) {
        header += "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(length)+"): ";
      } else {
        header += "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(offset+size)+"): ";
      }
      if (offset > 0) {
        header += "&nbsp;<a href=\"#anchor\" onclick=\"document."+formName+"."+fieldName+"="+(offset-size)+";document."+formName+".submit();\">[<< Prev]</a>\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      if (start<0) start=0; // added by Alessandro Colantoni on 29/06/2005
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size+1;i+=size) {
        if(i>=0){
          if (i == offset) {
                 header += "<b>"+(i/size+1)+"</b>\n";
          } else {
            header += "&nbsp;<a href=\"#anchor\" onclick=\"alert('prova');this.document."+formName+".submit();\">"+(i/size+1)+"</a>\n";
          }
        }
      }
      if(offset < length - size) {
        header += "&nbsp;<a href=\"#anchor\" onclick=\"document."+formName+"."+fieldName+"="+((int)offset+(int)size)+";document."+formName+".submit();\">[Next >>]</a>\n";
      }
      header += "</font>";
      return header;
    } else {
            String header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length;
            header += "</font>";
      return header;
    }
  }

  //Alessandro
  public static String generateForSubmit(int offset, int length, int size, String formName,  String fieldName) {
    if (length > size) {
      String pref;
      String header;
      header="";
      if(length-offset<size) {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(length)+"): ";

      } else {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(offset+size)+"): ";
      }
      if (offset > 0) {
        //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+(offset-size)+"\">[<< Prev]</a>\n";
        header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\"<<\" onclick=\"document."+formName+"."+fieldName+".value='"+(offset-size)+"';\">\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      if (start<0) start=0; // added by Alessandro Colantoni on 29/06/2005
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size+1;i+=size) {
        if(i>=0){
	 if (i == offset) {
            header += "<b>"+(i/size+1)+"</b>\n";
          } else {
            //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+i+"\">"+(i/size+1)+"</a>\n";
            header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\""+(i/size+1)+"\" onclick=\"document."+formName+"."+fieldName+".value='"+i+"';\">\n";
          }
	}
      }
      if(offset < length - size) {
        //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+((int)offset+(int)size)+"\">[Next >>]</a>\n";
        header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\">>\" onclick=\"document."+formName+"."+fieldName+".value='"+((int)offset+(int)size)+"';\">\n";
      }
      header += "</font>";
      return header;
    } else {
            String header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length;
            header += "</font>";
      return header;
    }
  }

  //Alessandro
  public static String generateForSubmit(int offset, int length, int size, String formName,  String fieldName, String onclick) {
    if (length > size) {
      String pref;
      String header;
      header="";
      if(length-offset<size) {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(length)+"): ";

      } else {
        header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length+" ("+(offset+1)+"-->"+(offset+size)+"): ";
      }
      if (offset > 0) {
        //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+(offset-size)+"\">[<< Prev]</a>\n";
        header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\"<<\" onclick=\"document."+formName+"."+fieldName+".value='"+(offset-size)+"';"+onclick+"\">\n";
      }
      int start;
      int radius = MAX_PAGE_INDEX/2*size;
      if (offset < radius) {
        start = 0;
      } else if(offset < length-radius) {
        start = offset - radius;
      } else {
        start = (length/size-MAX_PAGE_INDEX)*size;
      }
      if (start<0) start=0; // added by Alessandro Colantoni on 29/06/2005
      for(int i=start;i<length && i < start + MAX_PAGE_INDEX*size+1;i+=size) {
        if(i>=0){
	 if (i == offset) {
            header += "<b>"+(i/size+1)+"</b>\n";
          } else {
            //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+i+"\">"+(i/size+1)+"</a>\n";
            header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\""+(i/size+1)+"\" onclick=\"document."+formName+"."+fieldName+".value='"+i+"';"+onclick+"\">\n";
          }
	}
      }
      if(offset < length - size) {
        //header += "&nbsp;<a href=\""+url+pref+"pager.offset="+((int)offset+(int)size)+"\">[Next >>]</a>\n";
        header += "&nbsp;<input type=\"submit\" name=\"strutsButton\" value=\">>\" onclick=\"document."+formName+"."+fieldName+".value='"+((int)offset+(int)size)+"';"+onclick+"\">\n";
      }
      header += "</font>";
      return header;
    } else {
            String header = "<font face='Helvetica' font-size='8px'>"+HEADER+" "+length;
            header += "</font>";
      return header;
    }
  }
}