package pattern;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of Rows");
		int n=sc.nextInt();
		System.out.println("Enter The Number of Columns");
		int m=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}