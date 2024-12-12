import java.util.*;
interface out{
    void outm();
    interface in{
        void innm();
    }
}
class Nestedinterface implements out.in{
    public void innm()
    {
        System.out.println("hello i'm inner method");
    }
    public static void main(String args[]){
        Nestedinterface h=new Nestedinterface();
        h.innm();
    }
}