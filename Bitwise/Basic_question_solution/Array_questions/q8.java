package Array_questions;

public class q8 {

	public static void main(String[] args) {
		System.out.println("enter the first arrays....");
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter the second Arrays....");
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Addition of the First Arrays and Second Arrays....");
		int c[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Substraction of First and Second Arrays....");
		int d [][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				d[i][j]=a[i][j]-b[i][j];
				System.out.print(d[i][j]+",");
			}
			System.out.println();
			}
		System.out.println("After the multiplication of First And Second Arrays....");
		int e[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				e[i][j]=a[i][j]*b[i][j];
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After the division of First and Second Array...");
		int f[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				f[i][j]=a[i][j]/b[i][j];
				System.out.print(f[i][j]+",");
			}
			System.out.println();
		}
	}
		
	}
