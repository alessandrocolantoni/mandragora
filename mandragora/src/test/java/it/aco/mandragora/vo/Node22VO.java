package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="NODE22")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node22VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4725691543163161179L;
	

	@Column(name="ID_NODE22")	
	@Id	
	private String idNode22;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE22")
    private String note22;

	
	@OneToMany(mappedBy = "node22VO", targetEntity = Node221VO.class, fetch = FetchType.LAZY)
    private Collection<Node221VO> node221VOs;

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

    public Collection<Node221VO> getNode221VOs() {
        return node221VOs;
    }

    public void setNode221VOs(Collection<Node221VO> node221VOs) {
        this.node221VOs = node221VOs;
    }

    public String getNote22() {
        return note22;
    }

    public void setNote22(String note22) {
        this.note22 = note22;
    }
}