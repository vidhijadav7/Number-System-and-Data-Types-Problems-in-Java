package Assignment_2;

import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(ReplaceAllZeros(n));
	}
	
	public static long ReplaceAllZeros(long n) {
		long mul = 1;
		long sum = 0;
		if(n==0) {
			sum = 5;
		}
		else {
			while(n >0) {
				long rem = n%10;
				if(rem == 0) {
					rem = 5;
					sum = sum + rem * mul;
				} else {
					sum = sum + rem * mul;
				}
				n = n / 10;
				mul = mul * 10;
			}
		}
		return sum;
	}
}