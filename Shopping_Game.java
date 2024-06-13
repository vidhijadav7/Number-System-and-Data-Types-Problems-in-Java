package Assignment_2;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 0;
		while (count < T) { // Adjusted loop condition
			int M = sc.nextInt();
			int N = sc.nextInt();
			int aayush = 0, harshit = 0;
			int smartphones = 1;
			while (true) {
				if (smartphones % 2 == 1) { // Aayush's turn
					if (aayush + smartphones <= M) {
						aayush += smartphones;
					} else {
						System.out.println("Harshit");
						break;
					}
				} else { // Harshit's turn
					if (harshit + smartphones <= N) {
						harshit += smartphones;
					} else {
						System.out.println("Aayush");
						break;
					}
				}
				smartphones++;
			}
			count++;
		}
	}
}