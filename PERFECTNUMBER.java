package function_questions;
import java.util.*;
public class PERFECTNUMBER {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number....");
		int n=sc.nextInt();
		perfectNumber(n,sum);
	}

	static void perfectNumber(int n,int sum) {
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println(n+" is a Perfect Number");
		}
		else {
			System.out.println(n+" is not a Perfect Number");
		}
		
	}

}
