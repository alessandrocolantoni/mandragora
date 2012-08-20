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
@Table(name="TREENODE1131")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1131VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7426744961456450919L;
	
	
	@Column(name="ID_TREENODE1131")	
	@Id
	private String idTreeNode1131;
	
	@Transient
    private String idTreeNode113;
	
	@ManyToOne(targetEntity=TreeNode113VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE113", referencedColumnName="ID_TREENODE113") })	
	private TreeNode113VO treeNode113VO ;// added alessandro 18-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;


    public String getIdTreeNode1131() {
        return idTreeNode1131;
    }

    public void setIdTreeNode1131(String idTreeNode1131) {
        this.idTreeNode1131 = idTreeNode1131;
    }

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

	public TreeNode113VO getTreeNode113VO() {
		return treeNode113VO;
	}

	public void setTreeNode113VO(TreeNode113VO treeNode113VO) {
		this.treeNode113VO = treeNode113VO;
	}
    
    
}