/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.arvore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elton
 */
public class ArvoreTest {

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

}
