package com.passing.challenge.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.passing.challenge.model.PassingChallenge;
import com.passing.challenge.service.PassingChallengeService;

@SpringBootTest
public class PassingChallengeServiceTest {
	@Autowired
	private PassingChallengeService passingChallengeService;

	private final double GIVEN_PASSING_PERCENTAGE = 87.5;

	@Test
	public void shouldReturnNullWhenNullPassingChallengeListIsPassed() {
		Boolean expectedIsPassing = null;
		Boolean actualIsPassing = passingChallengeService.isPassing(null, GIVEN_PASSING_PERCENTAGE);

		assertEquals(expectedIsPassing, actualIsPassing);
	}

	@Test
	public void shouldReturnNullWhenEmptyPassingChallengeListIsPassed() {
		Boolean expectedIsPassing = null;
		List<PassingChallenge> givenPassingChallenges = new ArrayList<>();
		Boolean actualIsPassing = passingChallengeService.isPassing(givenPassingChallenges, GIVEN_PASSING_PERCENTAGE);

		assertEquals(expectedIsPassing, actualIsPassing);
	}

	@Test
	public void shouldReturnFalseWhenPassingChallengeListFailingCollectionIsPassed() {
		Boolean expectedIsPassing = false;
		List<PassingChallenge> givenPassingChallenges = Arrays.asList(
				new PassingChallenge("1", "someInterviewId1", "someQuestion1", "someAnswer1", true),
				new PassingChallenge("2", "someInterviewId1", "someQuestion2", "someAnswer2", false),
				new PassingChallenge("3", "someInterviewId1", "someQuestion3", "someAnswer3", true),
				new PassingChallenge("4", "someInterviewId1", "someQuestion4", "someAnswer4", false),
				new PassingChallenge("5", "someInterviewId1", "someQuestion5", "someAnswer5", true),
				new PassingChallenge("6", "someInterviewId1", "someQuestion6", "someAnswer6", false),
				new PassingChallenge("7", "someInterviewId1", "someQuestion7", "someAnswer7", true),
				new PassingChallenge("8", "someInterviewId1", "someQuestion8", "someAnswer8", false),
				new PassingChallenge("9", "someInterviewId1", "someQuestion9", "someAnswer9", true),
				new PassingChallenge("10", "someInterviewId1", "someQuestion10", "someAnswer10", false));
		Boolean actualIsPassing = passingChallengeService.isPassing(givenPassingChallenges, GIVEN_PASSING_PERCENTAGE);

		assertEquals(expectedIsPassing, actualIsPassing);
	}

	@Test
	public void shouldReturnTrueWhenEmptyPassingChallengeListPassingCollectionIsPassed() {
		Boolean expectedIsPassing = true;
		List<PassingChallenge> givenPassingChallenges = Arrays.asList(
				new PassingChallenge("11", "someInterviewId2", "someQuestion1", "someAnswer1", true),
				new PassingChallenge("12", "someInterviewId2", "someQuestion2", "someAnswer2", true),
				new PassingChallenge("13", "someInterviewId2", "someQuestion3", "someAnswer3", true),
				new PassingChallenge("14", "someInterviewId2", "someQuestion4", "someAnswer4", true),
				new PassingChallenge("15", "someInterviewId2", "someQuestion5", "someAnswer5", true),
				new PassingChallenge("16", "someInterviewId2", "someQuestion6", "someAnswer6", true),
				new PassingChallenge("17", "someInterviewId2", "someQuestion7", "someAnswer7", true),
				new PassingChallenge("18", "someInterviewId2", "someQuestion8", "someAnswer8", true),
				new PassingChallenge("19", "someInterviewId2", "someQuestion9", "someAnswer9", true),
				new PassingChallenge("20", "someInterviewId2", "someQuestion10", "someAnswer10", false));
		Boolean actualIsPassing = passingChallengeService.isPassing(givenPassingChallenges, GIVEN_PASSING_PERCENTAGE);

		assertEquals(expectedIsPassing, actualIsPassing);
	}
}
