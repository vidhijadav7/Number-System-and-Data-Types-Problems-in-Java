package Lec_12;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		int LCM = (divisor * dividend) / GCD(divisor, dividend);
		System.out.println(LCM);
	}

	public static int GCD(int divisor, int dividend) {
		while ((dividend % divisor) != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}
}