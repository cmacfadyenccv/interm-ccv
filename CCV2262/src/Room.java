package com.csmacf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="rooms")
public class Room {

	private Integer id;
	private String name;
	

	public Room() {
		super();
	}

	public Room(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	@Id @Column(nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
