package edu.lesson11.task2.collections.linkedlist;

@SuppressWarnings("unused")
public class Node<T> {

    T element;

    Node<T> nextNode;
    Node<T> prevNode;

    public Node(T element, Node<T> nextNode, Node<T> prevNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }
}
