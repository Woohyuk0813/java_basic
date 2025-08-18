package javabasic_02.day10;

public class Amain {
    public static void main(String[] args) {
        String account ="kang";
        A aa = new A();

        if(account.equals("kang")){
        System.out.println(aa.getId());   //  간접접근
        System.out.println(aa.getPwd());}
        else {
            System.out.println("접근 불가");
        }

//        aa.id = "kangwoohyuk";
//        aa.pwd= "1234";
          aa.setId("kwh");
          aa.setPwd("12345");
        System.out.println(aa.getId());   //  간접접근
        System.out.println(aa.getPwd());

    }

}
