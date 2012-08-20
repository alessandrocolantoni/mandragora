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
@Table(name="REFERENCE1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Reference1VO extends ValueObject implements Serializable{
	   
	/**
	 * 
	 */
	private static final long serialVersionUID = 6716395365981093533L;

	@Column(name="ID_REFERENCE1")	
	@Id
	private String idReference1;
    
    @Transient
    private String idMain;
    
    @ManyToOne(targetEntity=MainVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_MAIN", referencedColumnName="ID_MAIN") })		
	private MainVO mainVO; // added alessandro 17-08-2011
    
    @Column(name="DESCRIPTION")
    private String description;

    public String getIdReference1() {
        return idReference1;
    }

    public void setIdReference1(String idReference1) {
        this.idReference1 = idReference1;
    }

    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public MainVO getMainVO() {
		return mainVO;
	}

	public void setMainVO(MainVO mainVO) {
		this.mainVO = mainVO;
	}
    
    
}