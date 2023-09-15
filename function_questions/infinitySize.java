package function_questions;

public class infinitySize {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,8,11,13,18,23,25,29,32,39,44,46,47,48,55};
		int target=39;
		int ans=search(arr,target);
		System.out.println(ans);
	}

	 static int search(int[] arr, int target) {
		int start=0;
		int end=1;
		while(target>arr[end]) {
			start=end;
			end=end*2;
		}
		return binarySearch(arr,target,start,end);
			
		}

	 static int binarySearch(int[] arr, int target, int start, int end) {
		 while(start<=end) {
			int mid=(start+end)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		 }
		 return-1;
	}
}
