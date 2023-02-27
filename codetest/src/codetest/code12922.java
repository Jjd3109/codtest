package codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code12922 {

	public static void main(String[] args){
		String answer = "";
		String str = "수박";
		List<String> strList = new ArrayList<>();
		
		int n = 5;
		
		if(n % 2 == 0) {
			for(int i = 0; i < n/2; i++) {
				strList.add("수");
				strList.add("박");
			}
			
		}else {
			for(int i = 0; i < n/2; i++) {
				strList.add("수");
				strList.add("박");
			}
			strList.add("수");
		}
		
		
		answer = String.join("", strList);
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
