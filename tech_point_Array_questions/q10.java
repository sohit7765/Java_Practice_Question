package tech_point_Array_questions;
import java.util.*;
public class q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				a1.add(arr[i]);
			}
			else {
				a2.add(arr[i]);
			}
		}
		System.out.println("Even elements Are....");
		for(int no1: a1) {
			System.out.println(no1);
		}
		System.out.println("odd number Are.....");
		for(int no2: a2) {
			System.out.println(no2);
		}
	}
}