package codetest;

import java.util.Arrays;

public class code12951 {

	public static void main(String[] args){
		   String answer = "";
	       String s = "3people unFollowed me";
		   
	       s = s.toLowerCase();
	      
		   String[] str = s.split("");
	       
		   
	       for(int i = 0; i<s.length(); i++) {
	    	   str[0] = str[0].toUpperCase();
	    	   if(str[i].equals(" ")) {
	    		   str[i+1] = str[i+1].toUpperCase();
	    	   }
	       }
	       
	       answer = String.join("", str);
		
	}
		class StringExercise{
		    String getMiddle(String word){
		    int a = word.length();
		    String word1;
		    if ( a % 2 == 0 )
		            word1 = word.substring(a/2 - 1, (a/2) + 1);
		    else
		            word1 = word.substring((a/2), (a/2) + 1);
		    return word1;
		    }
		}

}
