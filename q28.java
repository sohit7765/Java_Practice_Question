package function_questions;
import java.util.Scanner;
public class q28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n and k");
		int n=sc.nextInt();
		int k=sc.nextInt();
		setbit(n,k);

	}
	static void setbit(int n, int k) {
		if ((n&(1<<(k-1)))!=0) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
