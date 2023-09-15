package tech_point_Array_questions;
import java.util.Scanner;
public class Identity_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows and coloumns");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		if(m!=n) {
			System.out.println("Sorry! row not equals coloumns");
		}
		else {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
		}
		System.out.println("Identity Matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		

	}

}
