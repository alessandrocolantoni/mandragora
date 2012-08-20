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
@Table(name="USER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class UserVO extends ValueObject implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6405807274541930698L;
	@Column(name="ID_USER")	
	@Id	
    private String idUser;
	
	@Column(name="FIRSTNAME")
    private String firstName;
	
	@Column(name="LASTNAME")
    private String lastName;


	@OneToMany(mappedBy = "userRoleVOPK.userVO", targetEntity = UserRoleVO.class, fetch = FetchType.LAZY)
    private Collection<UserRoleVO> userRoleVOs;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Collection<UserRoleVO> getUserRoleVOs() {
        return userRoleVOs;
    }

    public void setUserRoleVOs(Collection<UserRoleVO> userRoleVOs) {
        this.userRoleVOs = userRoleVOs;
    }

    public String toString() {
        String result = "UserVO [";
        result += "idUser: " + ((idUser==null)?"":idUser.toString());
        result += ",\n firstName: " + ((firstName==null)?"":firstName.toString());
        result += ",\n lastName: " + ((lastName==null)?"":lastName.toString());
        result += "]";
        return result;
    }
}