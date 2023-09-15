
public class q16 {
	public static int Sum(int arr[],int n,int sum) {
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int arr[]= {4,21,43,27,12,54};
		int n=arr.length;
		int sum=0;
		System.out.println(Sum(arr,n,sum));

	}

}
