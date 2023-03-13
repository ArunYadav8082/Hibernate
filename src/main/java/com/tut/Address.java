package com.tut;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.type.DateType;

@Entity
@Table(name="address_details")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="STREET",length=50)
	private String street;
	
	@Column(length=100,name="CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Lob
	private byte[] image;
	
	@Column(name="added_date")
	private Date addedDate;

	public Address(int id, String street, String city, boolean isOpen, byte[] image, Date addedDate) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.image = image;
		this.addedDate = addedDate;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", image="
				+ Arrays.toString(image) + ", addedDate=" + addedDate + ", getId()=" + getId() + ", getStreet()="
				+ getStreet() + ", getCity()=" + getCity() + ", isOpen()=" + isOpen() + ", getImage()="
				+ Arrays.toString(getImage()) + ", getAddedDate()=" + getAddedDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
