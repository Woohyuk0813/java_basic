package javabasic_03.day19.sortedEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> list2 = Arrays.asList("A", "B", "C");

        //1. 정수리스트에서 짝수를 필터링하는 자바스트림 연산을 작성하세요.
        List<Integer> numbers = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        numbers.forEach(System.out::println);

        //2. 리스트의 각 정수를 제곱하기 위해 map연산을 사용하여 연산결과를 출력하세요.
        List<Integer> square = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(square);

        //3. 문자열 리스트에서 중복요소를 제거하기 위해서 distinct연산을 사용하여 결과를 출력
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //4. 스트림을 사용하여 정수 리스트를 오름차순하여 출력하세요.
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        //5. 정수리스트에서 리스트의 모든 짝수의 합을 구하여 출력하세요.


    }
}
