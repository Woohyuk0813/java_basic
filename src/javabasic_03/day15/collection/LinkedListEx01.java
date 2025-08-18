package javabasic_03.day15.collection;

public class LinkedListEx01 {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        node1.next = node2; //노드 인스턴스 간 연결
        Node<Integer> head = node1;
    }
}
