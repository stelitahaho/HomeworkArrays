import java.util.Scanner;
public class FindIndexNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int sizeOfArray;
		int number;
		System.out.print("Enter the size of the Array: ");
		sizeOfArray=input.nextInt();
		int Array[]=new int[sizeOfArray];
		System.out.println("Please Enter the elements of the Array");
		for(int i=0; i<Array.length; i++){
			Array[i]=input.nextInt();
		}
		System.out.print("Please enter the number you are searching: ");
		number=input.nextInt();
		
		for(int i=0; i<Array.length; i++){
			if(number!=Array[i]){
				continue;
			}
			else {
				
				System.out.println("The index of element " +"\"" +number    + "\" is "   +i);
			}

		}

		input.close();
			}
}