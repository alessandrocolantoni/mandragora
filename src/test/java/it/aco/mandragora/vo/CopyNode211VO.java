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
@Table(name="COPYNODE211")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode211VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2816082535517695592L;
	
	

	@Column(name="ID_COPYNODE211")	
	@Id	
	private String idCopyNode211;
	
	@Transient
    private String idCopyNode21;
	
	@ManyToOne(targetEntity=CopyNode21VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE21", referencedColumnName="ID_COPYNODE21") })	
	private CopyNode21VO copyNode21VO; // added alessandro 19-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode211() {
        return idCopyNode211;
    }

    public void setIdCopyNode211(String idCopyNode211) {
        this.idCopyNode211 = idCopyNode211;
    }

    public String getIdCopyNode21() {
        return idCopyNode21;
    }

    public void setIdCopyNode21(String idCopyNode21) {
        this.idCopyNode21 = idCopyNode21;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CopyNode21VO getCopyNode21VO() {
		return copyNode21VO;
	}

	public void setCopyNode21VO(CopyNode21VO copyNode21VO) {
		this.copyNode21VO = copyNode21VO;
	}
    
    
}