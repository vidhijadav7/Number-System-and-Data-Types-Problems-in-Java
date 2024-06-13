package Assignment_2;

import java.util.Scanner;

public class Sum_of_oddplaced_evenplaced_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum_of_oddplaced_evenplaced_digits(n);
	}

	public static void sum_of_oddplaced_evenplaced_digits(int n) {
		int evensum = 0;
		int oddsum = 0;
		int pos = 1;
		while (n != 0) {
			int rem = n % 10;
			if (pos % 2 == 0) {
				evensum += rem;
			} else {
				oddsum += rem;
			}
			n /= 10;
			pos++;
		}
		System.out.println(oddsum);
		System.out.println(evensum);
	}
}