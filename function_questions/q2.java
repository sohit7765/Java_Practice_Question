package function_questions;
import java.util.*;
public class q2 {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		String ans=isPrime(n);
		System.out.println("the given Number " +n+" is a "+ans);

	}
	static String isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return "Not a prime Number";
		}
	}
		return "prime Number";
	}

}*/
	    public static int[] runningSum(int[] nums) {
	        int sum=0;
	        for(int i=0; i<nums.length; i++){
	            sum=sum+nums[i];
	        }   
	        return new int[] {sum};
	    }
	    public static void main(String[] args){
	        int[] nums={1,2,3,4};
	       int [] ans=runningSum(nums);
	       System.out.println(ans);
	    }
	}