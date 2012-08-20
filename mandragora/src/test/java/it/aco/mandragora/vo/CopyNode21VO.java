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
@Table(name="COPYNODE21")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode21VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7474072807376311780L;
	

	@Column(name="ID_COPYNODE21")	
	@Id	
	private String idCopyNode21;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "copyNode21VO", targetEntity = CopyNode211VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode211VO> copyNode211VOs;

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

    public Collection<CopyNode211VO> getCopyNode211VOs() {
        return copyNode211VOs;
    }

    public void setCopyNode211VOs(Collection<CopyNode211VO> copyNode211VOs) {
        this.copyNode211VOs = copyNode211VOs;
    }
}