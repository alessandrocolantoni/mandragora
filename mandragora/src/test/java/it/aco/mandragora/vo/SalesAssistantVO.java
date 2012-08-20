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
@Table(name="SALESASSISTANT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class SalesAssistantVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 267854694537104626L;
	
	@Column(name="ID_SALESASSISTANT")	
	@Id
	private String idSalesAssistant;
	
	@Column(name="SALESASSISTANTDESCRIPTION1")
    private String salesAssistantDescription1;
	
	@Column(name="SALESASSISTANTDESCRIPTION2")
    private String salesAssistantDescription2;

	
	@OneToMany(mappedBy = "clerkVOPK.salesAssistantVO", targetEntity = ClerkVO.class, fetch = FetchType.LAZY)
    private Collection<ClerkVO> clerkVOs;

    public String getIdSalesAssistant() {
        return idSalesAssistant;
    }

    public void setIdSalesAssistant(String idSalesAssistant) {
        this.idSalesAssistant = idSalesAssistant;
    }

    public String getSalesAssistantDescription1() {
        return salesAssistantDescription1;
    }

    public void setSalesAssistantDescription1(String salesAssistantDescription1) {
        this.salesAssistantDescription1 = salesAssistantDescription1;
    }

    public String getSalesAssistantDescription2() {
        return salesAssistantDescription2;
    }

    public void setSalesAssistantDescription2(String salesAssistantDescription2) {
        this.salesAssistantDescription2 = salesAssistantDescription2;
    }

    public Collection<ClerkVO> getClerkVOs() {
        return clerkVOs;
    }

    public void setClerkVOs(Collection<ClerkVO> clerkVOs) {
        this.clerkVOs = clerkVOs;
    }
}