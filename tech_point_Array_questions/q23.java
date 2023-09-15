package tech_point_Array_questions;
import java.util.*;
public class q23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the rows");
		int m=sc.nextInt();
		System.out.println("enter the number of coloums");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the elements in the Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(" elements present in the Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int rsum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i+j==m-1) {
					rsum=rsum+arr[i][j];
				}
			}
		}
		System.out.println("Sum of the Right Diagonals = "+ rsum);

	}

}
