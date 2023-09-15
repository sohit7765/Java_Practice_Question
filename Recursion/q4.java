
public class q4 {

	public static void main(String[] args) {
		double ans=printPow(3,5);
		System.out.println(ans);

	}

	private static double printPow(double x, double y) {
		if(y==0) {
			return 1;
		}
		else {
			return (x*Math.pow(x, y-1));
		}
	}

}
