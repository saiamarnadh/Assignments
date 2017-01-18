package Java.Assignment;
public class PrintNumUsingArray {
	public static void main(String[] args) {
		int[] newArray = new int[101];
		try{
			printArray(newArray,1);
		}catch(ArrayIndexOutOfBoundsException e){	
		}
	}
	private static void printArray(int [] array, int i){
		array[i] = array[i-1]+1;
		System.out.print(array[i]+" ");
		printArray(array, i+1);
	}
}
