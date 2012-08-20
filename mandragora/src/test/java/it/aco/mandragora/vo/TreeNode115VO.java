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
@Table(name="TREENODE115")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode115VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4214599579074090541L;
	

	@Column(name="ID_TREENODE115")	
	@Id
	private String idTreeNode115;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "treeNode115VO", targetEntity = TreeNode1151VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1151VO> treeNode1151VOs;

    public String getIdTreeNode115() {
        return idTreeNode115;
    }

    public void setIdTreeNode115(String idTreeNode115) {
        this.idTreeNode115 = idTreeNode115;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1151VO> getTreeNode1151VOs() {
        return treeNode1151VOs;
    }

    public void setTreeNode1151VOs(Collection<TreeNode1151VO> treeNode1151VOs) {
        this.treeNode1151VOs = treeNode1151VOs;
    }
}