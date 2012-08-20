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
@Table(name="PATH5")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path5VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8747191912485690997L;
	
	@Column(name="ID_PATH5")	
	@Id
	private String idPath5;
	
	@Transient
    private String idPath6;
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToOne(targetEntity=Path6VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH6", referencedColumnName="ID_PATH6") })		
    private Path6VO path6VO;

    public String getIdPath5() {
        return idPath5;
    }

    public void setIdPath5(String idPath5) {
        this.idPath5 = idPath5;
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

    public Path6VO getPath6VO() {
        return path6VO;
    }

    public void setPath6VO(Path6VO path6VO) {
        this.path6VO = path6VO;
    }
}