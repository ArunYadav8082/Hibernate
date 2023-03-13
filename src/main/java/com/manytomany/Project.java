package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project
{
	@Id 
	@Column(name="Project_id")
	private int projectid;
	
	private String name;
	
	@ManyToMany
	private List<Emp>emp;
	
	public Project(int projectid, String name, List<Emp> emp) {
		super();
		this.projectid = projectid;
		this.name = name;
		this.emp = emp;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> list1) {
		this.emp = list1;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", name=" + name + ", emp=" + emp + ", getProjectid()="
				+ getProjectid() + ", getName()=" + getName() + ", getEmp()=" + getEmp() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
		
	

}
