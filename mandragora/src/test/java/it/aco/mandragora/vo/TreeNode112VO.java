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
@Table(name="TREENODE112")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode112VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -9062529698501523653L;
	

	@Column(name="ID_TREENODE112")	
	@Id
	private String idTreeNode112;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "treeNode112VO", targetEntity = TreeNode1121VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode1121VO> treeNode1121VOs;

    public String getIdTreeNode112() {
        return idTreeNode112;
    }

    public void setIdTreeNode112(String idTreeNode112) {
        this.idTreeNode112 = idTreeNode112;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<TreeNode1121VO> getTreeNode1121VOs() {
        return treeNode1121VOs;
    }

    public void setTreeNode1121VOs(Collection<TreeNode1121VO> treeNode1121VOs) {
        this.treeNode1121VOs = treeNode1121VOs;
    }
}