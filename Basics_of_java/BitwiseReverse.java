public class BitwiseReverse {
    public static void main(String[] args) {
        // bitReverse();
        // complement();

        int input = 15;
        int mask = 1;
        int counter = 0;

        for (int i = 0; i < 32; i++) {
            if((input & mask) !=0) {
                counter++;
            }
            mask = mask << 1;
        }
        
        System.out.println("Number of 0's is : "+counter);

    }

    private static void complement() {
        int input = 10;
        
        int compliment = ~input;
        
        int mask = 0;
        while(mask < input) {
            mask = (mask<<1) | 1;
        }
        compliment = compliment & mask;
        System.out.println(compliment);
    }

    private static void bitReverse() {
        int num = 10;
        int output = 0;

        for (int i = 0; i < 32; i++) {
            int last = num & 1;

            if(output != 0) {
                output = output << 1;
            }

            if(last == 1) {
                output = output | 1;
            }

            num = num >> 1;
        }

        System.out.println(output);
    }
}
