package Assignment_2;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int n = 1;
		while (n <= n1) {
			int val = (3 * n) + 2;
			if (val % n2 == 0) {
				n1++;
			} else {
				System.out.println(val);
			}
			n++;
		}
	}
}