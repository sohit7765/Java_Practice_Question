package function_questions;

import java.util.Scanner;

public class q22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int ans=CountZeros(n);
		System.out.println("the number of Zeros present in the Factorial ="+ans);
		
	}
	static int CountZeros(int n) {
		int res=1;
		for(int i=2; i<=n; i++) {
			res=res*i;
		}
		int count=0;
		while(res%10==0) {
			count++;
			res=res/10;
		}
		return count;
	}

}
