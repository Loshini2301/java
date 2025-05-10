import java.util.*;
public class bitwisecomplimentno {
   public static void main(String[] args) {
       int ip=new Scanner(System.in).nextInt();
       String bin=Integer.toBinaryString(ip);
       System.out.println("entered number= "+ip);
       System.out.println("binary form of number= "+bin);
       String comp="";
       for(int i=0;i<bin.length();i++){
        char ch=bin.charAt(i);
        if(ch=='0'){
            comp+="1";
        }
        else{
            comp+="0";
        }

       }
       System.out.println("compliment of number in binary= "+comp);
       int compnum=Integer.parseInt(comp,2);
       
       System.out.println("compliment of number in decimal= "+compnum);
       String comp2=twocomp(comp);
       System.out.println("2's compliment of the number= "+comp2);
       int compnumtwo=Integer.parseInt(comp2,2);
       System.out.println("2's compliment in decimal= "+compnumtwo);


   } 
   public static String twocomp(String comp){
    char[] comparr=comp.toCharArray();
    int n=comparr.length;
    for(int i=n-1;i>0;i--){
        if(comparr[i]=='0'){
            comparr[i]='1';
            return new String(comparr);
        }
        else{
            comparr[i]='0';
        }
   }
   return "1"+new String(comparr);
}
}
