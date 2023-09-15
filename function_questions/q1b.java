package function_questions;
import java.util.Scanner;
public class q1b {
/*	public static void main(String[] args) {
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
*/
     public static void main(String []args){
	         int[] arr={1,2,3,4,5};
	         int start=arr[0];
	         int end=arr.length;
	         Swap(arr,start,end);
	     }
	    // static void Swap(int[] arr,int start,int end){
	    private static void Swap(int[] arr, int start, int end) {
	    	while(start<end)
			{
	             int temp=arr[start];
	             arr[start]=arr[end];
	             arr[end]=temp;
	             start++;
	             end--;
	         }
	     }
	}