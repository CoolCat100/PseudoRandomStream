import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PseudoRandomStream {
        public static void main(String[] args) {
            int result = 0;
        long startTime = System.currentTimeMillis();
            for (int a = 0; a < 10000000; a++) {
                result = pseudoRandomStream(13)
                        .limit(8)
                        .sum();
            }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
            System.out.println(timeElapsed);
            System.out.println(result);
//            double medium = (double) timeElapsed / 1000;
//            System.out.println(medium);
    }
    public static IntStream pseudoRandomStream(int seed) {
        IntStream numbers = IntStream.iterate(seed, n -> n * n / 10 % 1000);
        return numbers;
    }
//    public static void main(String[] args) {
//        int result = 0;
//        long startTime = System.currentTimeMillis();
//        for (int a = 0; a < 10000000; a++) {
//           result = count();
//        }
//        long endTime = System.currentTimeMillis();
//        long timeElapsed = endTime - startTime;
//        System.out.println(timeElapsed);
//        System.out.println(result);
//
////        double medium = (double) timeElapsed / 10000000;
////        System.out.println(medium);
//    }
//    static int count(){
//        int seed = 13;
//        int sum = seed;
//        for (int i = 0; i < 8; i++) {
//            seed = seed * seed / 10 % 1000;
//            sum += seed;
//        }
//        return sum;
//    }
}
