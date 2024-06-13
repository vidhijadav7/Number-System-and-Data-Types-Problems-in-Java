package Assignment_2;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Print_Armstrong_Numbers(n1, n2);
	}

	public static void Print_Armstrong_Numbers(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			int digits = 0;
			int result = 0;
			int n = i;
			// number of digits calculation
			while (n != 0) {
				n /= 10;
				digits++;
			}
			n = i;
			// result contains sum of nth power of its digits
			while (n != 0) {
				int rem = n % 10;
				result += Math.pow(rem, digits);
				n /= 10;
			}
			if (result == i) {
				System.out.println(result + " ");
			}
		}
	}
}