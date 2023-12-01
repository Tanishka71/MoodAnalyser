package com.bridgelabz.mood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	/* @desc:check for sad mood (TESTCASE 1.1) */
	void checkMoodIsSad() {
		 MoodAnalyser mood=new MoodAnalyser("I am Sad.");
		assertEquals("Sad",mood.analyseMood(),
				"Checks for the mood.");
	}
	
	@Test
	/* @desc:check for happy mood (TESTCASE 1.2) */
	void checkMoodIsHappy() {
		MoodAnalyser mood=new MoodAnalyser("I am in Happy mood.");
		assertEquals("Happy",mood.analyseMood(),
				"Checks for the mood.");
	}

}
