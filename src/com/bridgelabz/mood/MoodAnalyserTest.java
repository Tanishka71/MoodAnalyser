package com.bridgelabz.mood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	/* @desc:check for sad mood (TESTCASE 1.1) */
	void checkMoodIsSad() throws MoodAnalysisException {
		 MoodAnalyser mood=new MoodAnalyser("I am Sad.");
		assertEquals("SAD",mood.analyseMood(),
				"Checks for the mood.");
	}
	
	@Test
	/* @desc:check for happy mood (TESTCASE 1.2) */
	void checkMoodIsHappy() throws MoodAnalysisException {
		MoodAnalyser mood=new MoodAnalyser("I am in Happy mood.");
		assertEquals("HAPPY",mood.analyseMood(),
				"Checks for the mood.");
	}
    
	@Test
	/* @desc:check for happy mood (TESTCASE 2.1) */
	void checkForException() throws MoodAnalysisException {
		MoodAnalyser mood=new MoodAnalyser();
		assertEquals("Happy",mood.analyseMood(),
				"Checks for the mood.");
	}
	
    @Test
    /* @desc:check for null mood (TESTCASE 3.1) */
   public void testNullMood() throws MoodAnalysisException {
       String message = null;
       MoodAnalyser moodAnalysis = new MoodAnalyser(message);
       MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
           moodAnalysis.analyseMood();
       });
       assertEquals(MoodAnalysisError.EMPTY_MOOD, exception.getError());
   assertEquals("Mood should not be empty or null", exception.getMessage());
   }
    
    @Test
    /* @desc:check for empty mood (TESTCASE 3.2) */
    public void testEmptyMood() {
        String message = "";  // Empty mood
        MoodAnalyser moodAnalysis = new MoodAnalyser(message);

        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalysis.analyseMood();
        });

        assertEquals(MoodAnalysisError.EMPTY_MOOD, exception.getError());
        assertEquals("Mood should not be empty or null", exception.getMessage());
    }

}
