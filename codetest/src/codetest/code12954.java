package codetest;

public class code12954 {

	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        long num  = x;
	
	        for(int i = 0; i < n; i++){
	           answer[i] = num + (num * i);     
	        }
	
	        return answer;
	    }
	}
}
