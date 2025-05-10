public class GCDrecursion {
    public static void main(String[] args) {
        int n1=48;
        int n2=18;
        int res=gcd(n1,n2);
        System.out.println(res);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
