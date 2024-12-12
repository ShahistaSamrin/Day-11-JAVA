/*  [2, 45, 77, 90, 232]  */
import java.util.*;
class Arraylistsorting{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(90);
        a.add(77);
        a.add(2);
        a.add(232);
        Collections.sort(a);
        System.out.println(a);
    }
}