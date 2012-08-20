package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="PERSON_ROLE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonRoleVO extends ValueObject implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -8154749570124290604L;
	
	
	@EmbeddedId
	@AssociationOverrides( {
		@AssociationOverride(name = "personVO", joinColumns = { @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON") }),
		@AssociationOverride(name = "roleVO", joinColumns = { @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE") })
	})
	private PersonRoleVOPK personRoleVOPK;
	
	@Transient
	private Integer idPerson;
	
	@Transient
    private Integer idRole;
    
	@Column(name="NOTE")
	private String note;

    @Transient
    private RoleVO roleVO;

    public Integer getIdPerson() {
        //return idPerson;
    	if(personRoleVOPK!=null){
    		if(personRoleVOPK.getPersonVO()!=null)
    			return personRoleVOPK.getPersonVO().getIdPerson();
    		else return null;
    	}else{
    		return idPerson;
    	}
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdRole() {
//        return idRole;
    	if(personRoleVOPK!=null){
    		if(personRoleVOPK.getRoleVO()!=null)
    			return personRoleVOPK.getRoleVO().getIdRole();
    		else return null;
    	}else{
    		return idRole;
    	}
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public RoleVO getRoleVO() {
        //return roleVO;
    	if(personRoleVOPK!=null) 
    		return personRoleVOPK.getRoleVO();
    	else return roleVO;
    }

    public void setRoleVO(RoleVO roleVO) {
        this.roleVO = roleVO;
    }

	public PersonRoleVOPK getPersonRoleVOPK() {
		return personRoleVOPK;
	}

	public void setPersonRoleVOPK(PersonRoleVOPK personRoleVOPK) {
		this.personRoleVOPK = personRoleVOPK;
	}
    
    
}