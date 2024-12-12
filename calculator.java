/*  1.Sum
2.Sub
3.mul
4.div
5.pow
3 4// a,b values
1              2                3                    4            5
Addition 7     Substraction -1  Multiplication 12    Division 0   Power 81   */
import java.util.*;
class calculator1{
  public void sum(int a,int b)
  {
    System.out.println("Addition "+(a+b));
  }
  public void sub(int a,int b)
  {
    System.out.println("Substraction "+(a-b));
  }
  public void mul(int a,int b)
  {
    System.out.println("Multiplication "+(a*b));
  }
  public void div(int a,int b)
  {
    System.out.println("Division "+(a/b));
  }
  public int exponentiation(int a,int b)
  {
    if(b==0)
    {
      return 1;
    }return a*exponentiation(a,b-1);
  }
  public void display()
  {
    System.out.println("1.Sum");
    System.out.println("2.Sub");
    System.out.println("3.mul");
    System.out.println("4.div");
    System.out.println("5.pow");
  }
}
class calculator{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    calculator1 obj = new calculator1();
    obj.display();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int option = sc.nextInt();
    if(option==1)
    {
    obj.sum(a,b);
    }else if(option==2)
    {
      obj.sub(a,b);
    }else if(option==3)
    {
      obj.mul(a,b);
    }else if(option==4)
    {
      obj.div(a,b);
    }else if(option==5){
      int res = obj.exponentiation(a,b);
      System.out.println("Power: "+res);
    }else{
      System.out.println("Invalid option");
    }
  }
}