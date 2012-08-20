package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="BOOK")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class BookVO extends ValueObject  implements Serializable{
	
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -8317215164119724450L;
	
	@Column(name="ID_BOOK")	
	@Id	
	private String idBook;
	
	@Column(name="TITLE")	
    private String title;


    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        String result = "BookVO [";
        result += "idBook: " + ((idBook==null)?"":idBook.toString());
        result += ",\n title: " + ((title==null)?"":title.toString());
        result += "]";
        return result;
    }
}
