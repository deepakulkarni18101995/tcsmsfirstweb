package com.tcs.boot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tcsuser")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long UserID;
 public Long getUserID() {
	return UserID;
}
public void setUserID(Long userID) {
	UserID = userID;
}
 private String userName;
 private String password;
 public String getUserName() {
	return userName;
 }
 public void setUserName(String userName) {
	this.userName = userName;
 }
 public String getPassword() {
	return password;
 }
 public void setPassword(String password) {
	this.password = password;
 }


 
}
