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
@Table(name="COPYNODE11")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CopyNode11VO extends ValueObject implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -129370643267244797L;

	@Column(name="ID_COPYNODE11")	
	@Id	
    private String idCopyNode11;
	
	@Column(name="DESCRIPTION")
    private String description;


	@OneToMany(mappedBy = "copyNode11VO", targetEntity = CopyNode111VO.class, fetch = FetchType.LAZY)
    private Collection<CopyNode111VO> copyNode111VOs;

    public String getIdCopyNode11() {
        return idCopyNode11;
    }

    public void setIdCopyNode11(String idCopyNode11) {
        this.idCopyNode11 = idCopyNode11;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<CopyNode111VO> getCopyNode111VOs() {
        return copyNode111VOs;
    }

    public void setCopyNode111VOs(Collection<CopyNode111VO> copyNode111VOs) {
        this.copyNode111VOs = copyNode111VOs;
    }

    public String toString() {
        String result = "Node11VO [";
        result += "idCopyNode11: " + ((idCopyNode11==null)?"":idCopyNode11.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}