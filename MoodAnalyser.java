package com.bridgelabz.mood;

public class MoodAnalyser {
    String message;
    
    /*
	 * @desc:default constructor 
	 * @params:none
	 * @return:none
	 */
    MoodAnalyser(){
    	this.message=null;
    }
    
    /*
 	 * @desc:parameterized constructor 
 	 * @params:String 
 	 * @return:none
 	 */
    MoodAnalyser(String msg){
    	this.message=msg;
    }
	
	/*
	 * @desc:analyse and print whether mood is sad or happy
	 * @params:String
	 * @return:String
	 */
	String analyseMood() {
		try {
		if(message.contains("Sad")) {
			return "Sad";
		}
		else {
			return "Happy";
		}}
		catch (NullPointerException e){
			return "Happy";
		}
	}
}
}
