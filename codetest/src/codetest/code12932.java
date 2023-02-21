package codetest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class code12932 {

	public static void main(String[] args) {
		long n = 1234;
		String n1 = Long.toString(n);
		
	
		String[] array = new String[4];
		
		String[] test = n1.split("");
		
		for(int i = test.length; i > 0; i-- ) {
			array[test.length - i]= (test[i-1]);
		}
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(array));
		
		//String toarray = Arrays.stream(array).collect(Collectors.joining());
		
	}

}