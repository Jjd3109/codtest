package codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code12904 {

	public static void main(String[] args){
		String s = "banana";
		int a = 0;
		int b = 0;
		int answer = 0;
	    String[] str = new String[s.length()];
	    List<String> strList = new ArrayList<>();
	    str = s.split("");
	   for(int i = 0; i<s.length(); i++) {
		   strList.add(str[i]);
	   }
	   
	
	    for(int j = 0; j<s.length(); j++) {
	    	if(str[0].equals(str[j])) {
	    		a += 1;
	    	}
	    	
	    	if(!str[0].equals(str[j])){
	    		b +=1;
	    	}
	    	if(a == b) {
	    		break;
	    	}
	    }
	    
	    for(int k = 0; k<a+1; k++) {
	    	 strList.remove(0);
	    	 answer +=1;
	    }
	


		
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
