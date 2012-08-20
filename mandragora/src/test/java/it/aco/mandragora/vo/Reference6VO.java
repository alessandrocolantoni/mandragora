package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="REFERENCE6")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Reference6VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8253625286589168068L;
	
	@Column(name="ID_REFERENCE6")	
	@Id	
	private String idReference6;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdReference6() {
        return idReference6;
    }

    public void setIdReference6(String idReference6) {
        this.idReference6 = idReference6;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}