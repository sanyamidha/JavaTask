package assignment1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n>0) {
			int a = n%10;
			rev = rev*10 + a;
			n/=10;
			
		}
		System.out.println(rev);

	}

}
