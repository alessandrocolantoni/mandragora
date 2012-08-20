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
@Table(name="COPYNODE12")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode12VO extends ValueObject implements Serializable{
	
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -5165629565765902940L;
	@Column(name="ID_COPYNODE12")	
	@Id	
	private String idCopyNode12;
	
	@Transient
    private String idCopyNode121;
	
	@Transient
    private String idCopyNode1;
	
	@ManyToOne(targetEntity=CopyNode1VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE1", referencedColumnName="ID_COPYNODE1") })	
	private CopyNode1VO copyNode1VO; // added alessandro 19-08-2011

	@Column(name="DESCRIPTION")
    private String description;


	@ManyToOne(targetEntity=CopyNode121VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE121", referencedColumnName="ID_COPYNODE121") })	
    private CopyNode121VO  copyNode121VO;
	
	@OneToMany(mappedBy = "copyNode12VO", targetEntity = CopyNode122VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode122VO> copyNode122VOs;

    public String getIdCopyNode12() {
        return idCopyNode12;
    }

    public void setIdCopyNode12(String idCopyNode12) {
        this.idCopyNode12 = idCopyNode12;
    }

    public String getIdCopyNode121() {
        return idCopyNode121;
    }

    public void setIdCopyNode121(String idCopyNode121) {
        this.idCopyNode121 = idCopyNode121;
    }

    public String getIdCopyNode1() {
        return idCopyNode1;
    }

    public void setIdCopyNode1(String idCopyNode1) {
        this.idCopyNode1 = idCopyNode1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CopyNode121VO getCopyNode121VO() {
        return copyNode121VO;
    }

    public void setCopyNode121VO(CopyNode121VO copyNode121VO) {
        this.copyNode121VO = copyNode121VO;
    }

    public Collection<CopyNode122VO> getCopyNode122VOs() {
        return copyNode122VOs;
    }

    public void setCopyNode122VOs(Collection<CopyNode122VO> copyNode122VOs) {
        this.copyNode122VOs = copyNode122VOs;
    }

	public CopyNode1VO getCopyNode1VO() {
		return copyNode1VO;
	}

	public void setCopyNode1VO(CopyNode1VO copyNode1VO) {
		this.copyNode1VO = copyNode1VO;
	}
    
    
}