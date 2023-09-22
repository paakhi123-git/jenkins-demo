package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountModel {
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long accountId;
    private String ownerName;
    private String city;
    private String state;
    private String pin;
    private float balanceAmount;
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Date createdDate;
    private String status;
    private String accountType;
    
    public Long getId() {
        return accountId;
    }
    public void setId(Long accountId) {
        this.accountId = accountId;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
    public String getPin() {
        return city;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public float getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(float balanceAmount) {
		if (balanceAmount < 0.0) {
		    System.out.println("Invalid Amount");
		} else {
		    this.balanceAmount = balanceAmount;
		}
	}
    
    
}


