package collections_questions;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String.....");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		System.out.println("Character\tFrequency");
		for(char ch='a'; ch<='z'; ch++) {
			int c=0;
			for(int i=0; i<s1.length(); i++) {
				if(ch == s1.charAt(i));
					 c++;
				}
			if(c!=0)
			System.out.println(ch+"\t\t\t"+c);
		}
	}

}
