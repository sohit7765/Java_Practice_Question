import java.util.*;
public class count_the_no_of_1 {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		System.out.println(count);
	}

}
