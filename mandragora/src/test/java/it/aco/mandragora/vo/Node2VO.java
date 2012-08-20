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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="NODE2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node2VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 740058906644675487L;
	
	@Column(name="ID_NODE2")	
	@Id	
	private String idNode2;
	
	@Transient
    private String idNode21;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE2")
    private String note2;

    
    @ManyToOne(targetEntity=Node21VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE21", referencedColumnName="ID_NODE21") })	
    private Node21VO node21VO;
    
    @ManyToMany(targetEntity = Node22VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "NODE2_NODE22", joinColumns = { @JoinColumn(name = "ID_NODE2") }, inverseJoinColumns = { @JoinColumn(name = "ID_NODE22") })
	private Collection<Node22VO> node22VOs;

    public String getIdNode2() {
        return idNode2;
    }

    public void setIdNode2(String idNode2) {
        this.idNode2 = idNode2;
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

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public Node21VO getNode21VO() {
        return node21VO;
    }

    public void setNode21VO(Node21VO node21VO) {
        this.node21VO = node21VO;
    }

    public Collection<Node22VO> getNode22VOs() {
        return node22VOs;
    }

    public void setNode22VOs(Collection<Node22VO> node22VOs) {
        this.node22VOs = node22VOs;
    }
}