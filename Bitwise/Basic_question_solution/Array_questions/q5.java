package Array_questions;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int n=sc.nextInt();
		int []arr1=new int[n];
		int [] arr2=new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("elements of new Array...");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
