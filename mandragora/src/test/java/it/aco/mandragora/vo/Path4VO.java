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
@Table(name="PATH4")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path4VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2304700867243308073L;
	
	@Column(name="ID_PATH4")	
	@Id
	private String idPath4;
	
	@Transient
    private String idPath5;
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToOne(targetEntity=Path5VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH5", referencedColumnName="ID_PATH5") })		
	private Path5VO path5VO;

    public String getIdPath4() {
        return idPath4;
    }

    public void setIdPath4(String idPath4) {
        this.idPath4 = idPath4;
    }

    public String getIdPath5() {
        return idPath5;
    }

    public void setIdPath5(String idPath5) {
        this.idPath5 = idPath5;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Path5VO getPath5VO() {
        return path5VO;
    }

    public void setPath5VO(Path5VO path5VO) {
        this.path5VO = path5VO;
    }

    public String toString() {
        String result = "Path4VO [";
        result += "idPath4: " + ((idPath4==null)?"":idPath4.toString());
        result += "idPath5: " + ((idPath5==null)?"":idPath5.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}