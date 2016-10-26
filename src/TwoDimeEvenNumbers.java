
public class TwoDimeEvenNumbers {

	public static void main(String[] args) {
		int[][] array = { { 5, 6, 7, 8 }, { 42, 48, 57, 60, 64 }, { 100, 110, 123, 160 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] % 2 == 0) {
					System.out.println(array[i][j]);

				}
			}
		}
	}	
}