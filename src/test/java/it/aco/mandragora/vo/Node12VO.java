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
@Table(name="NODE12")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node12VO extends ValueObject implements Serializable{
	
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6794852123322514920L;
	
	@Column(name="ID_NODE12")	
	@Id	
	private String idNode12;
	
	@Transient
    private String idNode121;
	
	@Transient
    private String idNode1;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE12")
    private String note12;

	@ManyToOne(targetEntity=Node121VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE121", referencedColumnName="ID_NODE121") })	
    private Node121VO  node121VO;
    
	@ManyToOne(targetEntity=Node1VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE1", referencedColumnName="ID_NODE1") })	
    private Node1VO node1VO ; // added alessandro 17-08-2011
    
	
	@OneToMany(mappedBy = "node12VO", targetEntity = Node122VO.class, fetch = FetchType.LAZY)
    private Collection<Node122VO> node122VOs;

    public String getIdNode12() {
        return idNode12;
    }

    public void setIdNode12(String idNode12) {
        this.idNode12 = idNode12;
    }

    public String getIdNode121() {
        return idNode121;
    }

    public void setIdNode121(String idNode121) {
        this.idNode121 = idNode121;
    }

    public String getIdNode1() {
        return idNode1;
    }

    public void setIdNode1(String idNode1) {
        this.idNode1 = idNode1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote12() {
        return note12;
    }

    public void setNote12(String note12) {
        this.note12 = note12;
    }

    public Node121VO getNode121VO() {
        return node121VO;
    }

    public void setNode121VO(Node121VO node121VO) {
        this.node121VO = node121VO;
    }

    public Collection<Node122VO> getNode122VOs() {
        return node122VOs;
    }

    public void setNode122VOs(Collection<Node122VO> node122VOs) {
        this.node122VOs = node122VOs;
    }

	public Node1VO getNode1VO() {
		return node1VO;
	}

	public void setNode1VO(Node1VO node1VO) {
		this.node1VO = node1VO;
	}
    
    
    
}