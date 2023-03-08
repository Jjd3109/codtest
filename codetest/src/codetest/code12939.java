package codetest;


import java.util.Arrays;

public class code12939 {

	public static void main(String[] args){
		String answer = " ";
		String s = "1 -2 -3 -4";
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {	//최대값 최소값 비교
			if (min > Integer.parseInt(str[i])) {
				min = Integer.parseInt(str[i]);
			}
			if (max < Integer.parseInt(str[i])) {
				max = Integer.parseInt(str[i]);
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(min).append(" ").append(max);

	
		
		
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
