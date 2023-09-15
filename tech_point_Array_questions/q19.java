package tech_point_Array_questions;
import java.util.*;
public class q19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of rows and coloums....");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("enter the elemnts of the first matrix....");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}	
		int arr2[][]=new int[m][n];
		System.out.println("enter the elements of the Second matrix....");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements of the first matrix...");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("elements of the second  matrix...");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of the first and Second matrix...");
		int arr3[][]=new int[3][3];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
