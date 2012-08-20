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
@Table(name="NODE122")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node122VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7233658649089298809L;
	
	@Column(name="ID_NODE122")	
	@Id	
	private String idNode122;
    
	@Transient
	private String idNode12;
	
	@ManyToOne(targetEntity=Node12VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE12", referencedColumnName="ID_NODE12") })	
	private Node12VO node12VO;
	
    
    @Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="NOTE122")
    private String note122;

    public String getIdNode122() {
        return idNode122;
    }

    public void setIdNode122(String idNode122) {
        this.idNode122 = idNode122;
    }

    public String getIdNode12() {
        return idNode12;
    }

    public void setIdNode12(String idNode12) {
        this.idNode12 = idNode12;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote122() {
        return note122;
    }

    public void setNote122(String note122) {
        this.note122 = note122;
    }

	public Node12VO getNode12VO() {
		return node12VO;
	}

	public void setNode12VO(Node12VO node12VO) {
		this.node12VO = node12VO;
	}
    
    
}