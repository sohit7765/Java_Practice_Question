package function_questions;

public class q9 {

	public static void main(String[] args) {
		int [] arr= {1,3,4,6,8,9,12,45,78,96};
		int target=9;
		int start=0;
		int end=arr.length-1;
		int ans=BinarySearch(arr,target,start,end);
		if(ans==-1) {
			System.out.println("Elements are not present in the Array");
		}
		else {
			System.out.println("Elements is present at "+ans+" index position");
		}
	}
	static int BinarySearch(int []arr,int target,int start,int end) {
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				return BinarySearch(arr,target,start,mid-1);
			}
			else  {
				return BinarySearch(arr,target,mid+1,end);
			}
				}
		return -1;
			}
	}


