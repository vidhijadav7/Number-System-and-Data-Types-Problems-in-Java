package Lec_8;

import java.util.Scanner;

public class Prime_number_checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==1) {
			System.out.println("N is not a prime");
		}else {
			int count = 0;
			for(int i = 2; i<=n-1; i++) {
				if(n%i == 0) {
					count++;
					break;
				}
			}
			if(count>0) {
				System.out.println("Number is not a prime");
			}else {
				System.out.println("Number is a prime");
			}
		}
	}
}
