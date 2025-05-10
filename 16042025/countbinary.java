import java.util.*;
public class countbinary {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int temp=n;
        int c=0;
        while(temp>0){
            if((temp&1)==1){
                c+=1;
            }
            temp>>=1;
        }
        System.out.println(c);

    }
}
