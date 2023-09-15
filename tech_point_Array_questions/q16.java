package tech_point_Array_questions;
import java.util.*;
public class q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the Array....");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements presents in the Arrays.....");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println("Second largest element present in the Array is "+arr[1]);
		}

	}

}
