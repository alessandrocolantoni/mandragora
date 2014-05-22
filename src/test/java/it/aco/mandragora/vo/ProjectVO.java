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
@Table(name="PROJECT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ProjectVO extends ValueObject implements Serializable{
    
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5756222276425247162L;
	
	@Column(name="ID_PROJECT")	
	@Id	
	private Integer idProject;
	
	
	@Column(name="TITLE")	
    private String title;
	
	@Column(name="DESCRIPTION")	
    private String description;

	@OneToMany(mappedBy = "personProjectVOPK.projectVO", targetEntity = PersonProjectVO.class, fetch = FetchType.LAZY)
    private Collection<PersonProjectVO> personProjectVOs;

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<PersonProjectVO> getPersonProjectVOs() {
        return personProjectVOs;
    }

    public void setPersonProjectVOs(Collection<PersonProjectVO> personProjectVOs) {
        this.personProjectVOs = personProjectVOs;
    }
}