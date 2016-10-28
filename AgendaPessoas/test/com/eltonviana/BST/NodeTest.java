/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.BST;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Elton Viana
 */
public class NodeTest {

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        Node instance = new Node(10);
        assertEquals(10, instance.getValue());
    }

    /**
     * Test of getLeftChild method, of class Node.
     */
    @Test
    public void testGetLeftChild() {
        Node a = new Node(10);
        Node b = new Node(5);
        a.setLeftChild(b);
        assertEquals(b, a.getLeftChild());
        assertEquals(null, a.getRightChild());
    }

    /**
     * Test of getRightChild method, of class Node.
     */
    @Test
    public void testGetRightChild() {
        Node a = new Node(10);
        Node b = new Node(15);
        a.setRightChild(b);
        assertEquals(null, a.getLeftChild());
        assertEquals(b, a.getRightChild());
    }

    /**
     * Test of setValue method, of class Node.
     */
    @Test
    public void testSetValue() {
        Node instance = new Node(10);
        assertEquals(10, instance.getValue());
        instance.setValue(20);
        assertEquals(20, instance.getValue());
    }

    /**
     * Test of setLeftChild method, of class Node.
     */
    @Test
    public void testSetLeftChild() {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(0);
        a.setLeftChild(b);
        assertEquals(b, a.getLeftChild());
        assertEquals(null, a.getRightChild());
        a.setLeftChild(c);
        assertEquals(c, a.getLeftChild());
        assertEquals(null, a.getRightChild());
    }

    /**
     * Test of setRightChild method, of class Node.
     */
    @Test
    public void testSetRightChild() {
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(20);
        a.setRightChild(b);
        assertEquals(null, a.getLeftChild());
        assertEquals(b, a.getRightChild());
        a.setRightChild(c);
        assertEquals(null, a.getLeftChild());
        assertEquals(c, a.getRightChild());
    }

    /**
     * Test of hasChild method, of class Node.
     */
    @Test
    public void testHasChild() {
        Node instance = new Node(10);
        assertEquals(false, instance.hasChild());
    }

    /**
     * Test of hasOnlyLeftChild method, of class Node.
     */
    @Test
    public void testHasOnlyLeftChild() {
        Node a = new Node(10);
        Node b = new Node(5);
        a.setLeftChild(b);
        assertEquals(true, a.hasOnlyLeftChild());
        assertEquals(false, a.hasOnlyRightChild());
    }

    /**
     * Test of hasOnlyRightChild method, of class Node.
     */
    @Test
    public void testHasOnlyRightChild() {
        Node a = new Node(10);
        Node b = new Node(15);
        a.setRightChild(b);
        assertEquals(false, a.hasOnlyLeftChild());
        assertEquals(true, a.hasOnlyRightChild());
    }

}
