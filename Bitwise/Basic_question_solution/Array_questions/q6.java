package Array_questions;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Array....");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("enter the elements presents in the Array.....");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
