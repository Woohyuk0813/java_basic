package javabasic_03.day14.ccccc;

import java.util.Stack;

//Stack 구조는 데이터를 제한적으로 접근 할 수 있는 구조이다.(한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조)
//LIFO
//구조 단순, 구현 쉬움.
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int.pop());
        System.out.println(stack_int.pop());
        System.out.println(stack_int.pop());
        /*int data = stack_int.pop();
        stack_int.push(data);*/
    }

}
