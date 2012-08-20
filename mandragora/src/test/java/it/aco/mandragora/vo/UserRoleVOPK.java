package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class UserRoleVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5498509427877741154L;
	
	
	
	@ManyToOne(targetEntity=UserVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_USER", referencedColumnName="ID_USER") })	
	private UserVO userVO;
	
	@ManyToOne(targetEntity=RoleVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ROLE", referencedColumnName="ID_ROLE") })	
	private RoleVO roleVO;

	public UserVO getUserVO() {
		return userVO;
	}

	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}

	public RoleVO getRoleVO() {
		return roleVO;
	}

	public void setRoleVO(RoleVO roleVO) {
		this.roleVO = roleVO;
	}


	


	
}
