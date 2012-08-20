package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

//CREATE MEMORY TABLE PERSON_PROJECT(ID_PERSON INTEGER NOT NULL,ID_PROJECT INTEGER NOT NULL,ID_ROLE INTEGER,PRIMARY KEY(ID_PERSON,ID_PROJECT),CONSTRAINT PERSON_PROJECT_FK_1 FOREIGN KEY(ID_PERSON) REFERENCES PERSON(ID_PERSON),CONSTRAINT PERSON_PROJECT_FK_2 FOREIGN KEY(ID_PROJECT) REFERENCES PROJECT(ID_PROJECT),CONSTRAINT PERSON_PROJECT_FK_3 FOREIGN KEY(ID_ROLE) REFERENCES ROLE(ID_ROLE))



@Entity
@Table(name="PERSON_PROJECT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PersonProjectVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4193962499296442225L;
	

    @EmbeddedId
    @AssociationOverrides( {
			@AssociationOverride(name = "personVO", joinColumns = { @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON") }),
			@AssociationOverride(name = "projectVO", joinColumns = { @JoinColumn(name = "ID_PROJECT", referencedColumnName = "ID_PROJECT") })
	})
	private PersonProjectVOPK personProjectVOPK;
	
	
    @Transient
	private Integer idPerson;
    
    @Transient
    private Integer idProject;
    
    @Transient
    private Integer idRole;
    
    @Transient
    private String roleTitle;
    
    @Transient
    private String roleName;


    @Transient
    private PersonVO personVO;
    
    @ManyToOne(targetEntity=RoleVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ROLE", referencedColumnName="ID_ROLE") })		
	private RoleVO roleVO;

    
    @OneToMany(mappedBy = "personProjectVO", targetEntity = TaskVO.class, fetch = FetchType.LAZY)
    private Collection<TaskVO> taskVOs;

    public Integer getIdPerson() {
    	//return idPerson;
    	if(personProjectVOPK!=null){
    		if(personProjectVOPK.getPersonVO()!=null)
    			return personProjectVOPK.getPersonVO().getIdPerson();
    		else return null;
    	}else {
    		return idPerson;
    	}
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }
    
    public void setIdPerson() {
        if(this.idPerson!=null) this.idPerson = this.idPerson + 1000;
    }

    public Integer getIdProject() {
        //return idProject;
    	if(personProjectVOPK!=null){
    		if(personProjectVOPK.getProjectVO()!=null)
    			return personProjectVOPK.getProjectVO().getIdProject();
    		else return null;
    	}else {
    		return idProject;
    	}
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public Integer getIdRole() {
        //return idRole;
    	if(roleVO!=null) 
    		return roleVO.getIdRole();
    	else 
    		return idRole;
    	
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public PersonVO getPersonVO() {
        //return personVO;
    	if(personProjectVOPK!=null) 
    		return personProjectVOPK.getPersonVO();
    	else return personVO;
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

    public Collection<TaskVO> getTaskVOs() {
        return taskVOs;
    }

    public void setTaskVOs(Collection<TaskVO> taskVOs) {
        this.taskVOs = taskVOs;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

	public PersonProjectVOPK getPersonProjectVOPK() {
		return personProjectVOPK;
	}

	public void setPersonProjectVOPK(PersonProjectVOPK personProjectVOPK) {
		this.personProjectVOPK = personProjectVOPK;
	}
    
    
}