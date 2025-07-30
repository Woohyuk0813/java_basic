package day06;

// 참조 타입 변수의 값은 객체의 주소(번지)이므로,
// 참조 타입 변수의 비굔느 주소값을 비교하는 것이다.
public class PrimitiveEqualType {
    public static void main(String[] args) {
        //정수형 배열 arr1, arr2, arr3 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 정수형 배열 arr1, arr2, arr3의 메모리 생성
        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr1.length);
        System.out.println(arr1.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr2[1]);

        arr1[1] = 3;
        System.out.println(arr1[1]);

        // arr3에 차례차례 1,2,3 할당하고, 결과를 확인

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println("==========================");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("==========================");
        //for문을 통해 처리할 수 있다.
        //itar 자동완성
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            System.out.println(i1);
        }
        //itar 자동완성

        for (int i : arr1) {
            System.out.println(i);
        }

        //arr3에 값을 차례로 itar, iter 방식을 통해서 5,6,7 값을 할당하고, 할당한 값을 iter,iter 방식으로 확인
        arr3[0] = 5;
        arr3[1] = 6;
        arr3[2] = 7;
        System.out.println("=================================");
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("=================================");

        int value = 5;
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = value;
            value++;

        }
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);

        }

    }
}

