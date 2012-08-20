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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="COPYNODE311")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode311VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6285980519637004118L;
	

	@Column(name="ID_COPYNODE311")	
	@Id	
	private String idCopyNode311;
	
	@Transient
    private String idCopyNode31;
	
	@ManyToOne(targetEntity=CopyNode31VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE31", referencedColumnName="ID_COPYNODE31") })	
	private CopyNode31VO copyNode31VO; // added alessandro 19-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToMany(targetEntity = CopyNode3111VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "COPYNODE311_COPYNODE3111", joinColumns = { @JoinColumn(name = "ID_COPYNODE311") }, inverseJoinColumns = { @JoinColumn(name = "ID_COPYNODE3111") })
	private Collection<CopyNode3111VO> copyNode3111VOs;
	
	@ManyToMany(targetEntity = CopyNode3112VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "COPYNODE311_COPYNODE3112", joinColumns = { @JoinColumn(name = "ID_COPYNODE311") }, inverseJoinColumns = { @JoinColumn(name = "ID_COPYNODE3112") })
	private Collection<CopyNode3112VO> copyNode3112VOs;

    public String getIdCopyNode311() {
        return idCopyNode311;
    }

    public void setIdCopyNode311(String idCopyNode311) {
        this.idCopyNode311 = idCopyNode311;
    }

    public String getIdCopyNode31() {
        return idCopyNode31;
    }

    public void setIdCopyNode31(String idCopyNode31) {
        this.idCopyNode31 = idCopyNode31;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<CopyNode3111VO> getCopyNode3111VOs() {
        return copyNode3111VOs;
    }

    public void setCopyNode3111VOs(Collection<CopyNode3111VO> copyNode3111VOs) {
        this.copyNode3111VOs = copyNode3111VOs;
    }

    public Collection<CopyNode3112VO> getCopyNode3112VOs() {
        return copyNode3112VOs;
    }

    public void setCopyNode3112VOs(Collection<CopyNode3112VO> copyNode3112VOs) {
        this.copyNode3112VOs = copyNode3112VOs;
    }

	public CopyNode31VO getCopyNode31VO() {
		return copyNode31VO;
	}

	public void setCopyNode31VO(CopyNode31VO copyNode31VO) {
		this.copyNode31VO = copyNode31VO;
	}
    
    
}