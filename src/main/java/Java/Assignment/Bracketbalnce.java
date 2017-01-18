package Java.Assignment;

import java.util.Scanner;

public class Bracketbalnce {
	private static String userInput;
	private static char[] charArray;
	private static int sob = 0,scb = 0,ocb=0,ccb=0,obb=0,cbb=0;
	public static void main(String [] args){
		System.out.println("enter a string, we check bracket balance");
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextLine();
		charArray = userInput.toCharArray();
		for(char x: charArray){
			switch(x){
				case '(':
					sob++;
				case ')':
					scb++;
				case '{':
					ocb++;
				case '}':
					ccb++;
				case '[':
					obb++;
				case ']':
					cbb++;
			}
		}
		scb = scb-sob;
		ccb = ccb-ocb;
		cbb = cbb-obb;
		if(sob == scb && ocb == ccb && cbb == obb){
			System.out.println("balanced");
		}else{
			System.out.println("NOT balanced");
		}
		scan.close();
	}
}
