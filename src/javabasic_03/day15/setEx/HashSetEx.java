package javabasic_03.day15.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();


        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("JSP");
        set.add("Spring");

        int size = set.size();
        System.out.println(size);
    }

}
