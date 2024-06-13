package Assignment_2;

import java.util.Scanner;

public class Conversion_Any_To_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int num = sc.nextInt();
		System.out.println(conversion(num, sb, db));
	}

	public static int conversion(int num, int sb, int db) {
		// any to decimal
		int ans = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % 10; // capturing the digits
			ans += rem * mul;
			mul = mul * sb;
			num = num / 10;
		}

		// refresh the variables
		mul = 1;
		num = ans;
		ans = 0;

		// decimal to db
		while (num != 0) {
			int rem = num % db; // capturing the digits
			ans += rem * mul;
			mul = mul * 10;
			num = num / db;
		}
		return ans;
	}
}