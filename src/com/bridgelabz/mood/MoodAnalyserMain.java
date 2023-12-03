package com.bridgelabz.mood;
import java.util.*;
public class MoodAnalyserMain {
    
	/*
	 * @desc:main method
	 * @params:none
	 * @return:none
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
      MoodAnalyser moodAnalyzer=new MoodAnalyser();
      System.out.println("Enter your mood : ");
        try {
        	String mood1=scanner.nextLine();
            String result = moodAnalyzer.analyseMood();
            System.out.println("Mood: " + result);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError());
        }
  
	}
}
