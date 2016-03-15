import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * Задача 1
		 */
		int n = 1 + (int) (Math.random() * 10);
		int a[][] = new int[4][4];
		for (int j = 0, k = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++, k++) {
				a[i][j] = n + k;
			}
		}
		System.out.println(n);
		System.out.println();

		/*
		 * Задача 2
		 */

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * Задача 3
		 */

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (a[i][j] % 2 == 1) {
					a[i][j] = a[i][j] * 2;
				}
			}
		}

		System.out.println();
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}