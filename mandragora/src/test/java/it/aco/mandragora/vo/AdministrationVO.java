package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ADMINISTRATION")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class AdministrationVO extends ValueObject implements Serializable{
	
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -5149479371425937453L;

	@Column(name="ID_ADMINISTRATION")	
	@Id
	private String idAdministration;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "orderVOPK.administrationVO", targetEntity = OrderVO.class, fetch = FetchType.LAZY)
    private Collection<OrderVO> orderVOs;
    
	@ManyToMany(targetEntity = ProductVO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "ADMINISTRATION_PRODUCT", joinColumns = { @JoinColumn(name = "ID_ADMINISTRATION") }, inverseJoinColumns = { @JoinColumn(name = "ID_CATEGORY"), @JoinColumn(name = "ID_SUBCATEGORY"), @JoinColumn(name = "ID_PRODUCT")})
	private Collection<ProductVO> productVOs;

    public String getIdAdministration() {
        return idAdministration;
    }

    public void setIdAdministration(String idAdministration) {
        this.idAdministration = idAdministration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<OrderVO> getOrderVOs() {
        return orderVOs;
    }

    public void setOrderVOs(Collection<OrderVO> orderVOs) {
        this.orderVOs = orderVOs;
    }

    public Collection<ProductVO> getProductVOs() {
        return productVOs;
    }

    public void setProductVOs(Collection<ProductVO> productVOs) {
        this.productVOs = productVOs;
    }
}