package tech_point_Array_questions;
import java.util.Scanner;
public class q17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size...");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements presents in the Array..");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println("Second smallest elements "+ arr[1]);
		}

	}

}
