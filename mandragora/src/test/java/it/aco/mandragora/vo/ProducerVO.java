package it.aco.mandragora.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ProducerVO extends ValueObject implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4779884778686798867L;
	
	
	@Column(name="ID_PRODUCER")	
	@Id	
	private Integer idProducer;
	
	@Column(name="NAME")
    private String name;


	@OneToMany(mappedBy = "movieVOPK.producerVO", targetEntity = MovieVO.class, fetch = FetchType.LAZY)
    private Collection<MovieVO> movieVOs;

    public Integer getIdProducer() {
        return idProducer;
    }

    public void setIdProducer(Integer idProducer) {
        this.idProducer = idProducer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<MovieVO> getMovieVOs() {
        return movieVOs;
    }

    public void setMovieVOs(Collection<MovieVO> movieVOs) {
        this.movieVOs = movieVOs;
    }
}