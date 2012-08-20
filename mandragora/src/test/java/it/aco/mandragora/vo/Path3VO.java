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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PATH3")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path3VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8458970137030213905L;
	

	@Column(name="ID_PATH3")	
	@Id
	private String idPath3;
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToMany(targetEntity = Path4VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "PATH3_PATH4", joinColumns = { @JoinColumn(name = "ID_PATH3") }, inverseJoinColumns = { @JoinColumn(name = "ID_PATH4") })
    private Collection<Path4VO> path4VOs;

    public String getIdPath3() {
        return idPath3;
    }

    public void setIdPath3(String idPath3) {
        this.idPath3 = idPath3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Path4VO> getPath4VOs() {
        return path4VOs;
    }

    public void setPath4VOs(Collection<Path4VO> path4VOs) {
        this.path4VOs = path4VOs;
    }

    public String toString() {
        String result = "Path3VO [";
        result += "idPath3: " + ((idPath3==null)?"":idPath3.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}