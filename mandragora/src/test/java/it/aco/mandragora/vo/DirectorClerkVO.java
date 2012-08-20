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
@Table(name="DIRECTORCLERK")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class DirectorClerkVO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1089048094320057672L;
	
	@Transient
	private String idDirector;
	
	@Transient
    private String idSalesManager;
	
	@Transient
    private String idSalesDivision;
	
	@Transient
    private String idSalesAssistant;
	
	@Transient
    private String idClerk;
	
	@EmbeddedId
    @AssociationOverrides( {
			@AssociationOverride(name = "directorVO", joinColumns = { @JoinColumn(name = "ID_DIRECTOR", referencedColumnName = "ID_DIRECTOR") }),
			@AssociationOverride(name = "salesDivisionVO", joinColumns = { @JoinColumn(name = "ID_SALESMANAGER", referencedColumnName = "ID_SALESMANAGER"),@JoinColumn(name = "ID_SALESDIVISION", referencedColumnName = "ID_SALESDIVISION") }),
			@AssociationOverride(name = "clerkVO", joinColumns = { @JoinColumn(name = "ID_SALESASSISTANT", referencedColumnName = "ID_SALESASSISTANT"),@JoinColumn(name = "ID_CLERK", referencedColumnName = "ID_CLERK") })
	})
	private DirectorClerkVOPK directorClerkVOPK;
	
	
	@Column(name="DIRECTORCLERKDESCRIPTION1")
    private String directorClerkDescription1;
	
	@Column(name="DIRECTORDESCRIPTION2")
    private String directorDescription2;
	
	@Column(name="DIRECTORCLERKDESCRIPTION2")
    private String directorClerkDescription2;
	
	@Column(name="SALESMANAGERDESCRIPTION2")
    private String salesManagerDescription2;
	
	@Column(name="DIRECTORCLERKDESCRIPTION3")
    private String directorClerkDescription3;
	
	@Column(name="SALESDIVISIONDESCRIPTION2")
    private String salesDivisionDescription2;
	
	@Column(name="DIRECTORCLERKDESCRIPTION4")
    private String directorClerkDescription4;
	
	@Column(name="SALESASSISTANTDESCRIPTION2")
    private String salesAssistantDescription2;
	
	@Column(name="DIRECTORCLERKDESCRIPTION5")
    private String directorClerkDescription5;
	
	@Column(name="CLERKDESCRIPTION2")
    private String clerkDescription2;
	
	@Column(name="NOTE1")
    private String note1;
	
	@Column(name="NOTE2")
    private String note2;

    public String getIdDirector() {
    	if(directorClerkVOPK!=null){
    		return directorClerkVOPK.getDirectorVO().getIdDirector();
    	}
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }

    public String getIdSalesManager() {
    	if(directorClerkVOPK!=null){
    		return directorClerkVOPK.getSalesDivisionVO().getSalesDivisionVOPK().getSalesManagerVO().getIdSalesManager();
    	}
        return idSalesManager;
    }

    public void setIdSalesManager(String idSalesManager) {
        this.idSalesManager = idSalesManager;
    }

    public String getIdSalesDivision() {
    	if(directorClerkVOPK!=null){
    		return directorClerkVOPK.getSalesDivisionVO().getSalesDivisionVOPK().getIdSalesDivision();
    	}
        return idSalesDivision;
    }

    public void setIdSalesDivision(String idSalesDivision) {
        this.idSalesDivision = idSalesDivision;
    }

    public String getIdSalesAssistant() {
    	if(directorClerkVOPK!=null){
    		return directorClerkVOPK.getClerkVO().getClerkVOPK().getSalesAssistantVO().getIdSalesAssistant();
    	}
        return idSalesAssistant;
    }

    public void setIdSalesAssistant(String idSalesAssistant) {
        this.idSalesAssistant = idSalesAssistant;
    }

    public String getIdClerk() {
    	if(directorClerkVOPK!=null){
    		return directorClerkVOPK.getClerkVO().getClerkVOPK().getIdClerk();
    	}
        return idClerk;
    }

    public void setIdClerk(String idClerk) {
        this.idClerk = idClerk;
    }

    public String getDirectorClerkDescription1() {
        return directorClerkDescription1;
    }

    public void setDirectorClerkDescription1(String directorClerkDescription1) {
        this.directorClerkDescription1 = directorClerkDescription1;
    }

    public String getDirectorDescription2() {
        return directorDescription2;
    }

    public void setDirectorDescription2(String directorDescription2) {
        this.directorDescription2 = directorDescription2;
    }

    public String getDirectorClerkDescription2() {
        return directorClerkDescription2;
    }

    public void setDirectorClerkDescription2(String directorClerkDescription2) {
        this.directorClerkDescription2 = directorClerkDescription2;
    }

    public String getSalesManagerDescription2() {
        return salesManagerDescription2;
    }

    public void setSalesManagerDescription2(String salesManagerDescription2) {
        this.salesManagerDescription2 = salesManagerDescription2;
    }

    public String getDirectorClerkDescription3() {
        return directorClerkDescription3;
    }

    public void setDirectorClerkDescription3(String directorClerkDescription3) {
        this.directorClerkDescription3 = directorClerkDescription3;
    }

    public String getSalesDivisionDescription2() {
        return salesDivisionDescription2;
    }

    public void setSalesDivisionDescription2(String salesDivisionDescription2) {
        this.salesDivisionDescription2 = salesDivisionDescription2;
    }

    public String getDirectorClerkDescription4() {
        return directorClerkDescription4;
    }

    public void setDirectorClerkDescription4(String directorClerkDescription4) {
        this.directorClerkDescription4 = directorClerkDescription4;
    }

    public String getSalesAssistantDescription2() {
        return salesAssistantDescription2;
    }

    public void setSalesAssistantDescription2(String salesAssistantDescription2) {
        this.salesAssistantDescription2 = salesAssistantDescription2;
    }

    public String getDirectorClerkDescription5() {
        return directorClerkDescription5;
    }

    public void setDirectorClerkDescription5(String directorClerkDescription5) {
        this.directorClerkDescription5 = directorClerkDescription5;
    }

    public String getClerkDescription2() {
        return clerkDescription2;
    }

    public void setClerkDescription2(String clerkDescription2) {
        this.clerkDescription2 = clerkDescription2;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

	public DirectorClerkVOPK getDirectorClerkVOPK() {
		return directorClerkVOPK;
	}

	public void setDirectorClerkVOPK(DirectorClerkVOPK directorClerkVOPK) {
		this.directorClerkVOPK = directorClerkVOPK;
	}
    
    
}