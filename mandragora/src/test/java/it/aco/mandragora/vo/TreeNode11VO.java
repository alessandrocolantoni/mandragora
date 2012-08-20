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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="TREENODE11")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TreeNode11VO extends ValueObject  implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5270243074494235064L;
	

	@Column(name="ID_TREENODE11")	
	@Id
	private String idTreeNode11;
	
	@Transient
    private String idTreeNode1;
	
	@ManyToOne(targetEntity=TreeNode1VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE1", referencedColumnName="ID_TREENODE1") })	
	private TreeNode1VO treeNode1VO;  // added alessandro 18-08.2011
    
	@Transient
	private String idTreeNode114;
	
	@Transient
    private String idTreeNode115;
	
	@Transient
    private String idTreeNode116;
    
	@Column(name="DESCRIPTION")
    private String description;

	@ManyToOne(targetEntity=TreeNode114VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE114", referencedColumnName="ID_TREENODE114") })	
    private TreeNode114VO treeNode114VO;
	
	@ManyToOne(targetEntity=TreeNode115VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE115", referencedColumnName="ID_TREENODE115") })	
    private TreeNode115VO treeNode115VO;
	
	@ManyToOne(targetEntity=TreeNode116VO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_TREENODE116", referencedColumnName="ID_TREENODE116") })	
    private TreeNode116VO treeNode116VO;

	@ManyToMany(targetEntity = TreeNode111VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "TREENODE11_TREENODE111", joinColumns = { @JoinColumn(name = "ID_TREENODE11") }, inverseJoinColumns = { @JoinColumn(name = "ID_TREENODE111") })
	private Collection<TreeNode111VO> treeNode111VOs;
	
	@ManyToMany(targetEntity = TreeNode112VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "TREENODE11_TREENODE112", joinColumns = { @JoinColumn(name = "ID_TREENODE11") }, inverseJoinColumns = { @JoinColumn(name = "ID_TREENODE112") })
    private Collection<TreeNode112VO> treeNode112VOs;
	
	@ManyToMany(targetEntity = TreeNode113VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "TREENODE11_TREENODE113", joinColumns = { @JoinColumn(name = "ID_TREENODE11") }, inverseJoinColumns = { @JoinColumn(name = "ID_TREENODE113") })
    private Collection<TreeNode113VO> treeNode113VOs;

    public String getIdTreeNode11() {
        return idTreeNode11;
    }

    public void setIdTreeNode11(String idTreeNode11) {
        this.idTreeNode11 = idTreeNode11;
    }

    public String getIdTreeNode1() {
        return idTreeNode1;
    }

    public void setIdTreeNode1(String idTreeNode1) {
        this.idTreeNode1 = idTreeNode1;
    }

    public String getIdTreeNode114() {
        return idTreeNode114;
    }

    public void setIdTreeNode114(String idTreeNode114) {
        this.idTreeNode114 = idTreeNode114;
    }

    public String getIdTreeNode115() {
        return idTreeNode115;
    }

    public void setIdTreeNode115(String idTreeNode115) {
        this.idTreeNode115 = idTreeNode115;
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

    public TreeNode114VO getTreeNode114VO() {
        return treeNode114VO;
    }

    public void setTreeNode114VO(TreeNode114VO treeNode114VO) {
        this.treeNode114VO = treeNode114VO;
    }

    public TreeNode115VO getTreeNode115VO() {
        return treeNode115VO;
    }

    public void setTreeNode115VO(TreeNode115VO treeNode115VO) {
        this.treeNode115VO = treeNode115VO;
    }

    public TreeNode116VO getTreeNode116VO() {
        return treeNode116VO;
    }

    public void setTreeNode116VO(TreeNode116VO treeNode116VO) {
        this.treeNode116VO = treeNode116VO;
    }

    public Collection<TreeNode111VO> getTreeNode111VOs() {
        return treeNode111VOs;
    }

    public void setTreeNode111VOs(Collection<TreeNode111VO> treeNode111VOs) {
        this.treeNode111VOs = treeNode111VOs;
    }

    public Collection<TreeNode112VO> getTreeNode112VOs() {
        return treeNode112VOs;
    }

    public void setTreeNode112VOs(Collection<TreeNode112VO> treeNode112VOs) {
        this.treeNode112VOs = treeNode112VOs;
    }

    public Collection<TreeNode113VO> getTreeNode113VOs() {
        return treeNode113VOs;
    }

    public void setTreeNode113VOs(Collection<TreeNode113VO> treeNode113VOs) {
        this.treeNode113VOs = treeNode113VOs;
    }

	public TreeNode1VO getTreeNode1VO() {
		return treeNode1VO;
	}

	public void setTreeNode1VO(TreeNode1VO treeNode1VO) {
		this.treeNode1VO = treeNode1VO;
	}
    
    
}