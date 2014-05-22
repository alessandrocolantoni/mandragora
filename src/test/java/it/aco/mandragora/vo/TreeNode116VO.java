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
@Table(name="TREENODE116")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode116VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3623104719333302789L;
	

	@Column(name="ID_TREENODE116")	
	@Id
	private String idTreeNode116;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "treeNode116VO", targetEntity = TreeNode1161VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1161VO> treeNode1161VOs;

    public String getIdTreeNode116() {
        return idTreeNode116;
    }

    public void setIdTreeNode116(String idTreeNode116) {
        this.idTreeNode116 = idTreeNode116;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1161VO> getTreeNode1161VOs() {
        return treeNode1161VOs;
    }

    public void setTreeNode1161VOs(Collection<TreeNode1161VO> treeNode1161VOs) {
        this.treeNode1161VOs = treeNode1161VOs;
    }
}