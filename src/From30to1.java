
public class From30to1 {

	public static void main(String[] args) {
		int [][] Array= {  {30,29,28,27,26,25},
		           {24,23,22,21,20,19},
		           {18,17,16,15,14,13},
	               {12,11,10, 9, 8, 7},
                { 6, 5, 4, 3, 2, 1}
		
		         };
for(int i=0;i<Array.length;i++){
	for(int j=0;j<Array.length+1; j++){
		System.out.print(Array[i][j]+ "\t");
	}
	System.out.println();
}

}
}