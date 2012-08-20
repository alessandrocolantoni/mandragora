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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="NODE31")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node31VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5235213077386731316L;
	
	@Column(name="ID_NODE31")	
	@Id
	private String idNode31;
	
	@Transient
    private String idNode3;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE31")
    private String note31;

	
	@OneToMany(mappedBy = "node31VO", targetEntity = Node311VO.class, fetch = FetchType.LAZY)
    private Collection<Node311VO> node311VOs;
    
    @ManyToOne(targetEntity=Node3VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE3", referencedColumnName="ID_NODE3") })	
    private Node3VO node3VO; // added alessandro 17-08-2011

    public String getIdNode31() {
        return idNode31;
    }

    public void setIdNode31(String idNode31) {
        this.idNode31 = idNode31;
    }

    public String getIdNode3() {
        return idNode3;
    }

    public void setIdNode3(String idNode3) {
        this.idNode3 = idNode3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote31() {
        return note31;
    }

    public void setNote31(String note31) {
        this.note31 = note31;
    }

    public Collection<Node311VO> getNode311VOs() {
        return node311VOs;
    }

    public void setNode311VOs(Collection<Node311VO> node311VOs) {
        this.node311VOs = node311VOs;
    }

	public Node3VO getNode3VO() {
		return node3VO;
	}

	public void setNode3VO(Node3VO node3VO) {
		this.node3VO = node3VO;
	}
    
    
}