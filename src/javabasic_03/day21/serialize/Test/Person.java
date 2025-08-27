package javabasic_03.day21.serialize.Test;

import lombok.Getter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
@ToString
@Getter
class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private transient int age; // transient: 직렬화 제외

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
