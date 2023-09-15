package Array_questions;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter the elements present in the Array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}

}
