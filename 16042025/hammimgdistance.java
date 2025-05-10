import java.util.*;
public class hammimgdistance {
    public static void main(String[] args) {
        int n1=new Scanner(System.in).nextInt();
        int n2=new Scanner(System.in).nextInt();
        int ex=n1^n2;
        int c=0;
        while(ex>0){
            if((ex&1)==1){
                c+=1;
            }
            ex>>=1;
        }
        System.out.println(c);
    }
}
