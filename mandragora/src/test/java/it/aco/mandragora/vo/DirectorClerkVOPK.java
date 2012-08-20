package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class DirectorClerkVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2855927768540709982L;
	
	@ManyToOne(targetEntity=DirectorVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_DIRECTOR", referencedColumnName="ID_DIRECTOR")})	
	private DirectorVO directorVO;
	
	@ManyToOne(targetEntity=SalesDivisionVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_SALESMANAGER", referencedColumnName="ID_SALESMANAGER"),@JoinColumn(name="ID_SALESDIVISION", referencedColumnName="ID_SALESDIVISION") })	
	private SalesDivisionVO salesDivisionVO;
	
	@ManyToOne(targetEntity=ClerkVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_CLERK", referencedColumnName="ID_CLERK"),@JoinColumn(name="ID_SALESASSISTANT", referencedColumnName="ID_SALESASSISTANT") })	
	private ClerkVO clerkVO;

	public DirectorVO getDirectorVO() {
		return directorVO;
	}

	public void setDirectorVO(DirectorVO directorVO) {
		this.directorVO = directorVO;
	}

	public SalesDivisionVO getSalesDivisionVO() {
		return salesDivisionVO;
	}

	public void setSalesDivisionVO(SalesDivisionVO salesDivisionVO) {
		this.salesDivisionVO = salesDivisionVO;
	}

	public ClerkVO getClerkVO() {
		return clerkVO;
	}

	public void setClerkVO(ClerkVO clerkVO) {
		this.clerkVO = clerkVO;
	}
	
	
	

}
