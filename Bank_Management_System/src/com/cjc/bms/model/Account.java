package com.cjc.bms.model;

public class Account {
private int acno;
private String name;
private long mob;
private long adhar;
private char gender;
private int age;
private int bal;


public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setMob(long mob) {
	this.mob = mob;
}
public long getMob() {
	return mob;
}
public void setAdhar(long adhar) {
	this.adhar = adhar;
}
public long getAdhar() {
	return adhar;
}
public void setGender(char gender) {
	this.gender=gender;
}
public char getGender() {
	return gender;
}
public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return age;
}

public void setBal(int bal) {
	this.bal = bal;
}
public int getBal() {
	return bal;
}


}
