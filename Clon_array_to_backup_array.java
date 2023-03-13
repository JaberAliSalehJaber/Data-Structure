import java.util.Arrays;

public class Clon_array_to_backup_array {
    public static <T> T[]cloneArray(T[] original){
        return original.clone();
    }

    public static void main(String[] args) {
        Integer[] original = {1,2,3,4,5};
        Integer[] clone =cloneArray(original);
        //MODIFYING THE ORIGINAL ARRAT FOR CHICK;
        original[0]=10;
        System.out.println("Original array: "+ Arrays.toString(original));
        System.out.println("Clone array: "+ Arrays.toString(clone));
    }
}
