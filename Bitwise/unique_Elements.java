
public class unique_Elements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,4,3,2,1,4};
		int res=0;
		for(int i=0; i<arr.length; i++) {
			res=res^arr[i];
		}
		System.out.println("unique elements is "+res);

	}

}