package com.passing.challenge.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "passing_challenge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassingChallenge {
	@Id
	private String id;
	private String challengeId;
	private String question;
	private String answer;
	private boolean isCorrect;
}
