package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lazy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akash","vikas","Charlie","Bod");
        Stream<String>stream=names.stream().filter(x->{
            System.out.println("data"+x);
            return x.length()>3;
        });

        System.out.println("data is not terminal operation");
        List<String> result =stream.toList();
        System.out.println(result);

    }
}
