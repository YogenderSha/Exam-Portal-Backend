package com.exam.model.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long quesId;
	
	@Column(length = 5000)
	private String content;
	private String image;
	
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	//@JsonIgnore //if this used then answer not read and written into database
	private String answer;
	
	//@Transient not required, clear answer while sending get answer back
	//private String enteredAnswer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;

	public Question() {
	}

	/**
	 * @return the quesId
	 */
	public Long getQuesId() {
		return quesId;
	}

	/**
	 * @param quesId the quesId to set
	 */
	public void setQuesId(Long quesId) {
		this.quesId = quesId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}

	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}

	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}

	/**
	 * @param option3 the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	/**
	 * @return the option4
	 */
	public String getOption4() {
		return option4;
	}

	/**
	 * @param option4 the option4 to set
	 */
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	/**
	 * @return the answer
	 */
	//@JsonProperty("answer") //When used along with @JsonIgnore this will let this property only be read from database cannot write
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	//@JsonProperty("answer") //When used along with @JsonIgnore this will let this property only be written to database cannot read
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the quiz
	 */
	public Quiz getQuiz() {
		return quiz;
	}

	/**
	 * @param quiz the quiz to set
	 */
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
//	/**
//	 * @return the enteredAnswer
//	 */
//	public String getEnteredAnswer() {
//		return enteredAnswer;
//	}
//
//	/**
//	 * @param enteredAnswer the enteredAnswer to set
//	 */
//	public void setEnteredAnswer(String enteredAnswer) {
//		this.enteredAnswer = enteredAnswer;
//	}

	
}
