package javabasic_03.day19.FilterEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {

        //1. 이름 중 "A"로 시작하는 이름을 수집하여 출력하세요.
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");
        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());

        for (String name : filteredNames) {
            System.out.println(name);
        }
        // 위, 아래 동일
        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(name -> System.out.println(name));


        //2. 각 이름의 길이를 세어서 출력하시오. 결과 : [5, 4, 7]
        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");
       names2.stream()
                .mapToInt(String::length).forEach(name -> System.out.println(name));

    }
}