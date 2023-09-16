import java.util.*;
public class q1aa {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();
		int temp=n;
		isPalindrome(n);
		}
	private static void isPalindrome(int n) {
		int rev=0,rem;
		int temp=n;
		while(n>0) {
			 rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;	
		}
		if(temp==rev) {
			System.out.println("the given number is a palindromic");
		}
		else {
			System.out.println("the given Number is not palindromic");
		}
	}

}

