package tech_point_Array_questions;

public class q8 {

	public static void main(String[] args) {
		int arr[]= {2,4,5,2,6,6,3,7,6};
		int visitedArr[]=new int[arr.length];
		int visited=-1;
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					visitedArr[j]=visited;
				}
			}
			if(visitedArr[i]!=visited) {
				visitedArr[i]=count;
			}
		}
		for(int i=0; i<visitedArr.length; i++) {
			if(visitedArr[i]!=visited){
			System.out.println("Frequency of "+arr[i]+" : "+ visitedArr[i]);
		}
		}

	}

}
