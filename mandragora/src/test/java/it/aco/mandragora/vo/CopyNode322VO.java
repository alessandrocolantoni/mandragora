package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="COPYNODE322")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode322VO extends ValueObject implements Serializable{
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7538353113188708954L;
	
	
	@Column(name="ID_COPYNODE322")	
	@Id	
    private String idCopyNode322;
	
	@Transient
    private String idCopyNode32;
	
	@ManyToOne(targetEntity=CopyNode32VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE32", referencedColumnName="ID_COPYNODE32") })
	private CopyNode32VO copyNode32VO;// added alessandro 19-08-2011
	
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode322() {
        return idCopyNode322;
    }

    public void setIdCopyNode322(String idCopyNode322) {
        this.idCopyNode322 = idCopyNode322;
    }

    public String getIdCopyNode32() {
        return idCopyNode32;
    }

    public void setIdCopyNode32(String idCopyNode32) {
        this.idCopyNode32 = idCopyNode32;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CopyNode32VO getCopyNode32VO() {
		return copyNode32VO;
	}

	public void setCopyNode32VO(CopyNode32VO copyNode32VO) {
		this.copyNode32VO = copyNode32VO;
	}
    
    
}