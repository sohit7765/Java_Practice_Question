package function_questions;
import java.util.Scanner;
public class ArmStrongNumber {
	public static void main(String[] args) {
		int arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		armStrong(n,arm);
	}
	 static void armStrong(int n,int arm) {
		 while(n>0) {
			 int rem=n%10;
			 arm=(rem*rem*rem)+arm;
			 n=n/10;
		 }
		 if(arm==n) {
			 System.out.println(n+" is a Arm Strong Number");
		 }
		 else {
			 System.out.println(n+" is a not Arm Strong Number");
		 }
	}

}
