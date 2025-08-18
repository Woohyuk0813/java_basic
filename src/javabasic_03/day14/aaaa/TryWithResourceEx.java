package javabasic_03.day14.aaaa;

public class TryWithResourceEx {

    public static void main(String[] args) {
        try(MyResource resource = new MyResource("AAA")){
            String data = resource.read1();
            int value = Integer.parseInt(data);
            System.out.println(value);
        }catch(Exception e){
            System.out.println("예외처리 : " + e.getMessage());
        }
        try(MyResource resource = new MyResource("AAA")){
            String data = resource.read2();
            int value = Integer.parseInt(data);
            System.out.println(value);
        }catch(Exception e1){
            System.out.println("예외처리 : " + e1.getMessage());
        }
    }
}
