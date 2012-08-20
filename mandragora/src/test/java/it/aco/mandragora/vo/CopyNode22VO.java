package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COPYNODE22")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode22VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6450168660847342319L;
	
	@Column(name="ID_COPYNODE22")	
	@Id	
	private String idCopyNode22;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "copyNode22VO", targetEntity = CopyNode221VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode221VO> copyNode221VOs;

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

    public Collection<CopyNode221VO> getCopyNode221VOs() {
        return copyNode221VOs;
    }

    public void setCopyNode221VOs(Collection<CopyNode221VO> copyNode221VOs) {
        this.copyNode221VOs = copyNode221VOs;
    }
}