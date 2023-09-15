package collections_questions;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String...");
		String s1=sc.nextLine();
		int total_count=s1.length();
		int total_count_After_removing_a_particular_character=s1.replace("l", "").length();
		System.out.print("the length of the String after removing a particular character...." +(total_count-total_count_After_removing_a_particular_character));
		

	}

}
