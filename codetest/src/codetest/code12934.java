package codetest;

import java.util.Arrays;

public class code12934 {

	class Solution {
	    public long solution(long n) {
	       Double sqrt = Math.sqrt(n);
	      
	      if(sqrt == sqrt.intValue()){
	          return (long)Math.pow(sqrt + 1, 2);
	      } else return -1;
	        
	    }
	}
	


}
