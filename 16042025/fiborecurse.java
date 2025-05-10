public class fiborecurse {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println(fibbo(i));
        }       
    }
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);        
    }
}
