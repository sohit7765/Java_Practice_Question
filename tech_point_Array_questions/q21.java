package tech_point_Array_questions;
import java.util.*;
public class q21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number of rows");
		int m=sc.nextInt();
		System.out.println("enter the no.of the coloums");
		int n=sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("enter the Elements present in the First matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[m][n];
		System.out.println("enter the Elements present in the Second matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements in the First matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("elements in the Second matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After the multiplication of first and second matrix...");
		int arr3[][]=new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr3[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
