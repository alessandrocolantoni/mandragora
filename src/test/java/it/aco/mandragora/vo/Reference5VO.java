package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="REFERENCE5")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Reference5VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -916983218550142394L;
	
	
	@Column(name="ID_REFERENCE5")	
	@Id	
	private String idReference5;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdReference5() {
        return idReference5;
    }

    public void setIdReference5(String idReference5) {
        this.idReference5 = idReference5;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}