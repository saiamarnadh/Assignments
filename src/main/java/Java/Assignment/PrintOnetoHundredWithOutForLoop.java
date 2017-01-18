package Java.Assignment;

public class PrintOnetoHundredWithOutForLoop {
	private static int printNum(int a){
		int i = 1;
		if(i < a){
			System.out.print(a+" ");
			return printNum(a-1);
		}else{
			System.out.print(a+" ");
			return a;
		}
	}
	public static void main(String [] args){
		int x =100;
		printNum(x);
	}
}
