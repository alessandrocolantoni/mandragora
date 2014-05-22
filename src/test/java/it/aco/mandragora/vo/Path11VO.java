package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Table(name="PATH11")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Path11VO extends ValueObject  implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -2842516044906066057L;
	
	@Column(name="ID_PATH11")	
	@Id
	private String idPath11;
    
	
	@Column(name="DESCRIPTION")
	private String description;

    public String getIdPath11() {
        return idPath11;
    }

    public void setIdPath11(String idPath11) {
        this.idPath11 = idPath11;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}