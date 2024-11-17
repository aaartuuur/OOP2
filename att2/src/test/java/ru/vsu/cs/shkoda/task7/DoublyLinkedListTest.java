package ru.vsu.cs.shkoda.task7;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
public class DoublyLinkedListTest {
    private DoublyLinkedList<String> stringList;
    private DoublyLinkedList<Integer> intList;

    @BeforeEach
    void setUp() {
        stringList = new DoublyLinkedList<>();
        intList = new DoublyLinkedList<>();
    }

    @Test
    void testAddString() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        assertEquals(3, stringList.size());
        assertEquals("First", stringList.getHead().getValue());
        assertEquals("Third", stringList.getTail().getValue());
    }

    @Test
    void testAddInteger() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        assertEquals(3, intList.size());
        assertEquals(1, intList.getHead().getValue());
        assertEquals(3, intList.getTail().getValue());
    }

    @Test
    void testDeleteString() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        stringList.delete();
        assertEquals(2, stringList.size());
        assertEquals("Second", stringList.getTail().getValue());

        stringList.delete();
        assertEquals(1, stringList.size());
        assertEquals("First", stringList.getTail().getValue());

        stringList.delete();
        assertEquals(0, stringList.size());
        assertNull(stringList.getHead());
        assertNull(stringList.getTail());
    }

    @Test
    void testDeleteInteger() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        intList.delete();
        assertEquals(2, intList.size());
        assertEquals(2, intList.getTail().getValue());

        intList.delete();
        assertEquals(1, intList.size());
        assertEquals(1, intList.getTail().getValue());

        intList.delete();
        assertEquals(0, intList.size());
        assertNull(intList.getHead());
        assertNull(intList.getTail());
    }

    @Test
    void testDeleteByValueString() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        stringList.delete("Second");
        assertEquals(2, stringList.size());
        assertEquals("First", stringList.getHead().getValue());
        assertEquals("Third", stringList.getTail().getValue());

        stringList.delete("First");
        assertEquals(1, stringList.size());
        assertEquals("Third", stringList.getHead().getValue());
        assertEquals("Third", stringList.getTail().getValue());

        stringList.delete("Third");
        assertEquals(0, stringList.size());
        assertNull(stringList.getHead());
        assertNull(stringList.getTail());
    }

    @Test
    void testDeleteByValueInteger() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        intList.delete(2);
        assertEquals(2, intList.size());
        assertEquals(1, intList.getHead().getValue());
        assertEquals(3, intList.getTail().getValue());

        intList.delete(1);
        assertEquals(1, intList.size());
        assertEquals(3, intList.getHead().getValue());
        assertEquals(3, intList.getTail().getValue());

        intList.delete(3);
        assertEquals(0, intList.size());
        assertNull(intList.getHead());
        assertNull(intList.getTail());
    }

    @Test
    void testFindByValueString() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        assertNotNull(stringList.findByValue("Second"));
        assertNull(stringList.findByValue("Fourth"));
    }

    @Test
    void testFindByValueInteger() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        assertNotNull(intList.findByValue(2));
        assertNull(intList.findByValue(4));
    }

    @Test
    void testIteratorString() {
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        Iterator<String> iterator = stringList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("First", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Second", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorInteger() {
        intList.add(1);
        intList.add(2);
        intList.add(3);

        Iterator<Integer> iterator = intList.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
