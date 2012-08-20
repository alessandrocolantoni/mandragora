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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="COPYROOT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyRootVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3707488595224572149L;
	
	@Column(name="ID_COPYROOT")	
	@Id	
	private String idCopyRoot;
	
	@Transient
    private String idCopyNode3;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@OneToMany(mappedBy = "copyRootVO", targetEntity = CopyNode1VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode1VO> copyNode1VOs;
	
	@ManyToMany(targetEntity = CopyNode2VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "COPYROOT_COPYNODE2", joinColumns = { @JoinColumn(name = "ID_COPYROOT") }, inverseJoinColumns = { @JoinColumn(name = "ID_COPYNODE2") })
	private Collection<CopyNode2VO> copyNode2VOs;
    
	@ManyToOne(targetEntity=CopyNode3VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE3", referencedColumnName="ID_COPYNODE3") })
    private CopyNode3VO copyNode3VO;

    public String getIdCopyRoot() {
        return idCopyRoot;
    }

    public void setIdCopyRoot(String idCopyRoot) {
        this.idCopyRoot = idCopyRoot;
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

    public Collection<CopyNode1VO> getCopyNode1VOs() {
        return copyNode1VOs;
    }

    public void setCopyNode1VOs(Collection<CopyNode1VO> copyNode1VOs) {
        this.copyNode1VOs = copyNode1VOs;
    }

    public Collection<CopyNode2VO> getCopyNode2VOs() {
        return copyNode2VOs;
    }

    public void setCopyNode2VOs(Collection<CopyNode2VO> copyNode2VOs) {
        this.copyNode2VOs = copyNode2VOs;
    }

    public CopyNode3VO getCopyNode3VO() {
        return copyNode3VO;
    }

    public void setCopyNode3VO(CopyNode3VO copyNode3VO) {
        this.copyNode3VO = copyNode3VO;
    }
}