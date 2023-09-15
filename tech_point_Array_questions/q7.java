package tech_point_Array_questions;

import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		int [] a= {5,11,25,12,19};
		int [] b= {21,46,75,71,23,111,1};
		int leng1=a.length;
		int leng2=b.length;
		int leng3=leng1+leng2;
		int [] c=new int[leng3];
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			c[leng1+i]=b[i];
		}
		for(int i=0; i<c.length; i++ ) {
			Arrays.sort(c);
		System.out.println("After Sorting the Array...." +c[i]);
		}
}
}