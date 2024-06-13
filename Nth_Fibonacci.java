package Assignment_2;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthfibonacci(n));
	}

	public static int nthfibonacci(int n) {
		int a = 0;
		int b = 1;
		int c;
		if (n <= 1)
			return n;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}