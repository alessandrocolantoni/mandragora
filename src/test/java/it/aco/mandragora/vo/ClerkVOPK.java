package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class ClerkVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -924269692461539829L;
	
	@Column(name="ID_CLERK")
	private String idClerk;
	
	@ManyToOne(targetEntity=SalesAssistantVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_SALESASSISTANT", referencedColumnName="ID_SALESASSISTANT") })		
	private SalesAssistantVO salesAssistantVO;

	public String getIdClerk() {
		return idClerk;
	}

	public void setIdClerk(String idClerk) {
		this.idClerk = idClerk;
	}

	public SalesAssistantVO getSalesAssistantVO() {
		return salesAssistantVO;
	}

	public void setSalesAssistantVO(SalesAssistantVO salesAssistantVO) {
		this.salesAssistantVO = salesAssistantVO;
	}
	
	
	

}
