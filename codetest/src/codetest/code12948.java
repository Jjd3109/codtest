package codetest;

import java.util.Arrays;

public class code12948 {

	public static void main(String[] args) {
		String phone_number = "01020843109";
		String answer = "";
		
		String[] phone = new String[phone_number.length()];
		phone = phone_number.split("");
		
		
		
		for(int i = 0; i < phone_number.length() - 4; i++) {
			phone[i] = "*";
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < phone_number.length(); i++) {
			  stringBuilder.append(phone[i]+ "");
			}
		answer = stringBuilder.toString();
		System.out.print(answer);
		
		
	}

}
