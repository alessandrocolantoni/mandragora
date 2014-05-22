package it.aco.mandragora.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="COPYNODE3111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode3111VO extends ValueObject {
   
	@Column(name="ID_COPYNODE3111")	
	@Id	
	private String idCopyNode3111;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode3111() {
        return idCopyNode3111;
    }

    public void setIdCopyNode3111(String idCopyNode3111) {
        this.idCopyNode3111 = idCopyNode3111;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}