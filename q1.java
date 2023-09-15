import java.util.*;
public class q1 {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String...");
		String s1=sc.nextLine();
		for(int i=0; i<s1.length(); i++) {
			count++;
		}
		System.out.println(count);

	}

}
