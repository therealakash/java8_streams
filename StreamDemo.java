package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args){
        //stream is used to process the collections
        //
         //creating stream
        //1. from collections
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream =list.stream();

        //2. from Arrays
        String[] array ={"a","b","c","d"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3 using Stream.of()
       Stream<String> stream2 = Stream.of("a","b","c","d");
       //4 Infinite streams
        Stream<Integer> generate = Stream.generate(()-> 1);//supplier
     List<Integer>ls=Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
        System.out.println(ls);

    }
}
