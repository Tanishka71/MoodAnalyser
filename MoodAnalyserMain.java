package com.bridgelabz.mood;

public class MoodAnalyserMain {
    
	/*
	 * @desc:main method
	 * @params:none
	 * @return:none
	 */
	public static void main(String[] args) {
		MoodAnalyser mood=new MoodAnalyser("Tanishka is Happy");
		String answer=mood.analyseMood();
		System.out.println(answer);
	}
}
