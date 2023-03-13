package com.many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name ="Answer1")
public class Answer1
{   
    @Id
	@Column(name="answer_id")
	private int answerid;
	
	private String answer1;
	
	@ManyToOne
	private Question1 question1;

	public Answer1(int answerid, String answer1, Question1 question1) {
		super();
		this.answerid = answerid;
		this.answer1 = answer1;
		this.question1 = question1;
	}

	public int getAnswerid() {
		return answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public Question1 getQuestion1() {
		return question1;
	}

	public void setQuestion1(Question1 question1) {
		this.question1 = question1;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

/*	@Override
	public String toString() {
		return "Answer1 [answerid=" + answerid + ", answer1=" + answer1 + ", question1=" + question1
				+ ", getAnswerid()=" + getAnswerid() + ", getAnswer1()=" + getAnswer1() + ", getQuestion1()="
				+ getQuestion1() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}*/


}
