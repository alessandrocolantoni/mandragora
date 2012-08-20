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
@Table(name="TREENODE1121")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1121VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2910206989627747457L;
	

	@Column(name="ID_TREENODE1121")	
	@Id
	private String idTreeNode1121;
	
	@Transient
    private String idTreeNode112;
	
	@ManyToOne(targetEntity=TreeNode112VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE112", referencedColumnName="ID_TREENODE112") })	
	private TreeNode112VO treeNode112VO; // added ale 18-08-2011
    
	@Column(name="DESCRIPTION")
	private String description;


    public String getIdTreeNode1121() {
        return idTreeNode1121;
    }

    public void setIdTreeNode1121(String idTreeNode1121) {
        this.idTreeNode1121 = idTreeNode1121;
    }

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

	public TreeNode112VO getTreeNode112VO() {
		return treeNode112VO;
	}

	public void setTreeNode112VO(TreeNode112VO treeNode112VO) {
		this.treeNode112VO = treeNode112VO;
	}
    
    
}