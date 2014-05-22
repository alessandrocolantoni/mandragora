package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class RolePermissionVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6994923057227670217L;
	
	@ManyToOne(targetEntity=RoleVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ROLE", referencedColumnName="ID_ROLE") })		
	private RoleVO roleVO;
	
	@ManyToOne(targetEntity=PermissionVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PERMISSION", referencedColumnName="ID_PERMISSION") })		
	private PermissionVO permisssionVO;
	
	
	
	public RoleVO getRoleVO() {
		return roleVO;
	}
	public void setRoleVO(RoleVO roleVO) {
		this.roleVO = roleVO;
	}
	public PermissionVO getPermisssionVO() {
		return permisssionVO;
	}
	public void setPermisssionVO(PermissionVO permisssionVO) {
		this.permisssionVO = permisssionVO;
	}
	
	
	
	

}
