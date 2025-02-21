package com.hiber.MyHibernate;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="StudentAddress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)                 //for autoIncreament
	@Column(name="Address_Id")
	private int addressID;
	@Column(length=50, name="Street")
	private String street;
	@Column(length=100, name="city")
	private String City;
	private boolean inOpen;
	@Transient
	private double x;
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[] image;
	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", street=" + street + ", City=" + City + ", inOpen=" + inOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressID, String street, String city, boolean inOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressID = addressID;
		this.street = street;
		City = city;
		this.inOpen = inOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public boolean isInOpen() {
		return inOpen;
	}
	public void setInOpen(boolean inOpen) {
		this.inOpen = inOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
