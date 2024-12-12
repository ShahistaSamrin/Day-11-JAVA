/*  5//array size
11 2 3 45 39//input values
11 2 3 45 39//output   */
import java.util.*;
class Arraylist2{
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
        //printing the elements in an Array list
        for(int i=0;i<a.size();i++)
        System.out.print(a.get(i)+" ");
    }
}