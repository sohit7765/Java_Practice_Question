
public class q21 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8};
		int sum=0;
		int n=arr.length+1;
		int total_sum=(n*(n+1))/2;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
			System.out.println("Missing number = "+ (total_sum-sum));
					
		}

	}
