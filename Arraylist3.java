/* [898, 89, 1, 78] */
import java.util.*;
public class Arraylist3{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(1);
        a.add(78);
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
}