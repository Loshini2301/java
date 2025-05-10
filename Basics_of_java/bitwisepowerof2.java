import java.util.*;

public class bitwisepowerof2 {
    public static void main(String args[]){
        int num=new Scanner(System.in).nextInt();
        int op=num & (num-1);
        if(op==0){
            System.out.println("number is power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
        for(int i=2;i<num;i++){
            if((i & (i-1))==0){
                System.out.println(i+ " is power of 2 ");
            }
        }
    }
}


