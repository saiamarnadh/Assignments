package Java.Assignment;

import java.util.Scanner;

public class Febbinocci {
	private static int userInput;
	private static void febnocci(int a){
		for(int i = 1; i <= a; i++){
			System.out.println("");
			for(int j = 1; j <= i; j++){
				System.out.print(j+" ");
			}
		}
	}
	public static void main(String [] args){
		System.out.println("Enter number for febinocci : ");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
			userInput = scan.nextInt();
			if(userInput > 0){
				febnocci(userInput);
			}else{
				System.out.println("value must be greater than zero");
			}
		}else if(scan.hasNextFloat()){
			userInput = Math.round(scan.nextFloat());
			if(userInput > 0){
				febnocci(userInput);
			}else{
				System.out.println("value must be greater than zero");
			}
		}
		scan.close();
	}
}
