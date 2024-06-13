package Assignment_2;

import java.util.Scanner;

public class OddandEven_backinDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long x = s.nextLong();
		while (x-- > 0) {
			long n = s.nextLong();
			long evensum = 0, oddsum = 0;
			while (n != 0) {
				long rem = n % 10;
				if (rem % 2 == 0) {
					evensum += rem;
				} else {
					oddsum += rem;
				}
				n /= 10;
			}
			if (evensum % 4 == 0 || oddsum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}