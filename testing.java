package program;

public class demo {
Public int add(int a, int b)
{
   return a+b;
}
   public static void main (String[] args) {
   
    int a,b,ans;
    System.out.println("Enter number1:");
    Scanner s= new Scanner(System.in);
    a = s.nextint();
    System.out.println("Enter number2:");
    b = s.nextint();
    ans = add(a,b);
    System.out.println("Addition of 2 numbers is:" + ans);

    }

   } 
