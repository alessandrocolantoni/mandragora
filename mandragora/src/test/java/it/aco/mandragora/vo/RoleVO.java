package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ROLE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class RoleVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 641265594498701676L;
	
	
	@Column(name="ID_ROLE")	
	@Id	
	private Integer idRole;
	
	@Column(name="ROLENAME")
    private String roleName;

	@OneToMany(mappedBy = "rolePermissionVOPK.roleVO", targetEntity = RolePermissionVO.class, fetch = FetchType.LAZY)
    Collection<RolePermissionVO> rolePermissionVOs;


    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Collection<RolePermissionVO> getRolePermissionVOs() {
        return rolePermissionVOs;
    }

    public void setRolePermissionVOs(Collection<RolePermissionVO> rolePermissionVOs) {
        this.rolePermissionVOs = rolePermissionVOs;
    }
}