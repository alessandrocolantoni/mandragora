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
@Table(name="TREENODE0")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode0VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3247365948452679815L;
	
	@Column(name="ID_TREENODE0")	
	@Id
	private String idTreeNode0;
	
	@Column(name="DESCRIPTION")
    private String description;

	
	@OneToMany(mappedBy = "treeNode0VO", targetEntity = TreeNode1VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1VO> treeNode1VOs;

    public String getIdTreeNode0() {
        return idTreeNode0;
    }

    public void setIdTreeNode0(String idTreeNode0) {
        this.idTreeNode0 = idTreeNode0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1VO> getTreeNode1VOs() {
        return treeNode1VOs;
    }

    public void setTreeNode1VOs(Collection<TreeNode1VO> treeNode1VOs) {
        this.treeNode1VOs = treeNode1VOs;
    }
}