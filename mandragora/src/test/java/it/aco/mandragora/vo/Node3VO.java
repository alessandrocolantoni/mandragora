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
@Table(name="NODE3")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node3VO extends ValueObject implements Serializable {
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1184766146202479541L;
	
	@Column(name="ID_NODE3")	
	@Id	
	private String idNode3;
	
	@Transient
    private String idNode33;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE3")
    private String note3;

	
	@OneToMany(mappedBy = "node3VO", targetEntity = Node31VO.class, fetch = FetchType.LAZY)
    private Collection<Node31VO> node31VOs ;
	
	@ManyToMany(targetEntity = Node32VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "NODE3_NODE32", joinColumns = { @JoinColumn(name = "ID_NODE3") }, inverseJoinColumns = { @JoinColumn(name = "ID_NODE32") })
	private Collection<Node32VO> node32VOs ;
    
    @ManyToOne(targetEntity=Node33VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE33", referencedColumnName="ID_NODE33") })	
    private Node33VO node33VO;

    public String getIdNode3() {
        return idNode3;
    }

    public void setIdNode3(String idNode3) {
        this.idNode3 = idNode3;
    }

    public String getIdNode33() {
        return idNode33;
    }

    public void setIdNode33(String idNode33) {
        this.idNode33 = idNode33;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public Collection<Node31VO> getNode31VOs() {
        return node31VOs;
    }

    public void setNode31VOs(Collection<Node31VO> node31VOs) {
        this.node31VOs = node31VOs;
    }

    public Collection<Node32VO> getNode32VOs() {
        return node32VOs;
    }

    public void setNode32VOs(Collection<Node32VO> node32VOs) {
        this.node32VOs = node32VOs;
    }

    public Node33VO getNode33VO() {
        return node33VO;
    }

    public void setNode33VO(Node33VO node33VO) {
        this.node33VO = node33VO;
    }
}