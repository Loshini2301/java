
import java.util.HashSet;

public class largestcommonprefix{
    public static void main(String args[]){
        String a="abcabcabc";
        HashSet<Character> set=new HashSet<>();
        int maxlen=0,start=0,end=0;
        for(end=0;end<a.length();end++){
            while(set.contains(a.charAt(end))){
                set.remove(a.charAt(start));

                start++;
            }
            set.add(a.charAt(end));
            maxlen=Math.max(maxlen,(end-start)+1);
        }
        System.out.println(maxlen);
    }
}
