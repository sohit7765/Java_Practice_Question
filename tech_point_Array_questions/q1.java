package tech_point_Array_questions;

public class q1 {

	public static void main(String[] args) {
		int [][]arr= {{1,26,3},{4,23,6},{11,7,21}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		int lsum=0;
		System.out.println("Left diagonal sum..");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==j) {
					lsum=lsum+arr[i][j];
				}
			}
		}
		System.out.println(lsum);
		int rsum=0;
		System.out.println("right diagonal sum");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i+j==2) {
					rsum=rsum+arr[i][j];
				}
			}
		}
		System.out.println(rsum);
		int ad;
		System.out.println("Absolute differene between those two....");
	    ad=lsum-rsum;
		System.out.println(ad);
	}

}
