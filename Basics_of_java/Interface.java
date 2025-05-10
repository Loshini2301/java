public class Interface {
    public static void main(String[] args) {
        hybridcar hybrid=new hybridcar();
        hybrid.electricstation();
        hybrid.petrolstation();
    }
}
interface Electriccar{
    public void electricstation();
}
interface petrolcar{
    public void petrolstation();
}
class hybridcar implements Electriccar,petrolcar{
     @Override
     public void electricstation(){
           System.out.println("electric station is located here");
     }
     @Override
     public void petrolstation(){
           System.out.println("petrolstation is located here");
     }
}
