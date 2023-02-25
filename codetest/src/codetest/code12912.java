package codetest;

public class code12912 {
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		int result = 0;
		
		if(a>b){
            for(int i = b+1; i < a; i++){
                result += i;
            }
        }
		
		if(a<b) {
		     for(int i = a+1; i < b; i++){
	                result += i;
            }
		}
		
		if(a==b) {
			result += a;
		}
		
		System.out.println(result);
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
