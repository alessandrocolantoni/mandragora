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
@Table(name="COMPANY")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CompanyVO extends ValueObject implements Serializable{
   
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6770996865566394532L;
	
	
	@Transient
	private Integer idCompanyGroup;
	
	@Transient
    private Integer idCompany;
	
	@Column(name="NAME")
    private String name;
	
	@Column(name="DESCRIPTION")
    private String description;

	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idCompany",column= @Column(name="ID_COMPANY"))
    })
    @AssociationOverrides( {
			@AssociationOverride(name = "companyGroupVO", joinColumns = { @JoinColumn(name = "ID_COMPANY_GROUP", referencedColumnName = "ID_COMPANY_GROUP") })
	})
    private CompanyVOPK companyVOPK; // added alessandro 15-08-2011
    
    public Integer getIdCompanyGroup() {
//        return idCompanyGroup;
    	if(companyVOPK!=null){
    		if(companyVOPK.getCompanyGroupVO()!=null)
    			return companyVOPK.getCompanyGroupVO().getIdCompanyGroup();
    		else return null;
    	}
    	else return idCompanyGroup;
    }

    public void setIdCompanyGroup(Integer idCompanyGroup) {
        this.idCompanyGroup = idCompanyGroup;
    }

    public Integer getIdCompany() {
//        return idCompany;
    	return companyVOPK != null ? companyVOPK.getIdCompany():idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CompanyVOPK getCompanyVOPK() {
		return companyVOPK;
	}

	public void setCompanyVOPK(CompanyVOPK companyVOPK) {
		this.companyVOPK = companyVOPK;
	}

	
    
    
    
}