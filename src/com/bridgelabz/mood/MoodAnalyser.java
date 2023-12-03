package com.bridgelabz.mood;

public class MoodAnalyser {


	private String message;
    
    /*
	 * @desc:default constructor 
	 * @params:none
	 * @return:none
	 */
    public MoodAnalyser(){
    	this.message=null;
    }
    
    /*
 	 * @desc:parameterized constructor 
 	 * @params:String 
 	 * @return:none
 	 */
    public MoodAnalyser(String msg){
    	this.message=msg;
    }
	
    // @desc:Getter for message field
    public String getMessage() {
        return message;
    }

    // @desc:Setter for message field
    public void setMessage(String message) {
        this.message = message;
    }
	/*
	 * @desc:analyse and print whether mood is sad or happy
	 * @params:String
	 * @return:String
	 */
	public String analyseMood()throws MoodAnalysisException {
		 try{
	            if (message == null) {
	                return "Happy"; 
	            }// Return "Happy" for null mood
	            else if(message.toLowerCase().contains("happy")){
	                return "HAPPY";
	            }else if(message.toLowerCase().contains("sad")){
	                return "SAD";
	            }else{
	                throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD);
	            }

	        }catch(MoodAnalysisException e){
	            return e.getMessage();

	        }
	    }
}

