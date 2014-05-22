package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class CompanyVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -951878550685928136L;

	
	@Column(name="ID_COMPANY")
	private Integer idCompany;
	
	@ManyToOne(targetEntity=CompanyGroupVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COMPANY_GROUP", referencedColumnName="ID_COMPANY_GROUP") })		
	private CompanyGroupVO companyGroupVO;

	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

	public CompanyGroupVO getCompanyGroupVO() {
		return companyGroupVO;
	}

	public void setCompanyGroupVO(CompanyGroupVO companyGroupVO) {
		this.companyGroupVO = companyGroupVO;
	}
	
	
	
}
