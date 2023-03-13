package com.many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Question1")
public class Question1
{
	
	@Id
	@Column(name="question_id")
	private int questionid;
	
	private String question1;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="question1")
	private List<Answer1>answer1;

	public Question1(int questionid, String question1, List<Answer1> answer1) 
	{
		super();
		this.questionid = questionid;
		this.question1 = question1;
		this.answer1 = answer1;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public List<Answer1> getAnswer1() {
		return answer1;
	}

	public void setAnswer1(List<Answer1> answer1) {
		this.answer1 = answer1;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*@Override
	public String toString() {
		return "Question1 [questionid=" + questionid + ", question1=" + question1 + ", answer1=" + answer1
				+ ", getQuestionid()=" + getQuestionid() + ", getQuestion1()=" + getQuestion1() + ", getAnswer1()="
				+ getAnswer1() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}*/
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
