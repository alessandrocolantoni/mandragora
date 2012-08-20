package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name="NODE121")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node121VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3176705773607416627L;
	
	@Column(name="ID_NODE121")	
	@Id	
	private String idNode121;
	
	@Column(name="DESCRIPTION")
    private String description;
    
	@Column(name="NOTE121")
	private String note121;

    public String getIdNode121() {
        return idNode121;
    }

    public void setIdNode121(String idNode121) {
        this.idNode121 = idNode121;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote121() {
        return note121;
    }

    public void setNote121(String note121) {
        this.note121 = note121;
    }
}