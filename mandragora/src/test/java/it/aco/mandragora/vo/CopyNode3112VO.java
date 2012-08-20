package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="COPYNODE3112")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode3112VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4162495129916067328L;
	
	@Column(name="ID_COPYNODE3112")	
	@Id	
	private String idCopyNode3112;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode3112() {
        return idCopyNode3112;
    }

    public void setIdCopyNode3112(String idCopyNode3112) {
        this.idCopyNode3112 = idCopyNode3112;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}