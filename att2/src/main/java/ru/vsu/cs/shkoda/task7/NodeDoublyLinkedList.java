package ru.vsu.cs.shkoda.task7;

import java.util.Objects;

public class NodeDoublyLinkedList<T> {
    private NodeDoublyLinkedList<T> prev;
    private NodeDoublyLinkedList<T> next;
    private T value;
    public NodeDoublyLinkedList(T value) {
        this.value = value;
    }

    public NodeDoublyLinkedList<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeDoublyLinkedList<T> prev) {
        this.prev = prev;
    }

    public NodeDoublyLinkedList<T> getNext() {
        return next;
    }

    public void setNext(NodeDoublyLinkedList<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeDoublyLinkedList<T> that = (NodeDoublyLinkedList<T>) o;
        return Objects.equals(value, that.value);
    }


}
