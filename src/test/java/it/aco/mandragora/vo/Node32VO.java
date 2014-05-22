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
@Table(name="NODE32")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node32VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3731978698891351797L;
	
	@Column(name="ID_NODE32")	
	@Id	
	private String idNode32;
	
	@Transient
    private String idNode321;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE32")
    private String note32;

	
	@ManyToOne(targetEntity=Node321VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE321", referencedColumnName="ID_NODE321") })	
    private Node321VO node321VO;
	
	@OneToMany(mappedBy = "node32VO", targetEntity = Node322VO.class, fetch = FetchType.LAZY)
    private Collection<Node322VO> node322VOs;

    public String getIdNode32() {
        return idNode32;
    }

    public void setIdNode32(String idNode32) {
        this.idNode32 = idNode32;
    }

    public String getIdNode321() {
        return idNode321;
    }

    public void setIdNode321(String idNode321) {
        this.idNode321 = idNode321;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote32() {
        return note32;
    }

    public void setNote32(String note32) {
        this.note32 = note32;
    }

    public Node321VO getNode321VO() {
        return node321VO;
    }

    public void setNode321VO(Node321VO node321VO) {
        this.node321VO = node321VO;
    }

    public Collection<Node322VO> getNode322VOs() {
        return node322VOs;
    }

    public void setNode322VOs(Collection<Node322VO> node322VOs) {
        this.node322VOs = node322VOs;
    }
}