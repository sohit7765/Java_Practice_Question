package function_questions;
import java.util.*;

public class q12 {
		static long NFibonacciTerm(int n)
		{
			if(n==1) {
				return 0;
			}
			else if(n==2){
				return 1;
			}
		return NFibonacciTerm(n-1) +  NFibonacciTerm(n-2);
		}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println(NFibonacciTerm(n));
	}

}
