import java.util.Arrays;

public class cloing_integer_Arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr1[] ={6,7,8,9,7} ;
        for (int i = 0; i < arr.length; i++)
            arr1[i] = arr[i];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        arr[0]=4;
        System.out.println("the arrays after the update ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }
}

