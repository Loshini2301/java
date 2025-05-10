import java.util.*;
public class validparentehesis {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        List<String> result=new ArrayList<>();
        generate(result,"",0,0,n);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public static void generate(List<String> result,String cu,int o,int c,int n){
        if(cu.length()==2*n){
            result.add(cu);
            return ;
        }
        if(o<n){
            generate(result,cu+'(',o+1,c,n);
                }
        if(c<o){
            generate(result,cu+')',o,c+1,n);
        }
    }
}
