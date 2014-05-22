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
@Table(name="USER_ROLE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class UserRoleVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8685884239531707992L;

	@Transient
	private String idUser;
    
    @Transient
    private Integer idRole;

    @Transient
    private RoleVO roleVO;

    @EmbeddedId
    @AssociationOverrides( {
			@AssociationOverride(name = "userVO", joinColumns = { @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER") }),
			@AssociationOverride(name = "roleVO", joinColumns = { @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE") })
	})
    private UserRoleVOPK userRoleVOPK;
    
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public RoleVO getRoleVO() {
        return roleVO;
    }

    public void setRoleVO(RoleVO roleVO) {
        this.roleVO = roleVO;
    }

    
    
    public UserRoleVOPK getUserRoleVOPK() {
		return userRoleVOPK;
	}

	public void setUserRoleVOPK(UserRoleVOPK userRoleVOPK) {
		this.userRoleVOPK = userRoleVOPK;
	}

	public String toString() {
        String result = "UserRoleVO [";
        result += "idUser: " + ((idUser==null)?"":idUser.toString());
        result += "idRole: " + ((idRole==null)?"":idRole.toString());
        result += "]";
        return result;
    }
}