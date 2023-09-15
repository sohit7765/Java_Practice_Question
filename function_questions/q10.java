package function_questions;
public class q10 {
    static int Maximum(int[] arr) {
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;  
    }
    static int minimum(int [] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String [] args){
        int [] arr={-2,1,-4,5,3};
        int maxsum=Maximum(arr);
        int minsum=minimum(arr);
        System.out.println(maxsum);
        System.out.println(minsum);
        int sum=maxsum+minsum;
        System.out.println(sum);
    }
}
