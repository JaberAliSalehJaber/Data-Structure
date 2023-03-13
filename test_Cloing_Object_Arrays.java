import java.util.Arrays;

public class test_Cloing_Object_Arrays {
    public static void main(String[] args) {
       cloing_Object_Arrays obj1=new cloing_Object_Arrays("ali",1);
        cloing_Object_Arrays obj2=new cloing_Object_Arrays("salah",2);
        cloing_Object_Arrays obj3=new cloing_Object_Arrays("jaber",3);
        cloing_Object_Arrays obj4=new cloing_Object_Arrays("ahmed",4);
        cloing_Object_Arrays all_array[]={obj1,obj2,obj3,obj4};
        cloing_Object_Arrays copy_array[]=all_array.clone();
        System.out.println(Arrays.toString(all_array));
        System.out.println(Arrays.toString(copy_array));
        all_array[1].setName("mohammad");
        System.out.println(Arrays.toString(all_array));
        System.out.println(Arrays.toString(copy_array));
    }
}
