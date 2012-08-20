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
@Table(name="PATH6")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path6VO extends ValueObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 990138406720685654L;
	
	
	@Column(name="ID_PATH6")	
	@Id
    private String idPath6;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "path6VO", targetEntity = Path7VO.class, fetch = FetchType.LAZY)
    private Collection<Path7VO> path7VOs;

    public String getIdPath6() {
        return idPath6;
    }

    public void setIdPath6(String idPath6) {
        this.idPath6 = idPath6;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Path7VO> getPath7VOs() {
        return path7VOs;
    }

    public void setPath7VOs(Collection<Path7VO> path7VOs) {
        this.path7VOs = path7VOs;
    }
}