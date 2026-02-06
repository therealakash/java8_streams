package bascislambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.regex.MatchResult;

public class demo
{


    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            System.out.println("hello world");
        });
        t1.start();
        //predicate -> function interface with boolean return type .test method
        Predicate<Integer> isEven = x->x%2==0;
        System.out.println(isEven.test(1));
        Predicate<String>iswordstartA = x->x.startsWith("a");
        System.out.println(iswordstartA.test("akash"));
        Predicate<String> iswordstartB = x->x.toLowerCase().startsWith("a");


        //Function-->work for up return type some things any Integer or double

        Function<Integer,Integer> add = x->x+1;
        //apply method -abstract
        System.out.println(add.apply(10));
        //and then //default methods
        //compose //deafult method
        //identity static methods

        //Consumer is function return type void does not return any things;
        //accept method- abstract method


        Consumer<Integer> print =x->System.out.println(x);
        print.accept(1);
        // default methods andthen
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printi=x->{
            for(int i:x)
            {
            System.out.println(i);
            }
        };
        printi.accept(list);

    //Supplier not take any thing but give .get() methods abstract
         Supplier<String> givemessage =()->"hello world";
         System.out.println(givemessage.get());

//more then one arguments BiPredicate,BiConsumer,Bifunction
        BiPredicate<Integer,Integer> b = (x,y)->x%2==0;
        System.out.println(b.test(1,2));

        BiFunction<String,String,Integer> biFunction = (x,y)->(x+y).length();
        System.out.println(biFunction.apply("a","bc"));

        BiConsumer<String,String> biConsumer = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept("a","bc");


//UnaryOperatoer  extends Function
        UnaryOperator<String> unaryOperator = (x)->x+1;
        System.out.println(unaryOperator.apply("a"));
//BinaryOperator extends BiFunction
        BinaryOperator<Integer> binaryOperator = (x,y)->x+y;
        System.out.println(binaryOperator.apply(1,2));


//Method references-->use method without invoking & in place of lambda expression
  List<String> list1=Arrays.asList("akash","vikas","ajay");
  list1.forEach(System.out::println);


//Constructor reference

        List<String> names=Arrays.asList("akash","vikas","ajay");
        List<MobilePhone> mobilePhones= names.stream().map(MobilePhone::new).toList();
        System.out.println(mobilePhones);
    }
}

class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}