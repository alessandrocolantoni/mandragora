package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class ProductVOPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1957574107351922675L;
	
	@Column(name="ID_PRODUCT")
	private String idProduct;
	
	
	@ManyToOne(targetEntity=SubCategoryVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_CATEGORY", referencedColumnName="ID_CATEGORY"),@JoinColumn(name="ID_SUBCATEGORY", referencedColumnName="ID_SUBCATEGORY") })
	private SubCategoryVO subCategoryVO ;


	public String getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}


	public SubCategoryVO getSubCategoryVO() {
		return subCategoryVO;
	}


	public void setSubCategoryVO(SubCategoryVO subCategoryVO) {
		this.subCategoryVO = subCategoryVO;
	}
	
	
	
	

}
