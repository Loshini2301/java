import java.util.*;
public class bitwisereversednumber {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        System.out.println("binary number "+Integer.toBinaryString(num));
        int r=0;
        for(int i=0;i<32;i++){
             r<<=1;
             r|=(num&1);
             num>>=1;
        }
        System.out.println("reversed number: "+r);

    }
}
