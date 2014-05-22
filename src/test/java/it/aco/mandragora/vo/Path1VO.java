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
@Table(name="PATH1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path1VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5160319651948523689L;
	
	@Column(name="ID_PATH1")	
	@Id
	private String idPath1;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@OneToMany(mappedBy = "path1VO", targetEntity = Path2VO.class, fetch = FetchType.LAZY)
    private Collection<Path2VO> path2VOs;

    public String getIdPath1() {
        return idPath1;
    }

    public void setIdPath1(String idPath1) {
        this.idPath1 = idPath1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Path2VO> getPath2VOs() {
        return path2VOs;
    }

    public void setPath2VOs(Collection<Path2VO> path2VOs) {
        this.path2VOs = path2VOs;
    }
}