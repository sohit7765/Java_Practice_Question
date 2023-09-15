package function_questions;

public class floor_of_a_BinarySearch {

		public static void main(String[] args) {
			int [] arr= {23,43,11,65,98,67,41,21};
			int item=63;
			System.out.println(BinarySearch(arr,item));
		}

		 static int BinarySearch(int[] arr,int item) {
			int start=0;
			int end=arr.length-1;
			while(start<=end) {
				int mid=(start+end)/2;
				if(arr[mid]>item) {
					end=mid-1;
				}
				else if(arr[mid]<item) {
					start=mid+1;
				}
				else {
					return mid;
				}
			}
			return end;
		}

	}
