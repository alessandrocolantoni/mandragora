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
@Table(name="TREENODE114")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode114VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -7746571110149912797L;
	
	@Column(name="ID_TREENODE114")	
	@Id
	private String idTreeNode114;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "treeNode114VO", targetEntity = TreeNode1141VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1141VO> treeNode1141VOs;

    public String getIdTreeNode114() {
        return idTreeNode114;
    }

    public void setIdTreeNode114(String idTreeNode114) {
        this.idTreeNode114 = idTreeNode114;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1141VO> getTreeNode1141VOs() {
        return treeNode1141VOs;
    }

    public void setTreeNode1141VOs(Collection<TreeNode1141VO> treeNode1141VOs) {
        this.treeNode1141VOs = treeNode1141VOs;
    }
}