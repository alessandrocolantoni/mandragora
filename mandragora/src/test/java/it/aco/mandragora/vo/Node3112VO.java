package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="NODE3112")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node3112VO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4548692654622368979L;
	
	@Column(name="ID_NODE3112")	
	@Id
	private String idNode3112;
	
	@Column(name="DESCRIPTION")
    private String description;
    
	@Column(name="NOTE3112")
	private String note3112;

    public String getIdNode3112() {
        return idNode3112;
    }

    public void setIdNode3112(String idNode3112) {
        this.idNode3112 = idNode3112;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote3112() {
        return note3112;
    }

    public void setNote3112(String note3112) {
        this.note3112 = note3112;
    }
}