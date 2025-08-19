package javabasic_03.day17;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);

        UnaryOperator<Integer> square = x -> x * x;
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        Runnable run = () -> System.out.println("hello!!");
    }
}
