package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="NODE3111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node3111VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5349518472782482387L;
	
	@Column(name="ID_NODE3111")	
	@Id
	private String idNode3111;
	
	@Column(name="DESCRIPTION")	
    private String description;
	
	@Column(name="NOTE3111")	
    private String note3111;

    public String getIdNode3111() {
        return idNode3111;
    }

    public void setIdNode3111(String idNode3111) {
        this.idNode3111 = idNode3111;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote3111() {
        return note3111;
    }

    public void setNote3111(String note3111) {
        this.note3111 = note3111;
    }
}