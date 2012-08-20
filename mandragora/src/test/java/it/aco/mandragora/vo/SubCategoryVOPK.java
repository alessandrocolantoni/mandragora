package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;


@Embeddable
public class SubCategoryVOPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -639407455164384272L;
	
	@Column(name="ID_SUBCATEGORY")
	private String idSubCategory;
	
	@ManyToOne(targetEntity=CategoryVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_CATEGORY", referencedColumnName="ID_CATEGORY") })		
	private CategoryVO categoryVO;

	public String getIdSubCategory() {
		return idSubCategory;
	}

	public void setIdSubCategory(String idSubCategory) {
		this.idSubCategory = idSubCategory;
	}

	public CategoryVO getCategoryVO() {
		return categoryVO;
	}

	public void setCategoryVO(CategoryVO categoryVO) {
		this.categoryVO = categoryVO;
	}
	
	

}
