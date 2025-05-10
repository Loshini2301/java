import java.util.*;
public class SwapingNumbers {
    public static void main(String[] args) {
       int a=new Scanner(System.in).nextInt(); 
       int b=new Scanner(System.in).nextInt(); 
       Swappingnum(a, b);
       Swappingnumtemp(a, b);
    }
    public static void Swappingnum(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swapping variable without temp "+a);
        System.out.println("swapping variable without temp "+b);
        

    }
    public static void Swappingnumtemp(int a,int b){
        int temp=a^b;
        a=a^temp;
        b=b^temp;
        System.out.println("swapping variable with temp "+a);
        System.out.println("swapping variable with temp "+b);

    }
    
}
