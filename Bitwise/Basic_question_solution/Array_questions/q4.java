package Array_questions;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		int sum=0;
		System.out.println("enter the elements present in the array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of given number is equal to "+ sum);

	}

}
