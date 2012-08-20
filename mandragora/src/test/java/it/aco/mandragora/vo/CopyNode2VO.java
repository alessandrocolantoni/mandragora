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
@Table(name="COPYNODE2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode2VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3019185736167792543L;
	
	@Column(name="ID_COPYNODE2")	
	@Id	
	private String idCopyNode2;
	
	@Transient
    private String idCopyNode21;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@ManyToOne(targetEntity=CopyNode21VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE21", referencedColumnName="ID_COPYNODE21") })	
    private CopyNode21VO copyNode21VO;
	
	
	@ManyToMany(targetEntity = CopyNode22VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "COPYNODE2_COPYNODE22", joinColumns = { @JoinColumn(name = "ID_COPYNODE2") }, inverseJoinColumns = { @JoinColumn(name = "ID_COPYNODE22") })
	private Collection<CopyNode22VO> copyNode22VOs;

    public String getIdCopyNode2() {
        return idCopyNode2;
    }

    public void setIdCopyNode2(String idCopyNode2) {
        this.idCopyNode2 = idCopyNode2;
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

    public Collection<CopyNode22VO> getCopyNode22VOs() {
        return copyNode22VOs;
    }

    public void setCopyNode22VOs(Collection<CopyNode22VO> copyNode22VOs) {
        this.copyNode22VOs = copyNode22VOs;
    }
}