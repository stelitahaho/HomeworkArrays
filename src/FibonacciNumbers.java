import java.util.Scanner;
import java.util.Arrays;
public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter Array size :");
		int n=input.nextInt();
		int[] Array= new int [n];
		Array[0]=1;
		Array[1]=2;
		for(int i=2; i < Array.length ; i++ ){
			{
		   Array[i]=Array[i-2]+Array[i-1];
			}
			
		}
		System.out.println(Arrays.toString(Array));
		input.close();
	}
}