package function_questions;
public class CommonElements {

	public static void main(String[] args) {
		int [] arr1= {2,4,6,8,9,11};
		int [] arr2= {11,43,5,2,9,56};
		commonEle(arr1,arr2);

	}

	private static void commonEle(int[] arr1, int[] arr2) {
		System.out.println("Common Elements Present in The Arrays");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
	}

}
