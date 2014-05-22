package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SUB_TASK")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SubTaskVO extends ValueObject implements Serializable{
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3026455758286709738L;
	
	
	@Transient
	private Integer idTask;
	
	@Transient
    private Integer idSubTask;
    
    @EmbeddedId
    @AssociationOverrides( {
			@AssociationOverride(name = "taskVO", joinColumns = { @JoinColumn(name = "ID_TASK", referencedColumnName = "ID_TASK") })
	})
	@AttributeOverrides({
        @AttributeOverride(name="idSubTask",column= @Column(name="ID_SUB_TASK"))
    })
    private SubTaskVOPK subTaskVOPK;
    
    @Column(name="SUBTASKNAME")
    private String subTaskName;

    public Integer getIdTask() {
        //return idTask;
    	if(subTaskVOPK!=null){
    		if(subTaskVOPK.getTaskVO()!=null)
    			return subTaskVOPK.getTaskVO().getIdTask();
    		else return null;
    	}else{
    		return idTask;
    	}
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public Integer getIdSubTask() {
        //return idSubTask;
    	if(subTaskVOPK!=null){
    		return subTaskVOPK.getIdSubTask();
    	}else{
    		return idSubTask;
    	}
    }

    public void setIdSubTask(Integer idSubTask) {
        this.idSubTask = idSubTask;
    }

    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

	public SubTaskVOPK getSubTaskVOPK() {
		return subTaskVOPK;
	}

	public void setSubTaskVOPK(SubTaskVOPK subTaskVOPK) {
		this.subTaskVOPK = subTaskVOPK;
	}
    
    
}