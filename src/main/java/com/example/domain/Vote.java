package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="VOTE_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="OPTION_ID")
	private Optione optioni;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Optione getOptioni() {
		return optioni;
	}

	public void setOptioni(Optione optioni) {
		this.optioni = optioni;
	}


	

}
