package tech_point_Array_questions;
import java.util.*;
public class q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number....");
		int n=sc.nextInt();
		int last_digit=n%10;
		int first_digit=n;
		while(first_digit >10) {
			first_digit=first_digit/10;
		}
		System.out.println("The sum of first_digit and last_digit is = "+(first_digit + last_digit));

	}

}
