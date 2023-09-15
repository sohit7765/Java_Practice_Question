//Intersection of two Array.....
public class q20 {

	public static void main(String[] args) {
		int [] arr1= {4,2,6,7,8,11};
		int [] arr2= {1,11,21,3,7};
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
