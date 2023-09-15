package function_questions;

import java.util.Scanner;

public class q29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int ans= countbit(n);
		System.out.println(ans);
	}
	static int countbit(int n) {
		int c=0;
		while(n>0) {
			if((n&1) !=0 )
				c++;
			n=n>>1;
		}
		return c;
	}
}
