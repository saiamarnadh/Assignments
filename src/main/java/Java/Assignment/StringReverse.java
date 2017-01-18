package Java.Assignment;

import java.util.Scanner;

public class StringReverse {
	private static String userInput;
	private static char[] result;
	public static void main(String[] args) {
		System.out.println("enter a string to reverse");
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextLine();
		result = userInput.toCharArray();
		int h = result.length;
		for(int v = h; v > 0; v--){
			System.out.print(result[v-1]);
		}
		scan.close();
	}

}
