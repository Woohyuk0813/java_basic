package javabasic_03.day19.optional;

import java.util.Optional;

public class OptionalEx02 {
    public static void main(String[] args) {

        String str = "Hello Optionl!";//str null 값이 아닌 문자열을 할당
        Optional<String> optStr = Optional.of(str);
        System.out.println(optStr); //of(): 값이 null이 아닌 경우에만 Optional 객체 생성

        String nullStr = null;
        Optional<String> optNullStr = Optional.ofNullable(nullStr);
        System.out.println(optNullStr);

        Optional<String> emptyOptional = Optional.empty(); // 값을 갖지 않는 빈 Optional 객체
        System.out.println(emptyOptional);
    }
}
