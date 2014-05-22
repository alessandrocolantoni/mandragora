package it.aco.mandragora.vo;

import java.io.Serializable;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="SALESDIVISION")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SalesDivisionVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1082979857130202055L;
	
	@Transient
	private String idSalesManager;
	
	@Transient
    private String idSalesDivision;
    
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idSalesDivision",column= @Column(name="ID_SALESDIVISION"))
    })
    @AssociationOverrides( {
		@AssociationOverride(name = "salesManagerVO", joinColumns = { @JoinColumn(name = "ID_SALESMANAGER", referencedColumnName = "ID_SALESMANAGER") })
	})
	private SalesDivisionVOPK salesDivisionVOPK;

	@Column(name="SALESDIVISIONDESCRIPTION1")	
    private String salesDivisionDescription1;
	
	@Column(name="SALESDIVISIONDESCRIPTION2")	
    private String salesDivisionDescription2;

	@ManyToMany(targetEntity = SalesAssistantVO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "SALESDIVISION_SALESASSISTANT", joinColumns = { @JoinColumn(name = "ID_SALESMANAGER"),@JoinColumn(name = "ID_SALESDIVISION") }, inverseJoinColumns = { @JoinColumn(name = "ID_SALESASSISTANT") })
	private Collection<SalesAssistantVO> salesAssistantVOs;

    public String getIdSalesManager() {
    	if(salesDivisionVOPK!=null){
    		return salesDivisionVOPK.getSalesManagerVO().getIdSalesManager();
    	}
        return idSalesManager;
    }

    public void setIdSalesManager(String idSalesManager) {
    	
        this.idSalesManager = idSalesManager;
    }

    public String getIdSalesDivision() {
    	if(salesDivisionVOPK!=null){
    		return salesDivisionVOPK.getIdSalesDivision();
    	}
        return idSalesDivision;
    }

    public void setIdSalesDivision(String idSalesDivision) {
        this.idSalesDivision = idSalesDivision;
    }

    public String getSalesDivisionDescription1() {
        return salesDivisionDescription1;
    }

    public void setSalesDivisionDescription1(String salesDivisionDescription1) {
        this.salesDivisionDescription1 = salesDivisionDescription1;
    }

    public String getSalesDivisionDescription2() {
        return salesDivisionDescription2;
    }

    public void setSalesDivisionDescription2(String salesDivisionDescription2) {
        this.salesDivisionDescription2 = salesDivisionDescription2;
    }

    public Collection<SalesAssistantVO> getSalesAssistantVOs() {
        return salesAssistantVOs;
    }

    public void setSalesAssistantVOs(Collection<SalesAssistantVO> salesAssistantVOs) {
        this.salesAssistantVOs = salesAssistantVOs;
    }

	public SalesDivisionVOPK getSalesDivisionVOPK() {
		return salesDivisionVOPK;
	}

	public void setSalesDivisionVOPK(SalesDivisionVOPK salesDivisionVOPK) {
		this.salesDivisionVOPK = salesDivisionVOPK;
	}
    
    
}