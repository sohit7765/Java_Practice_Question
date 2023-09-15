package function_questions;
import java.util.*;
public class Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		factor(n);
	}

	static void factor(int n) {
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
