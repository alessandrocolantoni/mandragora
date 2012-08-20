package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="NODE111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node111VO extends ValueObject implements Serializable{
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6768185357985934049L;
	

	
	@Column(name="ID_NODE111")	
	@Id	
	private String idNode111;
	

	@Transient	
    private String idNode11;

	@Column(name="DESCRIPTION")	
	private String description;

	@Column(name="NOTE111")	
    private String note111;

	@ManyToOne(targetEntity=Node11VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_NODE11", referencedColumnName="ID_NODE11") })	
	private Node11VO node11VO;
	
    public String getIdNode111() {
        return idNode111;
    }

    public void setIdNode111(String idNode111) {
        this.idNode111 = idNode111;
    }

    public String getIdNode11() {
        return idNode11;
    }

    public void setIdNode11(String idNode11) {
        this.idNode11 = idNode11;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote111() {
        return note111;
    }

    public void setNote111(String note111) {
        this.note111 = note111;
    }

	public Node11VO getNode11VO() {
		return node11VO;
	}

	public void setNode11VO(Node11VO node11VO) {
		this.node11VO = node11VO;
	}
    
    
}