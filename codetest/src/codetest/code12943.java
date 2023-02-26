package codetest;

public class code12943 {
	
	
	public static void main(String[] args) {
		
		int num = 6;
		int answer = 0;
		

		
		for(int i = 0; i < 10; i++) {
			if(num % 2 == 0) {
				num = num / 2;
				answer += 1;
				System.out.println("answer값 : " + answer);
				
			}
			
			if(num % 2 == 1) {
				num = num * 3 + 1;
				answer += 1;
				System.out.println("answer값 : " + answer);
				
			}
			
			System.out.println("num값 : " + num);
		}
		

	}
	
	class Solution {
	    public long solution(int a, int b) {
	        long c = Math.max(a,b);
	        long d = Math.min(a,b);
			long result = 0;
		    result = (c-d + 1) * ( a+ b) / 2;
	        
	        return result;
	    }
	}
	


}
