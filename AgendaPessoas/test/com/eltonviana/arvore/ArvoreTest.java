/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.arvore;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author elton
 */
public class ArvoreTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Test of isEmpty method, of class Arvore.
     */
    @Test
    public void testIsEmpty() {
        Arvore instance = new Arvore();
        assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of getHeight method, of class Arvore.
     */
    @Test
    public void testGetHeightEmptyTree() {
        Arvore instance = new Arvore();
        assertEquals(-1, instance.getHeight());
    }

    /**
     * Test of getDepth method, of class Arvore.
     */
    @Test
    public void testGetDepth() {
        Arvore instance = new Arvore();
        Node a = instance.insert(4);
        Node b = instance.insert(2);
        Node c = instance.insert(1);
        Node d = instance.insert(3);
        Node e = instance.insert(6);
        Node f = instance.insert(5);
        Node g = instance.insert(7);

        Node outOfTree = new Node(50);

        assertEquals(-1, instance.getDepth(null));
        assertEquals(-1, instance.getDepth(outOfTree));
        assertEquals(0, instance.getDepth(a));
        assertEquals(1, instance.getDepth(b));
        assertEquals(2, instance.getDepth(c));
        assertEquals(2, instance.getDepth(d));
        assertEquals(1, instance.getDepth(e));
        assertEquals(2, instance.getDepth(f));
        assertEquals(2, instance.getDepth(g));
    }

    /**
     * Test of getSmallestElement method, of class Arvore.
     */
    @Test
    public void testGetSmallestElementEmptyTree() {
        Arvore instance = new Arvore();
        Node expResult = null;
        Node result = instance.getSmallestElement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSmallestElement method, of class Arvore.
     */
    @Test
    public void testGetSmallestElementSomeElementsTree() {
        Arvore instance = new Arvore();
        for (Integer i = 0; i < 10; i++) {
            instance.insert(i);
        }
        assertEquals(0, instance.getSmallestElement().getValue());
    }

    /**
     * Test of getBiggestElement method, of class Arvore.
     */
    @Test
    public void testGetBiggestElementEmptyTree() {
        Arvore instance = new Arvore();
        for (Integer i = 0; i < 10; i++) {
            instance.insert(i);
        }
        assertEquals(9, instance.getBiggestElement().getValue());
    }

    /**
     * Test of insert method, of class Arvore.
     */
    @Test
    public void testInsertRoot() {
        Arvore instance = new Arvore();
        instance.insert(10);
        assertEquals(false, instance.isEmpty());
        assertEquals(0, instance.getHeight());
        assertEquals(10, instance.getSmallestElement().getValue());
        assertEquals(10, instance.getBiggestElement().getValue());
    }

    /**
     * Test of insert method, of class Arvore.
     */
    @Test
    public void testInsertTwoElements() {
        Arvore instance = new Arvore();
        instance.insert(10);
        instance.insert(5);
        assertEquals(false, instance.isEmpty());
        assertEquals(1, instance.getHeight());
        assertEquals(5, instance.getSmallestElement().getValue());
        assertEquals(10, instance.getBiggestElement().getValue());
    }

    /**
     * Test of insert method, of class Arvore.
     */
    @Test
    public void testInsertThreeElements() {
        Arvore instance = new Arvore();
        instance.insert(10);
        instance.insert(5);
        instance.insert(15);
        assertEquals(false, instance.isEmpty());
        assertEquals(1, instance.getHeight());
        assertEquals(5, instance.getSmallestElement().getValue());
        assertEquals(15, instance.getBiggestElement().getValue());
    }

    /**
     * Test of search method, of class Arvore.
     */
    @Test
    public void testSearchEmptyTree() {
        Arvore instance = new Arvore();
        assertEquals(null, instance.search(10));
    }

    /**
     * Test of search method, of class Arvore.
     */
    @Test
    public void testSearchRoot() {
        Arvore instance = new Arvore();
        Node a = instance.insert(10);
        assertEquals(a, instance.search(10));
    }

    /**
     * Test of search method, of class Arvore.
     */
    @Test
    public void testSearchManyElements() {
        Arvore instance = new Arvore();
        Node a = instance.insert(10);
        Node b = instance.insert(5);
        Node c = instance.insert(15);
        Node d = instance.insert(0);
        Node e = instance.insert(20);
        assertEquals(a, instance.search(10));
        assertEquals(b, instance.search(5));
        assertEquals(c, instance.search(15));
        assertEquals(d, instance.search(0));
        assertEquals(e, instance.search(20));
        assertEquals(null, instance.search(50));
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveEmptyTree() {
        Arvore instance = new Arvore();
        assertEquals(false, instance.remove(10));
        assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveSingleElementTree() {
        Arvore instance = new Arvore();
        instance.insert(10);
        assertEquals(false, instance.remove(20));
        assertEquals(false, instance.isEmpty());
        assertEquals(true, instance.remove(10));
        assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveRoots() {
        Arvore instance = new Arvore();
        Node a = instance.insert(10);
        Node b = instance.insert(5);
        Node c = instance.insert(15);
        assertEquals(true, instance.remove(10));
        assertEquals(b, instance.search(5));
        assertEquals(null, instance.search(10));
        assertEquals(c, instance.search(15));

        assertEquals(true, instance.remove(5));
        assertEquals(null, instance.search(5));
        assertEquals(c, instance.search(15));

        assertEquals(true, instance.remove(15));
        assertEquals(null, instance.search(15));
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveOneElement() {
        Arvore instance = new Arvore();
        Node a = instance.insert(10);
        Node b = instance.insert(5);
        Node c = instance.insert(15);
        assertEquals(true, instance.remove(5));
        assertEquals(null, instance.search(5));
        assertEquals(a, instance.search(10));
        assertEquals(c, instance.search(15));
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveLeafElements() {
        Arvore instance = new Arvore();
        Node a = instance.insert(4);
        Node b = instance.insert(2);
        Node c = instance.insert(1);
        Node d = instance.insert(3);
        Node e = instance.insert(6);
        Node f = instance.insert(5);
        Node g = instance.insert(7);
        assertEquals(true, instance.remove(1));
        assertEquals(true, instance.remove(7));
        assertEquals(null, instance.search(1));
        assertEquals(b, instance.search(2));
        assertEquals(d, instance.search(3));
        assertEquals(a, instance.search(4));
        assertEquals(f, instance.search(5));
        assertEquals(e, instance.search(6));
        assertEquals(null, instance.search(7));
    }

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testRemoveManyElements() {
        Arvore instance = new Arvore();
        ArrayList<Node> nodes = new ArrayList();

        for (Integer i = 0; i < 10; i++) {
            nodes.add(instance.insert(i));
        }

        for (Integer i = 0; i < 10; i++) {
            assertEquals(true, instance.remove(i));
            assertEquals(null, instance.search(i));
            for (Integer j = i + 1; j < 10; j++) {
                assertEquals(nodes.get(j), instance.search(j));
            }
        }

        assertEquals(true, instance.isEmpty());
    }

    @Test
    public void testPrintInOrder() {
        Arvore instance = new Arvore();
        Node a = instance.insert(4);
        Node b = instance.insert(2);
        Node c = instance.insert(1);
        Node d = instance.insert(3);
        Node e = instance.insert(6);
        Node f = instance.insert(5);
        Node g = instance.insert(7);

        instance.printInOrder();
        assertEquals("[ 1 2 3 4 5 6 7 ]\n", outContent.toString());
    }

    @Test
    public void testPrintPreOrder() {
        Arvore instance = new Arvore();
        Node a = instance.insert(4);
        Node b = instance.insert(2);
        Node c = instance.insert(1);
        Node d = instance.insert(3);
        Node e = instance.insert(6);
        Node f = instance.insert(5);
        Node g = instance.insert(7);

        instance.printPreOrder();
        assertEquals("[ 4 2 1 3 6 5 7 ]\n", outContent.toString());
    }

    @Test
    public void testPrintPostOrder() {
        Arvore instance = new Arvore();
        Node a = instance.insert(4);
        Node b = instance.insert(2);
        Node c = instance.insert(1);
        Node d = instance.insert(3);
        Node e = instance.insert(6);
        Node f = instance.insert(5);
        Node g = instance.insert(7);

        instance.printPostOrder();
        assertEquals("[ 1 3 2 5 7 6 4 ]\n", outContent.toString());
    }

}
