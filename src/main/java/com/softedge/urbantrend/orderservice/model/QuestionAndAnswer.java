package com.softedge.urbantrend.orderservice.model;

import java.util.Map;

public class QuestionAndAnswer {

	private String question;
	private Map<String, String> answersAndRespondents;

	public QuestionAndAnswer() {
		super();
	}

	public QuestionAndAnswer(String question, Map<String, String> answersAndRespondents) {
		super();
		this.question = question;
		this.answersAndRespondents = answersAndRespondents;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<String, String> getAnswersAndRespondents() {
		return answersAndRespondents;
	}

	public void setAnswersAndRespondents(Map<String, String> answersAndRespondents) {
		this.answersAndRespondents = answersAndRespondents;
	}

}
