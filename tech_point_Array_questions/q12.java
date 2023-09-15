package tech_point_Array_questions;
import java.util.Scanner;
public class q12 {

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size...");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements in the Array...");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Arrange the Array in desending order....");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}

}
