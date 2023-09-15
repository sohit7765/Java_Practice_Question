package function_questions;
import java.util.Scanner;
public class q25 {
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean ans=isPrime(n);
		System.out.println(ans);
	}

}
