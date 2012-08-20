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
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PATH7")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path7VO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4729717904878000294L;
	

	@Column(name="ID_PATH7")	
	@Id
	private String idPath7;
	
	@Transient
    private String idPath6;
	
	@ManyToOne(targetEntity=Path6VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH6", referencedColumnName="ID_PATH6") })		
	private Path6VO path6VO; // added alessandro 18-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@ManyToMany(targetEntity = Path8VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "PATH7_PATH8", joinColumns = { @JoinColumn(name = "ID_PATH7") }, inverseJoinColumns = { @JoinColumn(name = "ID_PATH8") })
    private Collection<Path8VO> path8VOs;

    public String getIdPath7() {
        return idPath7;
    }

    public void setIdPath7(String idPath7) {
        this.idPath7 = idPath7;
    }

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

    public Collection<Path8VO> getPath8VOs() {
        return path8VOs;
    }

    public void setPath8VOs(Collection<Path8VO> path8VOs) {
        this.path8VOs = path8VOs;
    }

	public Path6VO getPath6VO() {
		return path6VO;
	}

	public void setPath6VO(Path6VO path6VO) {
		this.path6VO = path6VO;
	}
    
    
}