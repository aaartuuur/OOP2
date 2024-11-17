package ru.vsu.cs.shkoda.task7;

import java.util.Iterator;

public class DoublyLinkedListIterator<T> implements Iterator<T> {
    private NodeDoublyLinkedList<T> current;

    public DoublyLinkedListIterator(NodeDoublyLinkedList<T> head) {
        this.current = head;
    }


    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        T value = current.getValue();
        current = current.getNext();
        return value;
    }
}