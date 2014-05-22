package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;



@Embeddable
public class PersonProjectVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4369121768387727041L;
	
	
	@ManyToOne(targetEntity=PersonVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PERSON", referencedColumnName="ID_PERSON") })		
	private PersonVO personVO;
	
	

	@ManyToOne(targetEntity=ProjectVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PROJECT", referencedColumnName="ID_PROJECT") })	
	private ProjectVO projectVO;

	public PersonVO getPersonVO() {
		return personVO;
	}

	public void setPersonVO(PersonVO personVO) {
		this.personVO = personVO;
	}

	public ProjectVO getProjectVO() {
		return projectVO;
	}

	public void setProjectVO(ProjectVO projectVO) {
		this.projectVO = projectVO;
	}
	
	
	

}
