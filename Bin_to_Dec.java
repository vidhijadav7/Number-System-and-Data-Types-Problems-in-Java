package Lec_11;
import java.util.Scanner;
public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 101011;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int mul = 1;
		while (n != 0) {
			int rem = n % 10; //des base
			ans = ans + rem * mul;
			mul *= 2; // mul = mul *2; src base
			n /= 10; // n = n / 10; des base
		}
		System.out.println(ans);
	}
}