package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static <T> List<T> filterApple(List<T> inventory, ApplePredicate<T> applePredicate) {
        List<T> apples = new ArrayList<>();
        for (T apple: inventory) {
            if (applePredicate.test(apple))
                apples.add(apple);
        }

        return apples;
    }

    public static <T> void forEach(List<T> ts, Consumer<T> consumer){
        for (T t: ts) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
//        List<Apple> apples = Arrays.asList(new Apple(80,"red"),
//                new Apple(90,"greeen"),
//                new Apple(100,"blue"));
//
//        List<Apple> result =filterApple(apples, (Apple apple) -> "red".equals(apple.getColor()));
//        System.out.println(result);


        forEach(Arrays.asList(1,2,3,5), (Integer i)-> System.out.println(i));




    }


}
































