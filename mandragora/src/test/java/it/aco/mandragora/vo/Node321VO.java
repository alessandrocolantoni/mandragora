package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="NODE321")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Node321VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -286426509464477890L;
	@Column(name="ID_NODE321")	
	@Id
	private String idNode321;
	
	@Column(name="DESCRIPTION")
    private String description;
	
	@Column(name="NOTE321")
    private String note321;

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

    public String getNote321() {
        return note321;
    }

    public void setNote321(String note321) {
        this.note321 = note321;
    }
}