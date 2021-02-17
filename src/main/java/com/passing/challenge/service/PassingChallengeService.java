package com.passing.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passing.challenge.model.PassingChallenge;
import com.passing.challenge.repository.ChallengeRepository;

@Service
public class PassingChallengeService {
	
	@Autowired
	private ChallengeRepository challengeRepository;
	
	private final double PASSING_PERCENTAGE = 87.5;
	
	public List<PassingChallenge> getAllChallenge() {
		return challengeRepository.findAll();
	}
	
	public List<PassingChallenge> getChallengeById(String challengeId) {
		return challengeRepository.findByChallengeId(challengeId);
	}
	
	
	public Boolean getPassingStatus(String challengeId) {
		List<PassingChallenge> passingChallenges = challengeRepository.findByChallengeId(challengeId);
		return isPassing(passingChallenges, PASSING_PERCENTAGE);
	}

	public Boolean isPassing(List<PassingChallenge> passingChallenges, double passingPercentage) {
		Boolean percentage = null;
		if (passingChallenges != null && !passingChallenges.isEmpty()) {
			percentage = Math
					.round(100.0 * passingChallenges.stream()
							.filter(passingChallenge -> passingChallenge.isCorrect() == true).count())
					/ passingChallenges.stream().count() > 87.5;
		}
		return percentage;
	}

}
