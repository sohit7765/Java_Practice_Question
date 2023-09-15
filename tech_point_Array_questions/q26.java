package tech_point_Array_questions;
import java.util.*;
public class q26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows");
		int m=sc.nextInt();
		System.out.println("enter the no. of coloums");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the Elements present in the Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements present in the Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Lower Traingular Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i<j) {
					System.out.print("0 ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
				System.out.println();
		}

	}

}
