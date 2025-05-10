import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        int a=new Scanner(System.in).nextInt();
        if((a&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        }
    }
