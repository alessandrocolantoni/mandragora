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
@Table(name="COMPANY_GROUP")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CompanyGroupVO extends ValueObject implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7318647385399749113L;
	
	
	@Column(name="ID_COMPANY_GROUP")	
	@Id	
	private Integer idCompanyGroup;
    
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@OneToMany(mappedBy = "companyVOPK.companyGroupVO", targetEntity = CompanyVO.class, fetch = FetchType.LAZY)
    private Collection<CompanyVO> companyVOs;

    public Integer getIdCompanyGroup() {
        return idCompanyGroup;
    }

    public void setIdCompanyGroup(Integer idCompanyGroup) {
        this.idCompanyGroup = idCompanyGroup;
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

    public Collection<CompanyVO> getCompanyVOs() {
        return companyVOs;
    }

    public void setCompanyVOs(Collection<CompanyVO> companyVOs) {
        this.companyVOs = companyVOs;
    }
}
