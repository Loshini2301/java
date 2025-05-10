public class stringbuilderbuffer {
    public static void main(String[] args) {
        //for string builder
        long startb=System.nanoTime();
        StringBuilder builder=new StringBuilder("number is 1 to 10 is ");
        for(int i=1;i<10;i++){
            builder.append(" "+i);
        }
        System.out.println(builder);
        long endb=System.nanoTime();
        System.out.println("Builder time "+(endb-startb));
        // for stringbuffer
        long start=System.nanoTime();
        StringBuffer strnum=new StringBuffer("number is 1 to 10 is ");
        for(int i=1;i<10;i++){
            strnum.append(" "+i);
        }
        System.out.println(builder);
        long end=System.nanoTime();
        System.out.println("Builder time "+(end-start));

    }
}
