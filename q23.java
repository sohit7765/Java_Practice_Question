package function_questions;
import java.util.*;
public class q23 {

	public static void main(String[] args) {
		int ans=gcd(10,15);
		System.out.println("GCD of the Given Number is = "+ans);
	}

	private static int gcd(int i, int j) {
		int res=Math.min(i, j);
		while(res>0) {
		if(i%res==0 && j%res==0) {
			break;
		}
		res--;
	}
		return res;
	}

}
