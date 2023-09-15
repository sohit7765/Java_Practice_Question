package tech_point_Array_questions;
import java.util.*;
public class q18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of rows and coloums...");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the Elements present in the Arrays...");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print the elements in the Array..");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
