package com.bridgelabz.javaexception;

public class MoodAnalyser {

	private String message;
	
    public String analyseMood(String message) {
        if(message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
        
    }
    
}