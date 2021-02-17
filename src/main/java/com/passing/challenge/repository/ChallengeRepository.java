package com.passing.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passing.challenge.model.PassingChallenge;

public interface ChallengeRepository extends JpaRepository<PassingChallenge, String> {

	List<PassingChallenge> findByChallengeId(String challengeId);
}
