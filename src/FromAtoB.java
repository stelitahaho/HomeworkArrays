import java.util.Scanner;
import java.util.Arrays;
public class FromAtoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a");
		int a = sc.nextInt();
		System.out.println("Insert b");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

	}
}