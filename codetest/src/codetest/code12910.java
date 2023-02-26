package codetest;

import java.util.Arrays;

public class code12910 {
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		int divisor = 5;
		int test = 0;
		arr[0] = 5;
		arr[1] = 21;
		arr[2] =  9;
		arr[3] = 25;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % divisor == 0) {
				test += 1;
			}
			
		}
		
		int[] answer = new int[test];

		
		System.out.println(Arrays.toString(answer));
		System.out.println(test);
		
		}


	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	            int count = 0;
	        int number = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] % divisor == 0){
	                count++;
	            }
	        }
	        
	        if(count == 0){
	            int[] answer = {-1};
	            return answer;
	        }
	        
	        int[] answer = new int[count];
	        
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] % divisor == 0){
	                answer[number] = arr[i];
	                number++;
	            }
	        }
	        
	        Arrays.sort(answer);
	        return answer;
	    }
	}
	


}
