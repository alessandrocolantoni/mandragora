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
@Table(name="NODE221")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node221VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6535636465357700382L;
	
	@Column(name="ID_NODE221")	
	@Id	
	private String idNode221;
	
	@Transient
    private String idNode22;
	
	@ManyToOne(targetEntity=Node22VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE22", referencedColumnName="ID_NODE22") })	
	private Node22VO node22VO; // added alessandro 17-08-2011
	
    
    @Column(name="DESCRIPTION")	
    private String description;
    
    @Column(name="NOTE221")	
    private String note221;

    public String getIdNode221() {
        return idNode221;
    }

    public void setIdNode221(String idNode221) {
        this.idNode221 = idNode221;
    }

    public String getIdNode22() {
        return idNode22;
    }

    public void setIdNode22(String idNode22) {
        this.idNode22 = idNode22;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote221() {
        return note221;
    }

    public void setNote221(String note221) {
        this.note221 = note221;
    }

	public Node22VO getNode22VO() {
		return node22VO;
	}

	public void setNode22VO(Node22VO node22VO) {
		this.node22VO = node22VO;
	}
    
    
}