package javabasic_03.day15.collection;

public class Node<T> {
    T data;
    Node<T> next = null;
    public Node(T data){
        this.data = data;
    }
}
