/* true 
   false */
import java.util.*;
public class Arraylist6{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(90);
        a.add(89);
        a.add(767);
        System.out.println(a.contains(90));
        System.out.println(a.contains(34));
    }
}