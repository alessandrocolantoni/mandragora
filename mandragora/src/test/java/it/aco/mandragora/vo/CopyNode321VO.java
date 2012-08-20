package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="COPYNODE321")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode321VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7784178633198291007L;
	
	@Column(name="ID_COPYNODE321")	
	@Id	
	private String idCopyNode321;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode321() {
        return idCopyNode321;
    }

    public void setIdCopyNode321(String idCopyNode321) {
        this.idCopyNode321 = idCopyNode321;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}