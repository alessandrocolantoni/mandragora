package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="COPYNODE121")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode121VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4951216190383574318L;
	
	
	@Column(name="ID_COPYNODE121")	
	@Id	
	private String idCopyNode121;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode121() {
        return idCopyNode121;
    }

    public void setIdCopyNode121(String idCopyNode121) {
        this.idCopyNode121 = idCopyNode121;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}