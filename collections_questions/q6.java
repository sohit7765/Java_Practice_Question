package collections_questions;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number...");
			int n=sc.nextInt();
			int last_digit=n%10;
			int first_digit=n;
			while(first_digit>=10) {
				first_digit=first_digit/10;
			}
			System.out.println(first_digit);
			System.out.println(last_digit);
			System.out.println("sum of the first_digit and last_digit = " +(first_digit+last_digit));
		}
	}

}
