package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="REFERENCE4")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Reference4VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 749737012492315288L;
	
	
	@Column(name="ID_REFERENCE4")	
	@Id	
	private String idReference4;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdReference4() {
        return idReference4;
    }

    public void setIdReference4(String idReference4) {
        this.idReference4 = idReference4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}