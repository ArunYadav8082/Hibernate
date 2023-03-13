package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Emp
{
	@Id
	@Column(name="Emp_id")
	private int empid;
	
	private String name;
	
	@ManyToMany
	private List<Project>project;
	
   public Emp(int empid, String name, List<Project> project) {
		super();
		this.empid = empid;
		this.name = name;
		this.project = project;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> list2) {
		this.project = list2;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", project=" + project + ", getEmpid()=" + getEmpid()
				+ ", getName()=" + getName() + ", getProject()=" + getProject() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	



}
