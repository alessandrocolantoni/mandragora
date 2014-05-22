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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ROOT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class RootVO extends ValueObject  implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7356569926519385597L;
	@Column(name="ID_ROOT")	
	@Id	
    private String idRoot;
	
	@Transient
    private String idNode3;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTEROOT")
    private String noteRoot;

	@OneToMany(mappedBy = "rootVO", targetEntity = Node1VO.class, fetch = FetchType.LAZY)
    private Collection<Node1VO> node1VOs;
	
	@ManyToMany(targetEntity = Node2VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "ROOT_NODE2", joinColumns = { @JoinColumn(name = "ID_ROOT") }, inverseJoinColumns = { @JoinColumn(name = "ID_NODE2") })
	private Collection<Node2VO> node2VOs;
    
    @ManyToOne(targetEntity=Node3VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE3", referencedColumnName="ID_NODE3") })	
    private Node3VO node3VO;

    public String getIdRoot() {
        return idRoot;
    }

    public void setIdRoot(String idRoot) {
        this.idRoot = idRoot;
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

    public String getNoteRoot() {
        return noteRoot;
    }

    public void setNoteRoot(String noteRoot) {
        this.noteRoot = noteRoot;
    }

    public Collection<Node1VO> getNode1VOs() {
        return node1VOs;
    }

    public void setNode1VOs(Collection<Node1VO> node1VOs) {
        this.node1VOs = node1VOs;
    }

    public Collection<Node2VO> getNode2VOs() {
        return node2VOs;
    }

    public void setNode2VOs(Collection<Node2VO> node2VOs) {
        this.node2VOs = node2VOs;
    }

    public Node3VO getNode3VO() {
        return node3VO;
    }

    public void setNode3VO(Node3VO node3VO) {
        this.node3VO = node3VO;
    }
}