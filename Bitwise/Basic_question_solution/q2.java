import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name....");
		String s1=sc.nextLine();
		int leng=s1.length();
		String rev="";
		for(int i=leng-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println("the given String is palindromic");
		}
		else {
			System.out.println("the given string is not palindromic");
		}
	}

}
