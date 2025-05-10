import java.util.Scanner;
public class Switch{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n1=ip.nextInt();
        int n2=ip.nextInt();
        boolean flag=true;
        while(flag){
            int choice=ip.nextInt();
            switch(choice){
                case 1:System.out.println("performing addition");
                       System.out.println(add(n1,n2));
                       break;
                case 2:System.out.println("performing subtraction");
                       System.out.println(sub(n1,n2));
                       break;
                case 3:System.out.println("performing multiplication");
                       System.out.println(mul(n1,n2));
                       break;
                case 4:System.out.println("performing division");
                       System.out.println(div(n1,n2));
                       break;
                case 5:System.out.println("exiting");
                       flag =false;
                       break;
                default:System.out.println("enter crt no");

            }

        }

    }
    public static void choicelist(){
        System.out.println("1-add");
        System.out.println("1-add");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.println("5-exit");
    }
    public static int add(int n1,int n2){
        return n1+n2;

    }
    public static int sub(int n1,int n2){
        return n1-n2;

    }
    public static int mul(int n1,int n2){
        return n1*n2;

    }
    public static int div(int n1,int n2){
        return n1/n2;

    }
}
