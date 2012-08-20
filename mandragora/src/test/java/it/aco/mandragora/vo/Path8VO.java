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
@Table(name="PATH8")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path8VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3608901490223807006L;
	

	@Column(name="ID_PATH8")	
	@Id
	private String idPath8;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "path8VO", targetEntity = Path9VO.class, fetch = FetchType.LAZY)
    private Collection<Path9VO> path9VOs;

    public String getIdPath8() {
        return idPath8;
    }

    public void setIdPath8(String idPath8) {
        this.idPath8 = idPath8;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Path9VO> getPath9VOs() {
        return path9VOs;
    }

    public void setPath9VOs(Collection<Path9VO> path9VOs) {
        this.path9VOs = path9VOs;
    }
}