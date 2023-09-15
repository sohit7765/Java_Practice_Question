package function_questions;
import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int n=sc.nextInt();
		boolean ans=isArmStrong(n);
		System.out.println(ans);
	}
	public static boolean isArmStrong(int n){
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			}
		if(sum==temp) {
			return true;
		}
		return false;
	}

}
