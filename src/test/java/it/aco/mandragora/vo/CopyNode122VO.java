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
@Table(name="COPYNODE122")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode122VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 509868344807036575L;
	
	@Column(name="ID_COPYNODE122")	
	@Id	
	private String idCopyNode122;
	
	@Transient
    private String idCopyNode12;
	
	@ManyToOne(targetEntity=CopyNode12VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE12", referencedColumnName="ID_COPYNODE12") })	
	private CopyNode12VO copyNode12VO; // added 19-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdCopyNode122() {
        return idCopyNode122;
    }

    public void setIdCopyNode122(String idCopyNode122) {
        this.idCopyNode122 = idCopyNode122;
    }

    public String getIdCopyNode12() {
        return idCopyNode12;
    }

    public void setIdCopyNode12(String idCopyNode12) {
        this.idCopyNode12 = idCopyNode12;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CopyNode12VO getCopyNode12VO() {
		return copyNode12VO;
	}

	public void setCopyNode12VO(CopyNode12VO copyNode12VO) {
		this.copyNode12VO = copyNode12VO;
	}
    
    
}