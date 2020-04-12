import java.util.stream.IntStream;

public class Test03 {

    public static void main(String[] args) {

        long count = IntStream.rangeClosed(1,100).filter(a -> a <= 100 ).sum();
        System.out.println(count);


        int sum = 0;
        for (int i =0; i<= 100; i++){
            sum += i;
        }
        System.out.println(sum);

    }



}

