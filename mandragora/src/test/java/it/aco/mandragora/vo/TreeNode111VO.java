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
@Table(name="TREENODE111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode111VO extends ValueObject implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3662858486525089472L;
	
	@Column(name="ID_TREENODE111")	
	@Id
	private String idTreeNode111;
	
	@Column(name="DESCRIPTION")
    private String description;


	@OneToMany(mappedBy = "treeNode111VO", targetEntity = TreeNode1111VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1111VO> treeNode1111VOs;

    public String getIdTreeNode111() {
        return idTreeNode111;
    }

    public void setIdTreeNode111(String idTreeNode111) {
        this.idTreeNode111 = idTreeNode111;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1111VO> getTreeNode1111VOs() {
        return treeNode1111VOs;
    }

    public void setTreeNode1111VOs(Collection<TreeNode1111VO> treeNode1111VOs) {
        this.treeNode1111VOs = treeNode1111VOs;
    }
}