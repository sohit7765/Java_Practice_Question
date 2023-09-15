package function_questions;

public class NegativeElement_GoesLeftSide {

	public static void main(String[] args) {
		int[] arr= {-1,2,3,-4,-5,-6,7,8,-9};
		sort(arr);
		printArr(arr);
	}

	  static void printArr(int[] arr) {
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i]+",");
		  }
		
	}

	static void sort(int[] arr) {
		int j=0, temp;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	}

}
