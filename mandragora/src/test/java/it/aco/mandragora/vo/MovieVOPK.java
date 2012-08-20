package it.aco.mandragora.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
 

@Embeddable
public class MovieVOPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8798317080998439832L;

	@Column(name="ID_MOVIE")	
	private Integer idMovie;
	
	
	@ManyToOne(targetEntity=ProducerVO.class, fetch=FetchType.LAZY)	
	@JoinColumns({ @JoinColumn(name="ID_PRODUCER", referencedColumnName="ID_PRODUCER") })		
	private ProducerVO producerVO;


	public Integer getIdMovie() {
		return idMovie;
	}


	public void setIdMovie(Integer idMovie) {
		this.idMovie = idMovie;
	}


	public ProducerVO getProducerVO() {
		return producerVO;
	}


	public void setProducerVO(ProducerVO producerVO) {
		this.producerVO = producerVO;
	}

	
	
	
	
	
}
