package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9146954245103714926L;
	
	@ManyToOne(targetEntity=AdministrationVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ADMINISTRATION", referencedColumnName="ID_ADMINISTRATION")})
	private AdministrationVO administrationVO;
	
	@ManyToOne(targetEntity=ProductVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_CATEGORY", referencedColumnName="ID_CATEGORY"),
				@JoinColumn(name="ID_SUBCATEGORY", referencedColumnName="ID_SUBCATEGORY"),
				@JoinColumn(name="ID_PRODUCT", referencedColumnName="ID_PRODUCT") 
	})
	private ProductVO productVO;

	public AdministrationVO getAdministrationVO() {
		return administrationVO;
	}

	public void setAdministrationVO(AdministrationVO administrationVO) {
		this.administrationVO = administrationVO;
	}

	public ProductVO getProductVO() {
		return productVO;
	}

	public void setProductVO(ProductVO productVO) {
		this.productVO = productVO;
	}
	
	
	

}
