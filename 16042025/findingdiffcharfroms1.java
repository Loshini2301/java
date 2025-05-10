

public class findingdiffcharfroms1 {
   public static void main(String[] args) {
    String s1="hello";
    String s2="he3llo";
    for(int i=0;i<Math.min(s1.length(),s2.length());i++){
        int a= s1.charAt(i);
        int b=s2.charAt(i);
        if((a^b)!=0){
            System.out.println(s2.charAt(i));
            break;
        }
    }

   } 
}
