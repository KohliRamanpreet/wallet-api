package com.wallet.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class transactionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="User_name",referencedColumnName = "userName")
	private userDetails user; 
	@Column(name="sourceAcc")
	private long sourceAcc;
	@Column(name="destAcc")
	private long destAcc;;
	@Column(name="timeStamp")
	private String timeStamp;
	@Column(name="balance")
	private double balance=0.0;
	
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
	
	public long getSourceAcc() {
		return sourceAcc;
	}
	public void setSourceAcc(long sourceAcc) {
		this.sourceAcc = sourceAcc;
	}
	public long getDestAcc() {
		return destAcc;
	}
	public void setDestAcc(long destAcc) {
		this.destAcc = destAcc;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	


}
