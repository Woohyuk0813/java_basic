package javabasic_02.day09.aa;

public class Student {
    public static void main(String[] args) {

    }

    // 학생은 이름, 나이, 주소, 학번을 가지고 있다.
    // 학생의 정보(학번,이름,나이,주소를 출력하는 기능)을 제공한다.
    //Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    public String gender;
    private String[] subject = {"국어","영어","수학"};

    // 생성자 통하여 학생의 객체의 필드를 초기화
    Student(){ }
    Student(String stu_name, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }// 기본 생성자


    Student(String stu_name, Integer stu_age, String address, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }


    public String[] getSubject() {
        return subject;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    // Object 클래스의 toString()
    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
    }
}
