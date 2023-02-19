package com.loveable.linkedList;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class Linked_ListTest {

    /**
     * Method under test: {@link Linked_List#addFirst(Object)}
     */
    @Test
    void testAddFirst() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();

        // Act
        linked_List.addFirst("Element");

        // Assert
        Object first = linked_List.getFirst();
        assertEquals("Element", first);
        assertEquals(1, linked_List.size());
        assertFalse(linked_List.isEmpty());
        assertSame(first, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#addFirst(Object)}
     */
    @Test
    void testAddFirst2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.addFirst("Element");

        // Assert
        assertEquals("Element", linked_List.getFirst());
        assertEquals(2, linked_List.size());
        assertFalse(linked_List.isEmpty());
    }

    /**
     * Method under test: {@link Linked_List#addLast(Object)}
     */
    @Test
    void testAddLast() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();

        // Act
        linked_List.addLast("Element");

        // Assert
        Object first = linked_List.getFirst();
        assertEquals("Element", first);
        assertEquals(1, linked_List.size());
        assertFalse(linked_List.isEmpty());
        assertSame(first, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#addLast(Object)}
     */
    @Test
    void testAddLast2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.addLast("Element");

        // Assert
        assertEquals(2, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#add(int, Object)}
     */
    @Test
    void testAdd2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.add(1, "Element");

        // Assert
        assertEquals(2, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#add(int, Object)}
     */
    @Test
    void testAdd3() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.add(1, "Element");

        // Assert
        assertEquals(3, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#add(int, Object)}
     */
    @Test
    void testAdd4() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();

        // Act
        linked_List.add(0, "Element");

        // Assert
        Object first = linked_List.getFirst();
        assertEquals("Element", first);
        assertEquals(1, linked_List.size());
        assertFalse(linked_List.isEmpty());
        assertSame(first, linked_List.getLast());
    }


    /**
     * Method under test: {@link Linked_List#add(int, Object)}
     */
    @Test
    void testAdd6() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.add(0, "Element");

        // Assert
        assertEquals("Element", linked_List.getFirst());
        assertEquals(2, linked_List.size());
        assertFalse(linked_List.isEmpty());
    }

    /**
     * Method under test: {@link Linked_List.Node#Node(Object)}
     */
    @Test
    void testNodeConstructor() {
        // Arrange and Act
        Linked_List.Node<Object> actualNode = new Linked_List.Node<>("Data");

        // Assert
        assertEquals("Data", actualNode.data);
        assertNull(actualNode.next);
    }

    /**
     * Method under test: {@link Linked_List#removeFirst()}
     */
    @Test
    void testRemoveFirst() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).removeFirst());
    }

    /**
     * Method under test: {@link Linked_List#removeFirst()}
     */
    @Test
    void testRemoveFirst2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.removeFirst();

        // Assert
        assertTrue(linked_List.isEmpty());
        assertEquals(0, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#removeLast()}
     */
    @Test
    void testRemoveLast() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).removeLast());
    }

    /**
     * Method under test: {@link Linked_List#removeLast()}
     */
    @Test
    void testRemoveLast2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.removeLast();

        // Assert
        assertTrue(linked_List.isEmpty());
        assertEquals(0, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#removeLast()}
     */
    @Test
    void testRemoveLast3() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.removeLast();

        // Assert
        assertEquals(1, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#removeLast()}
     */
    @Test
    void testRemoveLast4() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.removeLast();

        // Assert
        assertEquals(2, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).remove(1));
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(1);

        // Assert
        assertTrue(linked_List.isEmpty());
        assertEquals(0, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove3() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(1);

        // Assert
        assertEquals(1, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove4() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(0);

        // Assert
        assertTrue(linked_List.isEmpty());
        assertEquals(0, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove6() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(2);

        // Assert
        assertEquals(1, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove7() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(2);

        // Assert
        assertEquals(2, linked_List.size());
    }

    /**
     * Method under test: {@link Linked_List#remove(int)}
     */
    @Test
    void testRemove8() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act
        linked_List.remove(3);

        // Assert
        assertEquals(2, linked_List.size());
        Object expectedLast = linked_List.getFirst();
        assertSame(expectedLast, linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#getFirst()}
     */
    @Test
    void testGetFirst() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).getFirst());
    }

    /**
     * Method under test: {@link Linked_List#getFirst()}
     */
    @Test
    void testGetFirst2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("Element", linked_List.getFirst());
    }

    /**
     * Method under test: {@link Linked_List#getLast()}
     */
    @Test
    void testGetLast() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).getLast());
    }

    /**
     * Method under test: {@link Linked_List#getLast()}
     */
    @Test
    void testGetLast2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("Element", linked_List.getLast());
    }

    /**
     * Method under test: {@link Linked_List#get(int)}
     */
    @Test
    void testGet2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("Element", linked_List.get(1));
    }

    /**
     * Method under test: {@link Linked_List#get(int)}
     */
    @Test
    void testGet3() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("Element", linked_List.get(1));
    }

    /**
     * Method under test: {@link Linked_List#get(int)}
     */
    @Test
    void testGet4() {
        // Arrange, Act and Assert
        assertThrows(NoSuchElementException.class, () -> (new Linked_List<>()).get(0));
    }

    /**
     * Method under test: {@link Linked_List#get(int)}
     */
    @Test
    void testGet6() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("Element", linked_List.get(0));
    }

    /**
     * Method under test: {@link Linked_List#contains(Object)}
     */
    @Test
    void testContains() {
        // Arrange, Act and Assert
        assertFalse((new Linked_List<>()).contains("Element"));
    }

    /**
     * Method under test: {@link Linked_List#contains(Object)}
     */
    @Test
    void testContains2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertTrue(linked_List.contains("Element"));
    }

    /**
     * Method under test: {@link Linked_List#contains(Object)}
     */
    @Test
    void testContains3() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst(2);

        // Act and Assert
        assertFalse(linked_List.contains("Element"));
    }

    /**
     * Method under test: {@link Linked_List#isEmpty()}
     */
    @Test
    void testIsEmpty() {
        // Arrange, Act and Assert
        assertTrue((new Linked_List<>()).isEmpty());
    }

    /**
     * Method under test: {@link Linked_List#isEmpty()}
     */
    @Test
    void testIsEmpty2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertFalse(linked_List.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Linked_List}
     *   <li>{@link Linked_List#size()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange, Act and Assert
        assertEquals(0, (new Linked_List<>()).size());
    }

    @Test
    void testToString() {
        assertEquals("[]", (new Linked_List<>()).toString());
    }

    /**
     * Method under test: {@link Linked_List#toString()}
     */
    @Test
    void testToString2() {
        // Arrange
        Linked_List<Object> linked_List = new Linked_List<>();
        linked_List.addFirst("Element");

        // Act and Assert
        assertEquals("[Element]", linked_List.toString());
    }
}