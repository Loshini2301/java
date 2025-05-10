
import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
