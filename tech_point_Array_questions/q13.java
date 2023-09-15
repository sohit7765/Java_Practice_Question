package tech_point_Array_questions;
import java.util.*;
public class q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size....");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements....");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the position....");
		int pos=sc.nextInt();
		System.out.println("enter the Number...");
		int x=sc.nextInt();
		System.out.println("the elements before inserting new elements...");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=n-1; i>=pos; i++) {
			arr[i]=arr[i-1];
			arr[pos-1]=x;
		}
			System.out.println("After inserting the elements...");
			for(int i=0; i<n; i++) {
				System.out.println(arr[i]);
		}

	}

}
