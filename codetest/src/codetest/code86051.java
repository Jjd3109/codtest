package codetest;

import java.util.ArrayList;

public class code86051 {
	
	public static void main(String[] args) {
		
		int numbers[] = {5,8,4,0,6,7,9};
		
		ArrayList<Integer> arrNumber = new ArrayList<>();
		
		for(int j = 0; j<10; j++) {
			arrNumber.add(j);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(arrNumber.contains(numbers[i])) {
				arrNumber.remove(numbers[i]);
			}
			 
		}
		
		System.out.println(arrNumber);
		
		
	}
	
	public class Solution {
	    public int solution(int[] numbers) {
	        int answer = 45;
	        for (int n : numbers) {
	            answer -= n;
	        }

	        return answer;
	    }
	}	
}
