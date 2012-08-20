package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="NODE33")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node33VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6296683091746364765L;
	
	@Column(name="ID_NODE33")	
	@Id	
	private String idNode33;
	
	@Column(name="DESCRIPTION")
    private String description;
    
	@Column(name="NOTE33")
	private String note33;

    public String getIdNode33() {
        return idNode33;
    }

    public void setIdNode33(String idNode33) {
        this.idNode33 = idNode33;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote33() {
        return note33;
    }

    public void setNote33(String note33) {
        this.note33 = note33;
    }
}