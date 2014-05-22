package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="PERMISSION")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PermissionVO extends ValueObject implements Serializable {
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2132217110500136969L;
	
	@Column(name="ID_PERMISSION")	
	@Id	
	private String idPermission;
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(String idPermission) {
        this.idPermission = idPermission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String result = "PermissionVO [";
        result += "idPermission: " + ((idPermission==null)?"":idPermission.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}