import java.util.Arrays;

public class ArrayEquivalenceTest {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8,9,4};
        int[] array3={1,2,3,4,5};
        System.out.println("Array1 and Array2 are equal: "+ Arrays.equals(array1,array2));
        System.out.println("Array1 and Array3 are equal: "+ Arrays.equals(array1,array3));
    }
}
