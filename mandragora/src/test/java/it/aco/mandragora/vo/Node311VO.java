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
@Table(name="NODE311")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node311VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6377588532654226983L;
	
	@Column(name="ID_NODE311")	
	@Id
	private String idNode311;
	
	@Transient
    private String idNode31;
	
	@Column(name="DESCRIPTION")	
    private String description;
	
	@Column(name="NOTE311")	
    private String note311;

    @ManyToMany(targetEntity = Node3111VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "NODE311_NODE3111", joinColumns = { @JoinColumn(name = "ID_NODE311") }, inverseJoinColumns = { @JoinColumn(name = "ID_NODE3111") })
	private Collection<Node3111VO> node3111VOs;
    
    @ManyToMany(targetEntity = Node3112VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "NODE311_NODE3112", joinColumns = { @JoinColumn(name = "ID_NODE311") }, inverseJoinColumns = { @JoinColumn(name = "ID_NODE3112") })
	private Collection<Node3112VO> node3112VOs;

    
    @ManyToOne(targetEntity=Node31VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE31", referencedColumnName="ID_NODE31") })	
    private Node31VO node31VO; // added ale 17-08-2011
    
    
    public String getIdNode311() {
        return idNode311;
    }

    public void setIdNode311(String idNode311) {
        this.idNode311 = idNode311;
    }

    public String getIdNode31() {
        return idNode31;
    }

    public void setIdNode31(String idNode31) {
        this.idNode31 = idNode31;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote311() {
        return note311;
    }

    public void setNote311(String note311) {
        this.note311 = note311;
    }

    public Collection<Node3111VO> getNode3111VOs() {
        return node3111VOs;
    }

    public void setNode3111VOs(Collection<Node3111VO> node3111VOs) {
        this.node3111VOs = node3111VOs;
    }

    public Collection<Node3112VO> getNode3112VOs() {
        return node3112VOs;
    }

    public void setNode3112VOs(Collection<Node3112VO> node3112VOs) {
        this.node3112VOs = node3112VOs;
    }

	public Node31VO getNode31VO() {
		return node31VO;
	}

	public void setNode31VO(Node31VO node31VO) {
		this.node31VO = node31VO;
	}
    
    
}