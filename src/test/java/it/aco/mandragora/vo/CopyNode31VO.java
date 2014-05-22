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
@Table(name="COPYNODE31")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode31VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -301005267825137771L;
	
	@Column(name="ID_COPYNODE31")	
	@Id	
	private String idCopyNode31;
	
	@Transient
    private String idCopyNode3;
	
	@ManyToOne(targetEntity=CopyNode3VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE3", referencedColumnName="ID_COPYNODE3") })
	private CopyNode3VO copyNode3VO;// added alessandro 19-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@OneToMany(mappedBy = "copyNode31VO", targetEntity = CopyNode311VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode311VO> copyNode311VOs;

    public String getIdCopyNode31() {
        return idCopyNode31;
    }

    public void setIdCopyNode31(String idCopyNode31) {
        this.idCopyNode31 = idCopyNode31;
    }

    public String getIdCopyNode3() {
        return idCopyNode3;
    }

    public void setIdCopyNode3(String idCopyNode3) {
        this.idCopyNode3 = idCopyNode3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<CopyNode311VO> getCopyNode311VOs() {
        return copyNode311VOs;
    }

    public void setCopyNode311VOs(Collection<CopyNode311VO> copyNode311VOs) {
        this.copyNode311VOs = copyNode311VOs;
    }

	public CopyNode3VO getCopyNode3VO() {
		return copyNode3VO;
	}

	public void setCopyNode3VO(CopyNode3VO copyNode3VO) {
		this.copyNode3VO = copyNode3VO;
	}
    
    
}