package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class PersonRoleVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4510025671134620770L;

	@ManyToOne(targetEntity=PersonVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PERSON", referencedColumnName="ID_PERSON") })		
	private PersonVO personVO;
	
	
	@ManyToOne(targetEntity=RoleVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ROLE", referencedColumnName="ID_ROLE") })		
	private RoleVO roleVO;

	public PersonVO getPersonVO() {
		return personVO;
	}

	public void setPersonVO(PersonVO personVO) {
		this.personVO = personVO;
	}

	public RoleVO getRoleVO() {
		return roleVO;
	}

	public void setRoleVO(RoleVO roleVO) {
		this.roleVO = roleVO;
	}
	
	
	
}
