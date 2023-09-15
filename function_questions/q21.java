package function_questions;
import java.util.Scanner;
public class q21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int ans=fact(n);
		System.out.println(ans);
	}
	static int fact(int n) {
		int res=1;
		for(int i=2; i<=n; i++) {
			res=res*i;
		}
		return res;
	}

}
