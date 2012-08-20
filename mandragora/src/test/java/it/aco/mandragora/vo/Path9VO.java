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
@Table(name="PATH9")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path9VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3447655633837302975L;
	

	@Column(name="ID_PATH9")	
	@Id
	private String idPath9;
	
	@Transient
    private String idPath8;
	
	@ManyToOne(targetEntity=Path8VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH8", referencedColumnName="ID_PATH8") })		
	private Path8VO path8VO; // added ale 18-8-2011
	
	@Transient
    private String idPath10;
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToOne(targetEntity=Path10VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH10", referencedColumnName="ID_PATH10") })		
    private Path10VO path10VO;

    public String getIdPath9() {
        return idPath9;
    }

    public void setIdPath9(String idPath9) {
        this.idPath9 = idPath9;
    }

    public String getIdPath8() {
    	if(path8VO!=null){
    		return path8VO.getIdPath8();
    	}
        return idPath8;
    }

    public void setIdPath8(String idPath8) {
        this.idPath8 = idPath8;
    }

    public String getIdPath10() {
    	if(path10VO!= null){
    		return path10VO.getIdPath10();
    	}
        return idPath10;
    }

    public void setIdPath10(String idPath10) {
        this.idPath10 = idPath10;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Path10VO getPath10VO() {
        return path10VO;
    }

    public void setPath10VO(Path10VO path10VO) {
        this.path10VO = path10VO;
    }

	public Path8VO getPath8VO() {
		return path8VO;
	}

	public void setPath8VO(Path8VO path8VO) {
		this.path8VO = path8VO;
	}
    
    
}