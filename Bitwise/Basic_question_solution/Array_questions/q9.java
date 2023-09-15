package Array_questions;

public class q9 {
	public static void bubblesort(int arr[],int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {23,43,11,21,45};
		int n=arr.length;
		System.out.println("Before performing Bubble sort operation ");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		bubblesort(arr,n);
		System.out.println("after performing bubble sort operation");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
