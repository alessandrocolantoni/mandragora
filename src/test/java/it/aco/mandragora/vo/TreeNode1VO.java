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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TREENODE1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1VO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3956170333332922790L;
	

	@Column(name="ID_TREENODE1")	
	@Id
	private String idTreeNode1;
	
	@Transient
    private String idTreeNode0;
	
	@ManyToOne(targetEntity=TreeNode0VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE0", referencedColumnName="ID_TREENODE0") })	
	private TreeNode0VO treeNode0VO ; // added ale 18-08-2011
    
	@Column(name="DESCRIPTION")
	private String description;

	@OneToMany(mappedBy = "treeNode1VO", targetEntity = TreeNode11VO.class, fetch = FetchType.LAZY)
    private Collection<TreeNode11VO> treeNode11VOs;

    public String getIdTreeNode1() {
        return idTreeNode1;
    }

    public void setIdTreeNode1(String idTreeNode1) {
        this.idTreeNode1 = idTreeNode1;
    }

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

    public Collection<TreeNode11VO> getTreeNode11VOs() {
        return treeNode11VOs;
    }

    public void setTreeNode11VOs(Collection<TreeNode11VO> treeNode11VOs) {
        this.treeNode11VOs = treeNode11VOs;
    }

	public TreeNode0VO getTreeNode0VO() {
		return treeNode0VO;
	}

	public void setTreeNode0VO(TreeNode0VO treeNode0VO) {
		this.treeNode0VO = treeNode0VO;
	}
    
    
}