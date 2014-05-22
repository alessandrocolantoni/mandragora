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
@Table(name="NODE211")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node211VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3528769216302779155L;
	

	@Column(name="ID_NODE211")	
	@Id	
	private String idNode211;
	
	@Transient
    private String idNode21;
    
	@ManyToOne(targetEntity=Node21VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE21", referencedColumnName="ID_NODE21") })	
	private Node21VO node21VO; // added ales 17-08-2011
	
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="NOTE211")
    private String note211;

    public String getIdNode211() {
        return idNode211;
    }

    public void setIdNode211(String idNode211) {
        this.idNode211 = idNode211;
    }

    public String getIdNode21() {
        return idNode21;
    }

    public void setIdNode21(String idNode21) {
        this.idNode21 = idNode21;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote211() {
        return note211;
    }

    public void setNote211(String note211) {
        this.note211 = note211;
    }

	public Node21VO getNode21VO() {
		return node21VO;
	}

	public void setNode21VO(Node21VO node21VO) {
		this.node21VO = node21VO;
	}
    
    
}