package tech_point_Array_questions;
import java.util.*;
public class q20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of rows");
		int m=sc.nextInt();
		System.out.println("enter the size of the coloums");
		int n=sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("enter the elements in the first Matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[m][n];
		System.out.println("enter the elements in the second Matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements in the first Matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr1[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println("elements in the Second Matrix ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr2[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println("After the substraction of the Second Matrix from the first");
		int arr3[][]=new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr3[i][j]=arr2[i][j]-arr1[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
			}
		}
		
	}

