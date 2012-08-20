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
@Table(name="CATEGORY")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CategoryVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -2113127696018007163L;
	
	@Column(name="ID_CATEGORY")	
	@Id	
	private String idCategory;
	
	@Column(name="DESCRIPTION")	
    private String description;

	
	@OneToMany(mappedBy = "subCategoryVOPK.categoryVO", targetEntity = SubCategoryVO.class, fetch = FetchType.LAZY)
    private Collection<SubCategoryVO> subCategoryVOs;

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<SubCategoryVO> getSubCategoryVOs() {
        return subCategoryVOs;
    }

    public void setSubCategoryVOs(Collection<SubCategoryVO> subCategoryVOs) {
        this.subCategoryVOs = subCategoryVOs;
    }
}