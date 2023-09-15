package Array_questions;
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements present in the array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+",");
		}
	}

}
