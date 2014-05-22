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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="DIRECTOR")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class DirectorVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -2170407667776040563L;
	
	@Column(name="ID_DIRECTOR")	
	@Id
	private String idDirector;
	
	@Transient
    private String idSalesManager;
	
	@Column(name="DIRECTORDESCRIPTION1")	
    private String directorDescription1;
	
	@Column(name="DIRECTORDESCRIPTION2")	
    private String directorDescription2;

	@ManyToOne(targetEntity=SalesManagerVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_SALESMANAGER", referencedColumnName="ID_SALESMANAGER")})
    private SalesManagerVO salesManagerVO;
    
	@OneToMany(mappedBy = "directorClerkVOPK.directorVO", targetEntity = DirectorClerkVO.class, fetch = FetchType.LAZY)
    private Collection<DirectorClerkVO> directorClerkVOs;

    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }

    public String getIdSalesManager() {
        return idSalesManager;
    }

    public void setIdSalesManager(String idSalesManager) {
        this.idSalesManager = idSalesManager;
    }

    public String getDirectorDescription1() {
        return directorDescription1;
    }

    public void setDirectorDescription1(String directorDescription1) {
        this.directorDescription1 = directorDescription1;
    }

    public String getDirectorDescription2() {
        return directorDescription2;
    }

    public void setDirectorDescription2(String directorDescription2) {
        this.directorDescription2 = directorDescription2;
    }

    public SalesManagerVO getSalesManagerVO() {
        return salesManagerVO;
    }

    public void setSalesManagerVO(SalesManagerVO salesManagerVO) {
        this.salesManagerVO = salesManagerVO;
    }

    public Collection<DirectorClerkVO> getDirectorClerkVOs() {
        return directorClerkVOs;
    }

    public void setDirectorClerkVOs(Collection<DirectorClerkVO> directorClerkVOs) {
        this.directorClerkVOs = directorClerkVOs;
    }
}