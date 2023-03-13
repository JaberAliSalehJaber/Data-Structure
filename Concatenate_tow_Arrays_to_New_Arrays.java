import java.util.Arrays;

public class Concatenate_tow_Arrays_to_New_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={5,6,7,8};
        int two_array[]=new int[arr.length+arr1.length];
        int i=0;
        for ( i = 0; i < arr.length; i++) {
            two_array[i]=arr[i];
        }
        for (int j = 0; j <arr1.length ; j++) {
            two_array[i]=arr1[j];
            i++;
        }
        System.out.println(Arrays.toString(two_array));
    }
}
