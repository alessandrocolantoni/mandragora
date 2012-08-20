package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name="ACTOR")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ActorVO extends ValueObject implements Serializable{
    
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1363976714965848624L;
	
	@Column(name="ID_ACTOR")	
	@Id	
	private Integer idActor;
	
	@Column(name="FIRSTNAME")
    private String firstName;
	
	@Column(name="LASTNAME")
    private String lastName;

    public Integer getIdActor() {
        return idActor;
    }

    public void setIdActor(Integer idActor) {
        this.idActor = idActor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}