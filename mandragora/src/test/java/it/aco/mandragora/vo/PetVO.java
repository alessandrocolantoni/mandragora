package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="PET")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PetVO extends ValueObject  implements Serializable{
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2355247561360824513L;

	@Column(name="ID_PET")	
	@Id	
    private String idPet;
	
	@Column(name="NAME")
    private String name;

    public String getIdPet() {
        return idPet;
    }

    public void setIdPet(String idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String result = "PetVO [";
        result += "idPet: " + ((idPet==null)?"":idPet.toString());
        result += ",\n name: " + ((name==null)?"":name.toString());
        result += "]";
        return result;
    }
}