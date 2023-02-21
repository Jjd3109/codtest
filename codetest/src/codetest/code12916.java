package codetest;

import java.util.Arrays;

public class code12916 {

	public static void main(String[] args) {
		String s = "hpllo World";
		
		  String s1 = (s.toLowerCase());
		  String[] strArr = s1.split("");
		  int pValue = 0;
		  int yValue = 0;
		  for(int i = 0; i<strArr.length; i++){
	            if(strArr[i].equals("p")){
	            	pValue += 1;
	            }
	             if(strArr[i].equals("y")){
	            	 yValue += 1;
	            }
		  }
		  
		  System.out.println(strArr[0]);
		  
	}

}
