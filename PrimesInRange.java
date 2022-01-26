package assignment1;

import java.util.*;

public class PrimesInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			int b = 1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					b=0;
				}
			}
			if(b==1) {
				System.out.println(i);
			}
		}
	}

}
