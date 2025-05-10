public class reverseStringRecurse {
    public static void main(String[] args) {
        String rs="mimi";
        String res=revers(rs);
        System.out.println(res);
    
    }
    public static String revers(String rs){
        if(rs.isEmpty()){
            return "";
        }
        return revers(rs.substring(1))+rs.charAt(0);
    }
}
