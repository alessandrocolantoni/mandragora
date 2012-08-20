package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="ORDERED")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class OrderVO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1529188908782013597L;
	
	@Transient
	private String idAdministration;
	
	@Transient
    private String idCategory;
	
	@Transient
    private String idSubCategory;
	
	@Transient
    private String idProduct;
    
	@EmbeddedId
    @AssociationOverrides( {
			@AssociationOverride(name = "administrationVO", joinColumns = { @JoinColumn(name = "ID_ADMINISTRATION", referencedColumnName = "ID_ADMINISTRATION") }),
			@AssociationOverride(name = "productVO", joinColumns = { @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY"),@JoinColumn(name = "ID_SUBCATEGORY", referencedColumnName = "ID_SUBCATEGORY"),@JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT") })
	})
    private OrderVOPK orderVOPK;
    
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="ORDERDESCRIPTION")
    private String orderDescription;
	
	@Column(name="NOTE")
    private String note;

    public String getIdAdministration() {
    	if(orderVOPK!=null ){
    		if(orderVOPK.getAdministrationVO()!=null){
    			return orderVOPK.getAdministrationVO().getIdAdministration();
    		}else{
    			return null;
    		}
    		
    	}
        return idAdministration;
    }

    public void setIdAdministration(String idAdministration) {
        this.idAdministration = idAdministration;
    }

    public String getIdCategory() {
    	if(orderVOPK!=null){
    		if(orderVOPK.getProductVO()!=null && 
    				orderVOPK.getProductVO().getProductVOPK()!=null && 
    				orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO()!=null && 
    				orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO().getSubCategoryVOPK()!=null && 
    				orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO().getSubCategoryVOPK().getCategoryVO()!=null){
    			return orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO().getSubCategoryVOPK().getCategoryVO().getIdCategory();
    		}else{
    			return null;
    		}
    	}
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getIdSubCategory() {
    	if(orderVOPK!=null){
    		if(orderVOPK.getProductVO()!=null && 
    				orderVOPK.getProductVO().getProductVOPK()!=null && 
    				orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO()!=null && 
    				orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO().getSubCategoryVOPK()!=null){
    			return orderVOPK.getProductVO().getProductVOPK().getSubCategoryVO().getSubCategoryVOPK().getIdSubCategory();
    		}else{
    			return null;
    		}
    	}
        return idSubCategory;
    }

    public void setIdSubCategory(String idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public String getIdProduct() {
    	if(orderVOPK!=null){
    		if(orderVOPK.getProductVO()!=null && orderVOPK.getProductVO().getProductVOPK()!=null){
    			return orderVOPK.getProductVO().getProductVOPK().getIdProduct();
    		}else{
    			return null;
    		}
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

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

	public OrderVOPK getOrderVOPK() {
		return orderVOPK;
	}

	public void setOrderVOPK(OrderVOPK orderVOPK) {
		this.orderVOPK = orderVOPK;
	}
    
    
}