package Java.Assignment;

import java.util.Scanner;

public class ReverseNumber {
	private static int userInput;
	private static int result=0;
	public static void main(String[] args) {
		System.out.println("enter number for to reverse");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			userInput = scan.nextInt();
			while(userInput>0){
				result *= 10;
				result += (userInput % 10);
				userInput /= 10;
			}
			System.out.println(result);
		}else{
			System.out.println("enter a proper integer value");
		}
		scan.close();
	}

}
