package Assignment_2;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt(); // lower limit: 0
		int ul = sc.nextInt(); // upper limit: 100
		int step = sc.nextInt(); // 20
		convert(ll, ul, step);
	}

	public static void convert(int ll, int ul, int step) {
		for (int i = ll; i <= ul; i = i + step) {
			int celsius = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + celsius);
		}
	}
}