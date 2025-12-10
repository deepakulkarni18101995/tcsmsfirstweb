package com.tcs.boot;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
long pid;
String description;
String purchasedon;
int qty;
double price;
public String getPurchasedon() {
	return purchasedon;
}
public void setPurchasedon(String purchasedon) {
	this.purchasedon = purchasedon;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
	
}
