package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SALESMANAGER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SalesManagerVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -945054478942490497L;
	
	@Column(name="ID_SALESMANAGER")	
	@Id
	private String idSalesManager;
	
	@Column(name="SALESMANAGERDESCRIPTION1")	
    private String salesManagerDescription1;
    
    @Column(name="SALESMANAGERDESCRIPTION2")	
    private String salesManagerDescription2;

    @OneToMany(mappedBy = "salesDivisionVOPK.salesManagerVO", targetEntity = SalesDivisionVO.class, fetch = FetchType.LAZY)
    private Collection<SalesDivisionVO> salesDivisionVOs;

    public String getIdSalesManager() {
        return idSalesManager;
    }

    public void setIdSalesManager(String idSalesManager) {
        this.idSalesManager = idSalesManager;
    }

    public String getSalesManagerDescription1() {
        return salesManagerDescription1;
    }

    public void setSalesManagerDescription1(String salesManagerDescription1) {
        this.salesManagerDescription1 = salesManagerDescription1;
    }

    public String getSalesManagerDescription2() {
        return salesManagerDescription2;
    }

    public void setSalesManagerDescription2(String salesManagerDescription2) {
        this.salesManagerDescription2 = salesManagerDescription2;
    }

    public Collection<SalesDivisionVO> getSalesDivisionVOs() {
        return salesDivisionVOs;
    }

    public void setSalesDivisionVOs(Collection<SalesDivisionVO> salesDivisionVOs) {
        this.salesDivisionVOs = salesDivisionVOs;
    }
}