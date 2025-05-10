public class sumofEleInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int a=array(arr,arr.length);
        System.out.println(a);

        
    }
    public static int array(int[] arr,int n){
        if(n<=0){
            return 0;
        }
        return arr[n-1]+array(arr,n-1);
    }
}
