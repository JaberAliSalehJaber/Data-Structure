import java.util.Arrays;
import java.util.Random;

public class Repratedly_selects_and_removes_random {
    public static void removeRandomEntries(int[]array){
        Random random=new Random();
        int length = array.length;
        while (array.length > 0){
            int index=random.nextInt(array.length);
            //int randomEntry = array[Index];
            //array = removeEntryAtIndex(array,randomIndex);
           // System.out.println("Removed entry: "+randomEntry);
            array[index]=array[array.length - 1];
            length--;
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        removeRandomEntries(arr);
        System.out.println(Arrays.toString(arr));
    }
}
