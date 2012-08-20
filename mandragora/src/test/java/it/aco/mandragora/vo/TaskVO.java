package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

//CREATE MEMORY TABLE TASK(ID_TASK INTEGER NOT NULL PRIMARY KEY,ID_PERSON INTEGER,ID_PROJECT INTEGER,TASKNAME VARCHAR(20),CONSTRAINT TASK_FK_1 FOREIGN KEY(ID_PERSON,ID_PROJECT) REFERENCES PERSON_PROJECT(ID_PERSON,ID_PROJECT))

@Entity
@Table(name="TASK")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TaskVO extends ValueObject implements Serializable{
	
	
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 7318668432555993633L;
	
	@Column(name="ID_TASK")	
	@Id	
	private Integer idTask;
    
	@Transient	
	private Integer idPerson;
	
	@Transient	
    private Integer idProject;
	
	
	@ManyToOne(targetEntity=PersonProjectVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PERSON", referencedColumnName="ID_PERSON"),
		@JoinColumn(name="ID_PROJECT", referencedColumnName="ID_PROJECT")
		})		
	private PersonProjectVO personProjectVO;
	
	
	@Column(name="TASKNAME")	
    private String taskName;


	@OneToMany(mappedBy = "subTaskVOPK.taskVO", targetEntity = SubTaskVO.class, fetch = FetchType.LAZY)
    private Collection<SubTaskVO> subTaskVOs;

    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Collection<SubTaskVO> getSubTaskVOs() {
        return subTaskVOs;
    }

    public void setSubTaskVOs(Collection<SubTaskVO> subTaskVOs) {
        this.subTaskVOs = subTaskVOs;
    }

	public PersonProjectVO getPersonProjectVO() {
		return personProjectVO;
	}

	public void setPersonProjectVO(PersonProjectVO personProjectVO) {
		this.personProjectVO = personProjectVO;
	}
    
    
    
}