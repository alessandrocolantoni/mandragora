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
@Table(name="PRODUCT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ProductVO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2605187427888353923L;

	@Transient
	private String idCategory;
    
    @Transient
    private String idSubCategory;
    
    @Transient
    private String idProduct;
    
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idProduct",column= @Column(name="ID_PRODUCT"))
    })
    @AssociationOverrides( {
			@AssociationOverride(name = "subCategoryVO", joinColumns = { @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY"),@JoinColumn(name = "ID_SUBCATEGORY", referencedColumnName = "ID_SUBCATEGORY") })
	})
    private ProductVOPK productVOPK;
    
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="PRODUCTDESCRIPTION")
    private String productDescription;

    public String getIdCategory() {
    	if(productVOPK!=null){
    		return productVOPK.getSubCategoryVO().getSubCategoryVOPK().getCategoryVO().getIdCategory();
    	}
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getIdSubCategory() {
    	if(productVOPK!=null){
    		return productVOPK.getSubCategoryVO().getSubCategoryVOPK().getIdSubCategory();
    	}
        return idSubCategory;
    }

    public void setIdSubCategory(String idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public String getIdProduct() {
    	if(productVOPK!=null){
    		return productVOPK.getIdProduct();
    	}
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

	public ProductVOPK getProductVOPK() {
		return productVOPK;
	}

	public void setProductVOPK(ProductVOPK productVOPK) {
		this.productVOPK = productVOPK;
	}
    
    
}