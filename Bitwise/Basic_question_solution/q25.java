import java.util.Scanner;
public class q25 {
	public static String Reverse(String s1) {
		String rev="";
		int leng=s1.length();
		for(int i=leng-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String....");
		String s1=sc.nextLine();
		System.out.println(Reverse(s1));

	}

}
