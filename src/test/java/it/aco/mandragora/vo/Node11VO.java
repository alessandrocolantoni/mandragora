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
@Table(name="NODE11")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node11VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8626233897576961188L;
	

	@Column(name="ID_NODE11")	
	@Id	
	private String idNode11;
	
	@Column(name="DESCRIPTION")	
    private String description;
	
	@Column(name="NOTE11")	
    private String note11;

	@OneToMany(mappedBy = "node11VO", targetEntity = Node111VO.class, fetch = FetchType.LAZY)
    private Collection<Node111VO> node111VOs;

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

    public String getNote11() {
        return note11;
    }

    public void setNote11(String note11) {
        this.note11 = note11;
    }

    public Collection<Node111VO> getNode111VOs() {
        return node111VOs;
    }

    public void setNode111VOs(Collection<Node111VO> node111VOs) {
        this.node111VOs = node111VOs;
    }



    public String toString() {
        String result = "Node11VO [";
        result += "idNode11: " + ((idNode11==null)?"":idNode11.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += ",\n note11: " + ((note11==null)?"":note11.toString());
        result += "]";
        return result;
    }
}