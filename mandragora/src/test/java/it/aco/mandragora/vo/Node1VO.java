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
@Table(name="NODE1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node1VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7160638488828625973L;
	
	@Column(name="ID_NODE1")	
	@Id	
	private String idNode1;
	
	@Transient
    private String idNode11;
	
	@Transient
    private String idRoot;
	
	@ManyToOne(targetEntity=RootVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ROOT", referencedColumnName="ID_ROOT") })	
	private RootVO rootVO;
	
	@Column(name="DESCRIPTION")
    private String description;
    
	@Column(name="NOTE1")
	private String note1;

	
	@ManyToOne(targetEntity=Node11VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE11", referencedColumnName="ID_NODE11") })	
    private Node11VO node11VO;
	
	@OneToMany(mappedBy = "node1VO", targetEntity = Node12VO.class, fetch = FetchType.LAZY)
    private Collection<Node12VO> node12VOs;

    public String getIdNode1() {
        return idNode1;
    }

    public void setIdNode1(String idNode1) {
        this.idNode1 = idNode1;
    }

    public String getIdNode11() {
        return idNode11;
    }

    public void setIdNode11(String idNode11) {
        this.idNode11 = idNode11;
    }

    public String getIdRoot() {
        return idRoot;
    }

    public void setIdRoot(String idRoot) {
        this.idRoot = idRoot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public Node11VO getNode11VO() {
        return node11VO;
    }

    public void setNode11VO(Node11VO node11VO) {
        this.node11VO = node11VO;
    }

    public Collection<Node12VO> getNode12VOs() {
        return node12VOs;
    }

    public void setNode12VOs(Collection<Node12VO> node12VOs) {
        this.node12VOs = node12VOs;
    }

    
    

    public RootVO getRootVO() {
		return rootVO;
	}

	public void setRootVO(RootVO rootVO) {
		this.rootVO = rootVO;
	}

	public String toString() {
        String result = "Node1VO [";
        result += "idNode1: " + ((idNode1==null)?"":idNode1.toString());
        result += ",\n idNode11: " + ((idNode11==null)?"":idNode11.toString());
        result += ",\n idRoot: " + ((idRoot==null)?"":idRoot.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}