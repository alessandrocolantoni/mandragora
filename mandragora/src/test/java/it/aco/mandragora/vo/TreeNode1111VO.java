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
@Table(name="TREENODE1111")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode1111VO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6523582012649674383L;
	
	@Column(name="ID_TREENODE1111")	
	@Id
	private String idTreeNode1111;
	
	@Transient
    private String idTreeNode111;
	
	@ManyToOne(targetEntity=TreeNode111VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE111", referencedColumnName="ID_TREENODE111") })	
	private TreeNode111VO treeNode111VO;
	
	@Column(name="DESCRIPTION")
    private String description;


    public String getIdTreeNode1111() {
        return idTreeNode1111;
    }

    public void setIdTreeNode1111(String idTreeNode1111) {
        this.idTreeNode1111 = idTreeNode1111;
    }

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

	public TreeNode111VO getTreeNode111VO() {
		return treeNode111VO;
	}

	public void setTreeNode111VO(TreeNode111VO treeNode111VO) {
		this.treeNode111VO = treeNode111VO;
	}
    
    
}