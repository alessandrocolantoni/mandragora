package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class SubTaskVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -205855587470199201L;
	
	
	@Column(name="ID_SUB_TASK")	
	private Integer idSubTask;
	
	
	@ManyToOne(targetEntity=TaskVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TASK", referencedColumnName="ID_TASK") })		
	private TaskVO taskVO;
	
	
	
	public Integer getIdSubTask() {
		return idSubTask;
	}
	public void setIdSubTask(Integer idSubTask) {
		this.idSubTask = idSubTask;
	}
	public TaskVO getTaskVO() {
		return taskVO;
	}
	public void setTaskVO(TaskVO taskVO) {
		this.taskVO = taskVO;
	}
	
	
	

}
