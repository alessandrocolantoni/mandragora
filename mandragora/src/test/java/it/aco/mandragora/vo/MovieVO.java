package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="MOVIE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class MovieVO extends ValueObject implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4455171047289221134L;
	
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="idMovie",column= @Column(name="ID_MOVIE"))
    })
    @AssociationOverrides( {
			@AssociationOverride(name = "producerVO", joinColumns = { @JoinColumn(name = "ID_PRODUCER", referencedColumnName = "ID_PRODUCER") })
	})
	private MovieVOPK movieVOPK;
	
	
	@Transient
	private Integer idProducer;
    
	@Transient
	private Integer idMovie;
    
    @Column(name="TITLE")	
    private String title;
    
    @Column(name="DESCRIPTION")	
    private String description;

    @ManyToMany(targetEntity = ActorVO.class, fetch=FetchType.LAZY)
	@JoinTable(name = "MOVIE_ACTOR", joinColumns = { @JoinColumn(name = "ID_PRODUCER"),@JoinColumn(name = "ID_MOVIE") }, inverseJoinColumns = { @JoinColumn(name = "ID_ACTOR") })
	private Collection<ActorVO> actorVOs;

    public Integer getIdProducer() {
        return idProducer;
    }

    public void setIdProducer(Integer idProducer) {
        this.idProducer = idProducer;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<ActorVO> getActorVOs() {
        return actorVOs;
    }

    public void setActorVOs(Collection<ActorVO> actorVOs) {
        this.actorVOs = actorVOs;
    }

	public MovieVOPK getMovieVOPK() {
		return movieVOPK;
	}

	public void setMovieVOPK(MovieVOPK movieVOPK) {
		this.movieVOPK = movieVOPK;
	}
    
    
}