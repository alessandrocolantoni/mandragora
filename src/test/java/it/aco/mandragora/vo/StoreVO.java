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
@Table(name="STORE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class StoreVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4329097878653137053L;
	
	@Column(name="ID_STORE")	
	@Id
	private String idStore;
	
	@Transient
    private String idAdministration;
	
	@Column(name="DESCRIPTION")	
    private String description;
                      
    
    @ManyToOne(targetEntity=AdministrationVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_ADMINISTRATION", referencedColumnName="ID_ADMINISTRATION") })	
    private AdministrationVO  administrationVO ;
    
    @ManyToMany(targetEntity = CategoryVO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "STORE_CATEGORY", joinColumns = { @JoinColumn(name = "ID_STORE") }, inverseJoinColumns = { @JoinColumn(name = "ID_CATEGORY") })
	private Collection<CategoryVO> categoryVOs;

    public String getIdStore() {
        return idStore;
    }

    public void setIdStore(String idStore) {
        this.idStore = idStore;
    }

    public String getIdAdministration() {
        return idAdministration;
    }

    public void setIdAdministration(String idAdministration) {
        this.idAdministration = idAdministration;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdministrationVO getAdministrationVO() {
        return administrationVO;
    }

    public void setAdministrationVO(AdministrationVO administrationVO) {
        this.administrationVO = administrationVO;
    }

    public Collection<CategoryVO> getCategoryVOs() {
        return categoryVOs;
    }

    public void setCategoryVOs(Collection<CategoryVO> categoryVOs) {
        this.categoryVOs = categoryVOs;
    }

    public String toString() {
        String result = "StoreVO [";
        result += "idStore: " + ((idStore==null)?"":idStore.toString());
        result += "idAdministration: " + ((idAdministration==null)?"":idAdministration.toString());
        result += ",\n description: " + ((description==null)?"":description.toString());
        result += "]";
        return result;
    }
}

