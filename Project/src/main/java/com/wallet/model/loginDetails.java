package com.wallet.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class loginDetails  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumns({@JoinColumn(name="User_name",referencedColumnName = "userName"),@JoinColumn(name="pass" , referencedColumnName = "pass")})
	private userDetails user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public userDetails getUser() {
		return user;
	}
	public void setUser(userDetails user) {
		this.user = user;
	}


}
