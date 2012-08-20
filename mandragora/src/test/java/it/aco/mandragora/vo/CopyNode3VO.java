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
@Table(name="COPYNODE3")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode3VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3227743840095959262L;
	
	@Column(name="ID_COPYNODE3")	
	@Id	
	private String idCopyNode3;
	
	@Transient
    private String idCopyNode33;
    
    @Column(name="DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "copyNode3VO", targetEntity = CopyNode31VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode31VO> copyNode31VOs ;
    
    @ManyToMany(targetEntity = CopyNode32VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "COPYNODE3_COPYNODE32", joinColumns = { @JoinColumn(name = "ID_COPYNODE3") }, inverseJoinColumns = { @JoinColumn(name = "ID_COPYNODE32") })
	private Collection<CopyNode32VO> copyNode32VOs ;
    
    @ManyToOne(targetEntity=CopyNode33VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE33", referencedColumnName="ID_COPYNODE33") })
    private CopyNode33VO copyNode33VO;


    public String getIdCopyNode3() {
        return idCopyNode3;
    }

    public void setIdCopyNode3(String idCopyNode3) {
        this.idCopyNode3 = idCopyNode3;
    }

    public String getIdCopyNode33() {
        return idCopyNode33;
    }

    public void setIdCopyNode33(String idCopyNode33) {
        this.idCopyNode33 = idCopyNode33;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<CopyNode31VO> getCopyNode31VOs() {
        return copyNode31VOs;
    }

    public void setCopyNode31VOs(Collection<CopyNode31VO> copyNode31VOs) {
        this.copyNode31VOs = copyNode31VOs;
    }

    public Collection<CopyNode32VO> getCopyNode32VOs() {
        return copyNode32VOs;
    }

    public void setCopyNode32VOs(Collection<CopyNode32VO> copyNode32VOs) {
        this.copyNode32VOs = copyNode32VOs;
    }

    public CopyNode33VO getCopyNode33VO() {
        return copyNode33VO;
    }

    public void setCopyNode33VO(CopyNode33VO copyNode33VO) {
        this.copyNode33VO = copyNode33VO;
    }
}