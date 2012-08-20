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
@Table(name="TREENODE113")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode113VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8545107813283193341L;
	
	@Column(name="ID_TREENODE113")	
	@Id
	private String idTreeNode113;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "treeNode113VO", targetEntity = TreeNode1131VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1131VO> treeNode1131VOs;

    public String getIdTreeNode113() {
        return idTreeNode113;
    }

    public void setIdTreeNode113(String idTreeNode113) {
        this.idTreeNode113 = idTreeNode113;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1131VO> getTreeNode1131VOs() {
        return treeNode1131VOs;
    }

    public void setTreeNode1131VOs(Collection<TreeNode1131VO> treeNode1131VOs) {
        this.treeNode1131VOs = treeNode1131VOs;
    }
}