package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TermainalOps {
   public static void main(String[] args){
       List<Integer> ls = Arrays.asList(1,2,3,4);
       //1.collect

       List<Integer> collect = ls.stream().collect(Collectors.toList());
       ls.stream().toList();

       //2.ForEach
       ls.stream().forEach(x-> System.out.println(x)); // take comsumer

       //3.reduce: Combines elements to produce a single result
           Optional<Integer> optionalInteger =ls.stream().reduce((x, y)->x+y);
       System.out.println(optionalInteger.get());

   //4.count
//--> short-circuit methods
   //5.anymatch ,all match,none match
    boolean b = ls.stream().anyMatch(x->x%2==0);
       System.out.println(b);
    boolean b1 = ls.stream().allMatch(x->x>0);
    System.out.println(b1);
    boolean b2 = ls.stream().noneMatch(x->x<0);
       System.out.println(b2);

     //6.findFirst,findAny
       System.out.println(ls.stream().findFirst().get());


//--->
       //Examples Squaring and Sorting Numbers
        List<Integer> num =Arrays.asList(5,2,9,1,6);
       System.out.println(num.stream().map(x->x*x).sorted().toList());
       //Examples Filtering and Collecting Names
       List<String> names = Arrays.asList("akash","bob","vikas");
       System.out.println(names.stream().filter(x->x.length()>3).toList());

       //Example sum of integer
       List<Integer> nu = Arrays.asList(1,2,3,4);
       System.out.println(nu.stream().reduce((x,y)->x+y));

       //Explain count Occurrences of a character
           String sen ="i am back to track";
       System.out.println(sen.chars().filter(x->x=='a').count());

      // -->//stateful and stateless operations
       // stateful opreaters means where is knows every elements like explain
       //sorted ,distinct
       //stateless means does not know about others
       //map,












   }

}
