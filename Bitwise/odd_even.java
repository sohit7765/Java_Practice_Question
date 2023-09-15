import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if((n&1)==1) {
			System.out.println(n+" is a Odd Number");
		}
		else {
		System.out.println(n+" is a Even Number");
		}
	}

}
