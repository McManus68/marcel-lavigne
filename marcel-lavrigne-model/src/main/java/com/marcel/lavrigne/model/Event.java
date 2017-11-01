package com.marcel.lavrigne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event extends MarcelLavrigneEntity {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Override
	public Long getId() {
		return id;
	}

}
