package com.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Poll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="POLL_ID")
	private long id;
	
	@Column(name="QUESTION")
	private String question;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="POLL_ID")
	@OrderBy
	private Set<OptionEntity> options;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<OptionEntity> getOptions() {
		return options;
	}
	public void setOptions(Set<OptionEntity> options) {
		this.options = options;
	}
	
	

}
