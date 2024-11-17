package ru.vsu.cs.shkoda.task7;

import java.util.Iterator;
import java.util.Objects;

public class DoublyLinkedList<T> implements Iterable<T> {
    private NodeDoublyLinkedList<T> tail = null;
    private NodeDoublyLinkedList<T> head = null;
    private int size = 0;

    public void add(T value) {
        NodeDoublyLinkedList<T> newNode = new NodeDoublyLinkedList<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public DoublyLinkedList<T> delete() {
        if (head == null) {
            return null;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
        return this;
    }

    public DoublyLinkedList<T> delete(T value) {
        NodeDoublyLinkedList<T> current = head;
        while (current != null) {
            if (Objects.equals(current.getValue(), value)) {
                if (current == head) {
                    head = current.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                } else if (current == tail) {
                    tail = current.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                size--;
                break;
            }
            current = current.getNext();
        }
        return this;
    }

    public DoublyLinkedList<T> findByValue(T value) {
        NodeDoublyLinkedList<T> current = head;
        while (current != null) {
            if (Objects.equals(current.getValue(), value)) {
                return this;
            }
            current = current.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public NodeDoublyLinkedList<T> getHead() {
        return head;
    }

    public NodeDoublyLinkedList<T> getTail() {
        return tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator<>(head);
    }


}
