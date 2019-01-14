package com.jlp.meatdistribution.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "commodity")
public class Commodity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="amount")
	private int amount;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
