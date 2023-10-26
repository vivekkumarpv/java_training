package com.stackroute.exercises;


public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
    	char c = 0;
    	try {
    		c=sentence.charAt(Integer.parseInt(location));
    	}catch(NumberFormatException e) {
    		throw new NumberFormatException();
    	}catch (StringIndexOutOfBoundsException e2) {
    		throw new StringIndexOutOfBoundsException();
    	}
		return c;
    }
    
}
