package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PERSON")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonVO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8448186701292849548L;
	
	@Column(name="ID_PERSON")	
	@Id	
	private Integer idPerson;
	
	@Column(name="FIRSTNAME")
    private String firstName;
	
	@Column(name="LASTNAME")
    private String lastName;
    
	@OneToMany(mappedBy = "personRoleVOPK.personVO", targetEntity = PersonRoleVO.class, fetch = FetchType.LAZY, cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
    private Collection<PersonRoleVO> personRoleVOs;

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
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

    public Collection<PersonRoleVO> getPersonRoleVOs() {
        return personRoleVOs;
    }

    public void setPersonRoleVOs(Collection<PersonRoleVO> personRoleVOs) {
        this.personRoleVOs = personRoleVOs;
    }



}