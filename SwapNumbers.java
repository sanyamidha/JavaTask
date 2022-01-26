package assignment1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a=");
		int a = sc.nextInt();
		System.out.println("b=");
		int b = sc.nextInt();
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("a= "+a+"  b="+b);
	}

}
