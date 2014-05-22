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
@Table(name="NODE322")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node322VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7465249819595403496L;
	
	
	@Column(name="ID_NODE322")	
	@Id	
	private String idNode322;
	
	@Transient
    private String idNode32;
	
	@ManyToOne(targetEntity=Node32VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE32", referencedColumnName="ID_NODE32") })	
	private Node32VO node32VO; // added  ale 17-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE322")
    private String note322;

    public String getIdNode322() {
        return idNode322;
    }

    public void setIdNode322(String idNode322) {
        this.idNode322 = idNode322;
    }

    public String getIdNode32() {
        return idNode32;
    }

    public void setIdNode32(String idNode32) {
        this.idNode32 = idNode32;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote322() {
        return note322;
    }

    public void setNote322(String note322) {
        this.note322 = note322;
    }

	public Node32VO getNode32VO() {
		return node32VO;
	}

	public void setNode32VO(Node32VO node32VO) {
		this.node32VO = node32VO;
	}
    
    
    
}