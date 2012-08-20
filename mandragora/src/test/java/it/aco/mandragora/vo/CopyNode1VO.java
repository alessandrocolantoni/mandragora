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
@Table(name="COPYNODE1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode1VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7199934750223173544L;
	
	@Column(name="ID_COPYNODE1")	
	@Id	
	private String idCopyNode1;
	
	@Transient
    private String idCopyNode11;
	
	@Transient
    private String idCopyRoot;
	
	@ManyToOne(targetEntity=CopyRootVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYROOT", referencedColumnName="ID_COPYROOT") })	
	private CopyRootVO copyRootVO;// added alessandro 19-08-2011
    
	@Column(name="DESCRIPTION")
	private String description;

	@ManyToOne(targetEntity=CopyNode11VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE11", referencedColumnName="ID_COPYNODE11") })	
    private CopyNode11VO copyNode11VO;
	
	@OneToMany(mappedBy = "copyNode1VO", targetEntity = CopyNode12VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode12VO> copyNode12VOs;


    public String getIdCopyNode1() {
        return idCopyNode1;
    }

    public void setIdCopyNode1(String idCopyNode1) {
        this.idCopyNode1 = idCopyNode1;
    }

    public String getIdCopyNode11() {
        return idCopyNode11;
    }

    public void setIdCopyNode11(String idCopyNode11) {
        this.idCopyNode11 = idCopyNode11;
    }

    public String getIdCopyRoot() {
        return idCopyRoot;
    }

    public void setIdCopyRoot(String idCopyRoot) {
        this.idCopyRoot = idCopyRoot;
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

    public Collection<CopyNode12VO> getCopyNode12VOs() {
        return copyNode12VOs;
    }

    public void setCopyNode12VOs(Collection<CopyNode12VO> copyNode12VOs) {
        this.copyNode12VOs = copyNode12VOs;
    }

    
    
    public CopyRootVO getCopyRootVO() {
		return copyRootVO;
	}

	public void setCopyRootVO(CopyRootVO copyRootVO) {
		this.copyRootVO = copyRootVO;
	}

	public String toString() {
        String result = "Node1VO [";
        result += "idCopyNode1: " + ((idCopyNode1 ==null)?"": idCopyNode1.toString());
        result += ",\n idCopyNode11: " + ((idCopyNode11 ==null)?"": idCopyNode11.toString());
        result += ",\n idCopyRoot: " + ((idCopyRoot ==null)?"": idCopyRoot.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}