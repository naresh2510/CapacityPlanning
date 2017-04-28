package com.centurylink.bbc.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Stock {
	
	private String stockId;
	private String stockOwner;
	private Date createdDt;
	
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockOwner() {
		return stockOwner;
	}
	public void setStockOwner(String stockOwner) {
		this.stockOwner = stockOwner;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	

}
