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
@Table(name="TREENODE1151")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1151VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -642842772179474025L;
	@Column(name="ID_TREENODE1151")	
	@Id
	private String idTreeNode1151;
	
	@Transient
    private String idTreeNode115;
	
	@ManyToOne(targetEntity=TreeNode115VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE115", referencedColumnName="ID_TREENODE115") })	
	private TreeNode115VO treeNode115VO;// added alessandro 18-08-2011
	
	@Column(name="DESCRIPTION")
    private String description;

    public String getIdTreeNode1151() {
        return idTreeNode1151;
    }

    public void setIdTreeNode1151(String idTreeNode1151) {
        this.idTreeNode1151 = idTreeNode1151;
    }

    public String getIdTreeNode115() {
        return idTreeNode115;
    }

    public void setIdTreeNode115(String idTreeNode115) {
        this.idTreeNode115 = idTreeNode115;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public TreeNode115VO getTreeNode115VO() {
		return treeNode115VO;
	}

	public void setTreeNode115VO(TreeNode115VO treeNode115VO) {
		this.treeNode115VO = treeNode115VO;
	}
    
    
}