public class recursion {
    public static void main(String[] args) {
        for(int i=101;i<200;i++){
            System.out.println(i);
        }
        recurse(1);
        
    }
    public static void recurse(int no){
        if(no==100){
            return;
        }
        System.out.println(no);
        recurse(no+1);


    }
}
