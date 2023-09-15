package tech_point_Array_questions;
import java.util.Scanner;
public class q11 {

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the Array....");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements present in the Array...");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
				   temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Arrange in the Ascending order....");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}

}
