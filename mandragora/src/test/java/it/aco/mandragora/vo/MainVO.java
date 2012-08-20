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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="MAIN")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class MainVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -5209673323516993394L;
	

	@Column(name="ID_MAIN")	
	@Id
	private String idMain;
	
	@Column(name="DESCRIPTION")
    private String description;

	@OneToMany(mappedBy = "mainVO", targetEntity = Reference1VO.class, fetch = FetchType.LAZY)
	private Collection<Reference1VO> reference1VOs ;
	
	@OneToMany(mappedBy = "mainVO", targetEntity = Reference2VO.class, fetch = FetchType.LAZY)
    private Collection<Reference2VO> reference2VOs ;
	
	@OneToMany(mappedBy = "mainVO", targetEntity = Reference3VO.class, fetch = FetchType.LAZY)
    private Collection<Reference3VO> reference3VOs ;
    
    
	@ManyToMany(targetEntity = Reference4VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "MAIN_REFERENCE4", joinColumns = { @JoinColumn(name = "ID_MAIN") }, inverseJoinColumns = { @JoinColumn(name = "ID_REFERENCE4") })
	private Collection<Reference4VO> reference4VOs ;
    
	@ManyToMany(targetEntity = Reference5VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "MAIN_REFERENCE5", joinColumns = { @JoinColumn(name = "ID_MAIN") }, inverseJoinColumns = { @JoinColumn(name = "ID_REFERENCE5") })
	private Collection<Reference5VO> reference5VOs ;
    
	@ManyToMany(targetEntity = Reference6VO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "MAIN_REFERENCE6", joinColumns = { @JoinColumn(name = "ID_MAIN") }, inverseJoinColumns = { @JoinColumn(name = "ID_REFERENCE6") })
	private Collection<Reference6VO> reference6VOs ;


    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Reference1VO> getReference1VOs() {
        return reference1VOs;
    }

    public void setReference1VOs(Collection<Reference1VO> reference1VOs) {
        this.reference1VOs = reference1VOs;
    }

    public Collection<Reference2VO> getReference2VOs() {
        return reference2VOs;
    }

    public void setReference2VOs(Collection<Reference2VO> reference2VOs) {
        this.reference2VOs = reference2VOs;
    }

    public Collection<Reference3VO> getReference3VOs() {
        return reference3VOs;
    }

    public void setReference3VOs(Collection<Reference3VO> reference3VOs) {
        this.reference3VOs = reference3VOs;
    }

    public Collection<Reference4VO> getReference4VOs() {
        return reference4VOs;
    }

    public void setReference4VOs(Collection<Reference4VO> reference4VOs) {
        this.reference4VOs = reference4VOs;
    }

    public Collection<Reference5VO> getReference5VOs() {
        return reference5VOs;
    }

    public void setReference5VOs(Collection<Reference5VO> reference5VOs) {
        this.reference5VOs = reference5VOs;
    }

    public Collection<Reference6VO> getReference6VOs() {
        return reference6VOs;
    }

    public void setReference6VOs(Collection<Reference6VO> reference6VOs) {
        this.reference6VOs = reference6VOs;
    }
}