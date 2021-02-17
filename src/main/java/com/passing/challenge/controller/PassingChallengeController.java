package com.passing.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.passing.challenge.model.PassingChallenge;
import com.passing.challenge.service.PassingChallengeService;

@RestController
@RequestMapping("/api/service")
public class PassingChallengeController {
	@Autowired
	private PassingChallengeService passingChallengeService;

	@GetMapping("all-challenge")
	ResponseEntity<List<PassingChallenge>> getAllChallenge() {
		return new ResponseEntity<>(passingChallengeService.getAllChallenge(), HttpStatus.OK);
	}
	
	@GetMapping("challenge")
	ResponseEntity<List<PassingChallenge>> getChallengeById(@RequestParam(value = "challengeId") String challengeId) {
		return new ResponseEntity<>(passingChallengeService.getChallengeById(challengeId), HttpStatus.OK);
	}
	
	@GetMapping("passing-status")
	ResponseEntity<Boolean> getPassingStatus(@RequestParam(value = "challengeId") String challengeId) {
		return new ResponseEntity<>(passingChallengeService.getPassingStatus(challengeId), HttpStatus.OK);
	}

}
