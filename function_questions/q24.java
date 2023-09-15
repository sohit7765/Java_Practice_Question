package function_questions;

public class q24 {

	public static void main(String[] args) {
		int ans=gcd(10,15);
		System.out.println(ans);
	}

	 static int gcd(int a, int b) {
		while(a!=b) {
			if(a>b) {
				return a=a-b;
			}
			else {
				return b=b-a;
			}
		}
		return a;
	}

}
