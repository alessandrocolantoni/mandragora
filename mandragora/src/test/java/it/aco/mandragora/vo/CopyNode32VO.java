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
@Table(name="COPYNODE32")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode32VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3282394560229721813L;
	
	@Column(name="ID_COPYNODE32")	
	@Id	
	private String idCopyNode32;
	
	@Transient
    private String idCopyNode321;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@ManyToOne(targetEntity=CopyNode321VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_COPYNODE321", referencedColumnName="ID_COPYNODE321") })
    CopyNode321VO copyNode321VO;
	
	
	@OneToMany(mappedBy = "copyNode32VO", targetEntity = CopyNode322VO.class, fetch = FetchType.LAZY)
    Collection<CopyNode322VO> copyNode322VOs;

    public String getIdCopyNode32() {
        return idCopyNode32;
    }

    public void setIdCopyNode32(String idCopyNode32) {
        this.idCopyNode32 = idCopyNode32;
    }

    public String getIdCopyNode321() {
        return idCopyNode321;
    }

    public void setIdCopyNode321(String idCopyNode321) {
        this.idCopyNode321 = idCopyNode321;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CopyNode321VO getCopyNode321VO() {
        return copyNode321VO;
    }

    public void setCopyNode321VO(CopyNode321VO copyNode321VO) {
        this.copyNode321VO = copyNode321VO;
    }

    public Collection<CopyNode322VO> getCopyNode322VOs() {
        return copyNode322VOs;
    }

    public void setCopyNode322VOs(Collection<CopyNode322VO> copyNode322VOs) {
        this.copyNode322VOs = copyNode322VOs;
    }
}