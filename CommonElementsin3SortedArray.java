package function_questions;
import java.util.*;
public class CommonElementsin3SortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,3,5,6,7,8};
		int[] arr2= {1,4,5,7,9};
		int[] arr3= {1,4,5,6,7,11,32};
		comElements(arr1,arr2,arr3);
	}
	private static void comElements(int[] arr1, int[] arr2, int[] arr3) {
		ArrayList<Integer> al=new ArrayList<>();
		int x=0,y=0,z=0;
		while(x<arr1.length && y<arr2.length && z<arr3.length){
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z]) {
				al.add(arr1[x]);
				x++;
				y++;
				z++;
			}
			if(arr1[x]<arr2[y]) {
				x++;
			}
			else if(arr2[y]<arr3[z]) {
				y++;
			}
			else {
				z++;
			}
			System.out.println("Common Elements Present In the Sorted Array");
			for(int no: al) {
				System.out.println(no);
			}
		}
		
	}

}
