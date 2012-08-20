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
@Table(name="CLERK")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ClerkVO extends ValueObject implements Serializable{

	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7091290416136788931L;
	
	@Transient
	private String idSalesAssistant;
	
	@Transient
    private String idClerk;
	
	
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idClerk",column= @Column(name="ID_CLERK"))
    })
    @AssociationOverrides( {
			@AssociationOverride(name = "salesAssistantVO", joinColumns = { @JoinColumn(name = "ID_SALESASSISTANT", referencedColumnName = "ID_SALESASSISTANT") })
	})
	private ClerkVOPK clerkVOPK;
	
	@Column(name="CLERKDESCRIPTION1")
    private String clerkDescription1;
	
	@Column(name="CLERKDESCRIPTION2")
    private String clerkDescription2;

    public String getIdSalesAssistant() {
    	if(clerkVOPK!=null){
    		return clerkVOPK.getSalesAssistantVO().getIdSalesAssistant();
    	}
        return idSalesAssistant;
    }

    public void setIdSalesAssistant(String idSalesAssistant) {
        this.idSalesAssistant = idSalesAssistant;
    }

    public String getIdClerk() {
    	if(clerkVOPK!=null){
    		return clerkVOPK.getIdClerk();
    	}
        return idClerk;
    }

    public void setIdClerk(String idClerk) {
        this.idClerk = idClerk;
    }

    public String getClerkDescription1() {
        return clerkDescription1;
    }

    public void setClerkDescription1(String clerkDescription1) {
        this.clerkDescription1 = clerkDescription1;
    }

    public String getClerkDescription2() {
        return clerkDescription2;
    }

    public void setClerkDescription2(String clerkDescription2) {
        this.clerkDescription2 = clerkDescription2;
    }

	public ClerkVOPK getClerkVOPK() {
		return clerkVOPK;
	}

	public void setClerkVOPK(ClerkVOPK clerkVOPK) {
		this.clerkVOPK = clerkVOPK;
	}
    
    
}