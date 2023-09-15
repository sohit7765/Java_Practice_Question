package function_questions;
import java.util.Scanner;
public class q26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		printdivisor(n);
	}

	private static void printdivisor(int n) {
		System.out.println("All divisors of the Given Number");
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.println(i);
		}
	}

}
