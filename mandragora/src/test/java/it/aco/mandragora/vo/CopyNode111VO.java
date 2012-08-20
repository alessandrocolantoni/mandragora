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
@Table(name="COPYNODE111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode111VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3626533437369101656L;
	
	@Column(name="ID_COPYNODE111")	
	@Id	
	private String idCopyNode111;
	
	@Transient
    private String idCopyNode11;
	
	@ManyToOne(targetEntity=CopyNode11VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE11", referencedColumnName="ID_COPYNODE11") })	
	private CopyNode11VO copyNode11VO; // added alessandro 18-08-2011
    
    @Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode111() {
        return idCopyNode111;
    }

    public void setIdCopyNode111(String idCopyNode111) {
        this.idCopyNode111 = idCopyNode111;
    }

    public String getIdCopyNode11() {
        return idCopyNode11;
    }

    public void setIdCopyNode11(String idCopyNode11) {
        this.idCopyNode11 = idCopyNode11;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CopyNode11VO getCopyNode11VO() {
		return copyNode11VO;
	}

	public void setCopyNode11VO(CopyNode11VO copyNode11VO) {
		this.copyNode11VO = copyNode11VO;
	}
    
    
}