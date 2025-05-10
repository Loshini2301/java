public class encapsulation {
    public static void main(String[] args) {
      Student stu=new Student("loshh",2302,"6379520993");
      stu.setname("anbuu");
      System.out.println(stu.getname());

    }
}
class Student{
    Student(String name,int regno,String phno){

    }
    private String name;
    private int regno;
    private String phno;

    public String getname(){
           return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getregno(){
        return regno;
    }
    public void setregno(int regno){
        this.regno=regno;
    }
    public String getphno(){
        return phno;
    }
    public void setphno(String phno){
        this.phno=phno;
    }
}

