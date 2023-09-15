
public class q3 {

	public static void main(String[] args) {
		printSum(1,6,0);
	}
	static void printSum(int i,int n, int sum) {
		if(i>n) {
			//sum=sum+i;
			//System.out.println(sum);
			return;
		}
		sum=sum+i;
		System.out.println(sum);
		printSum(i+1,n,sum);
	}

}
