package function_questions;

public class Missing_Number {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		MissingNumber(arr);

	}

	 static void MissingNumber(int[] arr) {
		 int sum=0;
		 for(int i=0;i<arr.length; i++) {
			 sum=sum+arr[i];
		 }
		int expected_number=arr.length+1;
		int Totalsum=(expected_number*(expected_number+1))/2;
		int missingnumber=Totalsum-sum;
		System.out.println(missingnumber);
	}
}
