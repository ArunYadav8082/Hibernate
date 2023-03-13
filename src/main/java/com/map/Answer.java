package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer
{
	
	@Id
//  @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="answer_id")
	private int answerid;
	
	private String answer;
	
	@OneToOne(mappedBy="answer")
	private Question question;
	
	public Answer(int answerid, String answer, Question question) {
		super();
		this.answerid = answerid;
		this.answer = answer;
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAnswerid() {
		return answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer + ", getAnswerid()=" + getAnswerid()
				+ ", getAnswer()=" + getAnswer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
