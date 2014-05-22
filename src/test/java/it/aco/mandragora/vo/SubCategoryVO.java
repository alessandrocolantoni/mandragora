package it.aco.mandragora.vo;

import java.util.Collection;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="SUBCATEGORY")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SubCategoryVO extends ValueObject {
	
	@Transient
    private String idCategory;
	
	@Transient
    private String idSubCategory;
    
	
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idSubCategory",column= @Column(name="ID_SUBCATEGORY"))
    })
    @AssociationOverrides( {
			@AssociationOverride(name = "categoryVO", joinColumns = { @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY") })
	})
    private SubCategoryVOPK subCategoryVOPK;
    
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "productVOPK.subCategoryVO", targetEntity = ProductVO.class, fetch = FetchType.LAZY)
    private Collection<ProductVO> productVOs;

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getIdSubCategory() {
        return idSubCategory;
    }

    public void setIdSubCategory(String idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<ProductVO> getProductVOs() {
        return productVOs;
    }

    public void setProductVOs(Collection<ProductVO> productVOs) {
        this.productVOs = productVOs;
    }

	public SubCategoryVOPK getSubCategoryVOPK() {
		return subCategoryVOPK;
	}

	public void setSubCategoryVOPK(SubCategoryVOPK subCategoryVOPK) {
		this.subCategoryVOPK = subCategoryVOPK;
	}
    
    
}