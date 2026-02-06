package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediatesOps {

    public static void main(String[] args){
        //Intermediate operations transform a stream into another stream
        //they  are lazy meaning they dont execute until a terminal operation in invoked
 //1-filter -- return stream
        List<String> names = new ArrayList<>();
        names.add("akash");
        names.add("vikas");
        names.add("ajay");
        names.add("akash");
        long c = names.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(c);

        //2.map
        Stream<String> stringStream = names.stream().map(x -> x.toUpperCase());
        //3.stored
        Stream<String> sorted = names.stream().sorted((a, b) -> a.length() - b.length());

        //4.distinct
        long counted = names.stream().filter(x -> x.startsWith("a")).distinct().count();
        System.out.println(counted);

        //5.limit
        long counted1 = Stream.iterate(1, x -> x + 1).limit(100).count();
        System.out.println(counted1);

        //6.skip

        //5.limit
        long counted2 = Stream.iterate(1, x -> x + 1).skip(10).limit(100).count();
        System.out.println(counted2);
    }
}
