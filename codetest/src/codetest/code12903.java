package codetest;

import java.util.ArrayList;
import java.util.Arrays;

public class code12903 {

	public static void main(String[] args){
		  String answer ="";
		String s = "qwerff";
		
		String[] strArr = new String[s.length()];
		strArr = s.split("");
		//홀수면 5/2 2.5 , 7/2 3.5 , 8/2 4 abc de fgh 4/2 23
		// 홀수면 반올림한수 짝수면 짝수 + 한개 더
	
		ArrayList<String> test = new ArrayList<>();

		
		
		if(strArr.length % 2 == 1) {
	
			test.add(strArr[strArr.length / 2]);
			 answer = String.join("",test);
		
			
		}
		if(strArr.length % 2 == 0) {

			test.add(strArr[strArr.length / 2 - 1]);
			test.add(strArr[strArr.length / 2]);
			 answer = String.join("",test);
			
		}
		
		System.out.println(answer);
		
		
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
