package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class SalesDivisionVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1824938620671083360L;
	
	@Column(name="ID_SALESDIVISION")
	private String idSalesDivision;
	
	@ManyToOne(targetEntity=SalesManagerVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_SALESMANAGER", referencedColumnName="ID_SALESMANAGER") })		
	private SalesManagerVO salesManagerVO;

	public String getIdSalesDivision() {
		return idSalesDivision;
	}

	public void setIdSalesDivision(String idSalesDivision) {
		this.idSalesDivision = idSalesDivision;
	}

	public SalesManagerVO getSalesManagerVO() {
		return salesManagerVO;
	}

	public void setSalesManagerVO(SalesManagerVO salesManagerVO) {
		this.salesManagerVO = salesManagerVO;
	}
	
	
}
