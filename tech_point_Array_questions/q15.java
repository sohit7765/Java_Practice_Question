package tech_point_Array_questions;
import java.util.*;
public class q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the Array....");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements in the Arrays...");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the elements that you wants to delete....");
		int x=sc.nextInt();
		for(int i=0; i<n; i++) {
			if(arr[i]==x) {
				arr[i]=arr[i+1];
			}
		}
		System.out.println("After deleting the elements....");
		for(int i=0; i<n-1; i++) {
			System.out.println(arr[i]);
		}

	}

}
