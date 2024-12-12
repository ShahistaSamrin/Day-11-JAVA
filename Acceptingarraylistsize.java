/*  5
11 2 3 45 39//input values
6//output   */
import java.util.*;
class Acceptingarraylistsize{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //accepting array list elements
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.add(89);
        System.out.println(a.size());
    }
}