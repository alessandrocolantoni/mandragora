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
@Table(name="PATH10")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path10VO extends ValueObject  implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5165162995245521418L;
	

	@Column(name="ID_PATH10")	
	@Id
	private String idPath10;
	
	@Transient
    private String idPath11;
	
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToOne(targetEntity=Path11VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PATH11", referencedColumnName="ID_PATH11") })	
    private Path11VO path11VO;

    public String getIdPath10() {
        return idPath10;
    }

    public void setIdPath10(String idPath10) {
        this.idPath10 = idPath10;
    }

    public String getIdPath11() {
        return idPath11;
    }

    public void setIdPath11(String idPath11) {
        this.idPath11 = idPath11;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Path11VO getPath11VO() {
        return path11VO;
    }

    public void setPath11VO(Path11VO path11VO) {
        this.path11VO = path11VO;
    }
}