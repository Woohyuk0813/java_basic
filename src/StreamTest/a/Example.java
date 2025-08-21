package StreamTest.a;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lamda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(a -> a.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
