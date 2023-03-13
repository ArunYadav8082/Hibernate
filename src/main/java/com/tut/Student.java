package com.tut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	private String name;
	private String language;
	private String city;
	private String state;
	private String country;
	private Certificate certi;
	
		public Student(int id, String name, String language, String city, String state, String country, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.city = city;
		this.state = state;
		this.country = country;
		this.certi = certi;
	}
     public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
   	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", language=" + language + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", certi=" + certi + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getLanguage()=" + getLanguage() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getCountry()=" + getCountry() + ", getCerti()=" + getCerti() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
