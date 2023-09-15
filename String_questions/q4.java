import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String..");
		String s1=sc.nextLine();
		int leng=s1.length();
		String rev="";
		for(int i=leng-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println("After reversing the String "+rev);

	}

}
