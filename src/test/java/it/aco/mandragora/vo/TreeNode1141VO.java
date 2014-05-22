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
@Table(name="TREENODE1141")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1141VO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3239396764937766135L;
	
	@Column(name="ID_TREENODE1141")	
	@Id
	private String idTreeNode1141;
	
	@Transient
    private String idTreeNode114;
	
	
	@ManyToOne(targetEntity=TreeNode114VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE114", referencedColumnName="ID_TREENODE114") })	
	private TreeNode114VO treeNode114VO;// added alessandro 18-08-2011
	
	
	@Column(name="DESCRIPTION")
    private String description;


    public String getIdTreeNode1141() {
        return idTreeNode1141;
    }

    public void setIdTreeNode1141(String idTreeNode1141) {
        this.idTreeNode1141 = idTreeNode1141;
    }

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

	public TreeNode114VO getTreeNode114VO() {
		return treeNode114VO;
	}

	public void setTreeNode114VO(TreeNode114VO treeNode114VO) {
		this.treeNode114VO = treeNode114VO;
	}
    
    
}