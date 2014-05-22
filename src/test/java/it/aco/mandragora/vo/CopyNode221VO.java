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
@Table(name="COPYNODE221")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode221VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1616147922271188201L;
	

	@Column(name="ID_COPYNODE221")	
	@Id	
	private String idCopyNode221;
	
	@Transient
    private String idCopyNode22;
	
	@ManyToOne(targetEntity=CopyNode22VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE22", referencedColumnName="ID_COPYNODE22") })	
	private CopyNode22VO copyNode22VO;// // added alessandro 19-08-2011
    
    @Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode221() {
        return idCopyNode221;
    }

    public void setIdCopyNode221(String idCopyNode221) {
        this.idCopyNode221 = idCopyNode221;
    }

    public String getIdCopyNode22() {
        return idCopyNode22;
    }

    public void setIdCopyNode22(String idCopyNode22) {
        this.idCopyNode22 = idCopyNode22;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CopyNode22VO getCopyNode22VO() {
		return copyNode22VO;
	}

	public void setCopyNode22VO(CopyNode22VO copyNode22VO) {
		this.copyNode22VO = copyNode22VO;
	}
    
    
}