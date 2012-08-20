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
@Table(name="PATH2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path2VO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5985483724496695728L;
	
	@Column(name="ID_PATH2")	
	@Id
	private String idPath2;
	
	@Transient
    private String idPath1;
	
	@ManyToOne(targetEntity=Path1VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH1", referencedColumnName="ID_PATH1") })		
	private Path1VO path1VO; // added ale 18-08-2011
	
	
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@ManyToMany(targetEntity = Path3VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "PATH2_PATH3", joinColumns = { @JoinColumn(name = "ID_PATH2") }, inverseJoinColumns = { @JoinColumn(name = "ID_PATH3") })
	private Collection<Path3VO> path3VOs;

    public String getIdPath2() {
        return idPath2;
    }

    public void setIdPath2(String idPath2) {
        this.idPath2 = idPath2;
    }

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

    public Collection<Path3VO> getPath3VOs() {
        return path3VOs;
    }

    public void setPath3VOs(Collection<Path3VO> path3VOs) {
        this.path3VOs = path3VOs;
    }

	public Path1VO getPath1VO() {
		return path1VO;
	}

	public void setPath1VO(Path1VO path1VO) {
		this.path1VO = path1VO;
	}
    
    
}