package javabasic_02.day12.StringProb.prob1;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();
		
		//프로그램을 구현하세요.
		char inChar = ' ';
		for(int i = inputStr.length()-1; i>=0; i--) {
			inChar = inputStr.charAt(i);
            if (Character.isLowerCase(inChar)) {
                inChar = Character.toUpperCase(inChar);
            }
			System.out.print(inChar);
        }
		
	}

}
