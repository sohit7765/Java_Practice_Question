package tech_point_Array_questions;
import java.util.*;
public class q22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers of the rows");
		int m=sc.nextInt();
		System.out.println("enter the numbers of the coloums");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the elements present in the Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("before transpose of the elements");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After transpose of the elements");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
