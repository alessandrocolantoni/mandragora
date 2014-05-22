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
@Table(name="PATH0")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path0VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6094642809719895720L;
	
	@Column(name="ID_PATH0")	
	@Id
	private String idPath0;
	
	@Transient
    private String idPath1;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@ManyToOne(targetEntity=Path1VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH1", referencedColumnName="ID_PATH1") })		
	private Path1VO path1VO;

    public String getIdPath0() {
        return idPath0;
    }

    public void setIdPath0(String idPath0) {
        this.idPath0 = idPath0;
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

    public Path1VO getPath1VO() {
        return path1VO;
    }

    public void setPath1VO(Path1VO path1VO) {
        this.path1VO = path1VO;
    }
}