package collections_questions;
import java.util.Random;
public class q3 {

	public static void main(String[] args) {
		Random rn=new Random();
		int max=20;
		int min=10;
		int n=rn.nextInt(max-min)+min;
		System.out.println(n);

	}

}
