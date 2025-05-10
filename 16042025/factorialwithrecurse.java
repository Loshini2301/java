public class factorialwithrecurse {
    public static void main(String[] args) {
       
        int n=5;
        System.out.println(factorial(n));
        
    }
    public static int factorial(int n){
        int fact=1;
        if(n<1){
            return fact; 
        }
        fact=n*factorial(n-1); 
        return fact;
    }
}
