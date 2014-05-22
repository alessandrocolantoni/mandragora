package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TREENODE1161")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1161VO extends ValueObject  implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5483993380131185615L;
	
	@Column(name="ID_TREENODE1161")	
	@Id
	private String idTreeNode1161;
	
	@Transient
    private String idTreeNode116;
	
	@ManyToOne(targetEntity=TreeNode116VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE116", referencedColumnName="ID_TREENODE116") })	
	private TreeNode116VO treeNode116VO;// added alessandro 18-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdTreeNode1161() {
        return idTreeNode1161;
    }

    public void setIdTreeNode1161(String idTreeNode1161) {
        this.idTreeNode1161 = idTreeNode1161;
    }

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

	public TreeNode116VO getTreeNode116VO() {
		return treeNode116VO;
	}

	public void setTreeNode116VO(TreeNode116VO treeNode116VO) {
		this.treeNode116VO = treeNode116VO;
	}
    
    
}