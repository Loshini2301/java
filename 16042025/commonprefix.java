public class commonprefix {
    public static void main(String[] args) {
        String[] strpre={"flower","flow","flight"};
        String prefix=strpre[0];
        for(int i=1;i<strpre.length;i++){
        while(strpre[i].indexOf(prefix)!=0){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                i=strpre.length;
                break;
            }
        }
        }
        System.out.println(prefix);
    }
}
