package Assignment_2;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = sc.nextInt();
		System.out.println(countdigit(num, digit));
	}

	public static int countdigit(int num, int digit) {
		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}
}