package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="COPYNODE33")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode33VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1310740529449729536L;
	
	@Column(name="ID_COPYNODE33")	
	@Id	
	private String idCopyNode33;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode33() {
        return idCopyNode33;
    }

    public void setIdCopyNode33(String idCopyNode33) {
        this.idCopyNode33 = idCopyNode33;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}