package javabasic_02.day11.TEST02;

public class Employee {
    private String name;
    private int age;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String dept;

    public void print() {
        System.out.println("이  름 : " + name + "\t나  이 : " + age + "\t학  번 :" + dept);
    }
}
