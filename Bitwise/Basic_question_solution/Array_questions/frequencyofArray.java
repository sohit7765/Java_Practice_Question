package Array_questions;

public class frequencyofArray {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,4,3,2,1,4,4,3,1,7,8,1};
		int visitedArr[]=new int[arr.length];
		int visited=-1;
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					visitedArr[j]=-1;
				}
			}
			if(visitedArr[i] !=visited) {
				visitedArr[i]=count;
			}
		}
		for(int i=0; i<visitedArr.length; i++) {
			if(visitedArr[i] !=visited) {
				System.out.println("frequecy of "+arr[i]+ " | "+visitedArr[i]);
				
			}
		}

	}

}
