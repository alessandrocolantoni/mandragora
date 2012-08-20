package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="ROLE_PERMISSION")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class RolePermissionVO extends ValueObject implements Serializable{
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7114558119473105505L;
	
	@Transient	
	private Integer idRole;
	@Transient
    private String idPermission;
	@Transient
    private PermissionVO permissionVO;

    
    @EmbeddedId
    @AssociationOverrides( {
		@AssociationOverride(name = "permissionVO", joinColumns = { @JoinColumn(name = "ID_PERMISSION", referencedColumnName = "ID_PERMISSION") }),
		@AssociationOverride(name = "roleVO", joinColumns = { @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE") })
    })
    private RolePermissionVOPK rolePermissionVOPK;
    
    public Integer getIdRole() {
        //return idRole;
    	if(rolePermissionVOPK!=null){
    		if(rolePermissionVOPK.getRoleVO()!=null)
    			return rolePermissionVOPK.getRoleVO().getIdRole();
    		else return null;
    	}
    		
    	else return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getIdPermission() {
        //return idPermission;
    	if(rolePermissionVOPK!=null){
    		if(rolePermissionVOPK.getPermisssionVO()!=null)
    			return rolePermissionVOPK.getPermisssionVO().getIdPermission();
    		else return null;
    	}
    	else return idPermission;
    }

    public void setIdPermission(String idPermission) {
        this.idPermission = idPermission;
    }

    public PermissionVO getPermissionVO() {
        //return permissionVO;
    	if(rolePermissionVOPK!=null)
    		return rolePermissionVOPK.getPermisssionVO();
    	else return permissionVO;
    }

    public void setPermissionVO(PermissionVO permissionVO) {
        this.permissionVO = permissionVO;
    }

    
    
    
    public RolePermissionVOPK getRolePermissionVOPK() {
		return rolePermissionVOPK;
	}

	public void setRolePermissionVOPK(RolePermissionVOPK rolePermissionVOPK) {
		this.rolePermissionVOPK = rolePermissionVOPK;
	}

	public String toString() {
        String result = "RolePermissionVO [";
        result += "idRole: " + ((idRole==null)?"":idRole.toString());
        result += "idPermission: " + ((idPermission==null)?"":idPermission.toString());
        result += "]";
        return result;
    }
}