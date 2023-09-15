
public class q2 {

	public static void main(String[] args) {
		int n=1;
		printNum(n);

	}

	private static void printNum(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		printNum(n+1);
		
	}

}
