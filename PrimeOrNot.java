package assignment1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=1) {
			System.out.println("not prime");
		}
		else {
			int b=1;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("not prime");
					b=0;
					break;
				}
			}
			if(b==1) {
				System.out.println("prime");
			}
		}

	}

}
