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
@Table(name="NODE21")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node21VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7211304653036407809L;
	
	@Column(name="ID_NODE21")	
	@Id	
	private String idNode21;
	
	
	@Column(name="DESCRIPTION")
    private String description;
    
    @Column(name="NOTE21")
    private String note21;

    @OneToMany(mappedBy = "node21VO", targetEntity = Node211VO.class, fetch = FetchType.LAZY)
    private Collection<Node211VO> node211VOs;

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

    public Collection<Node211VO> getNode211VOs() {
        return node211VOs;
    }

    public void setNode211VOs(Collection<Node211VO> node211VOs) {
        this.node211VOs = node211VOs;
    }

    public String getNote21() {
        return note21;
    }

    public void setNote21(String note21) {
        this.note21 = note21;
    }
}