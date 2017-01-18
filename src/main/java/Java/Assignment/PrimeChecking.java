package Java.Assignment;

import java.util.Scanner;

public class PrimeChecking {
	private static int userInput;
	public static void main(String[] args) {
		System.out.println("enter a number to validate wether it is a prime or not");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			int forCheck = 0;
			userInput = scan.nextInt();
			if(userInput > 1){
				for(int i = 2; i <= (userInput/2); i++){
					if(userInput%i == 0){
						forCheck++;
						System.out.println("Not a Prime");
						break;
					}	
				}
				if(forCheck == 0){
					System.out.println("Prime");
				}
			}else{
				System.out.println("enter a number greater than 1");
			}
		}else{
			System.out.println("enter a valid integer number");
		}
		scan.close();
	}

}
