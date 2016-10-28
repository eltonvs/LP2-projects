/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.arvore;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author elton
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.eltonviana.arvore.ArvoreTest.class, com.eltonviana.arvore.NodeTest.class})
public class ArvoreSuite {

    /**
     * Test of remove method, of class Arvore.
     */
    @Test
    public void testChildsFromNodesOnRemove() {
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

        // Root
        assertEquals(true, instance.search(4).hasChild());
        assertEquals(false, instance.search(4).hasOnlyRightChild());
        assertEquals(false, instance.search(4).hasOnlyLeftChild());
        // 1st childs
        assertEquals(true, instance.search(2).hasChild());
        assertEquals(false, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        assertEquals(true, instance.search(6).hasChild());
        assertEquals(false, instance.search(6).hasOnlyRightChild());
        assertEquals(false, instance.search(6).hasOnlyLeftChild());
        // 2nd childs
        assertEquals(false, instance.search(1).hasChild());
        assertEquals(false, instance.search(1).hasOnlyRightChild());
        assertEquals(false, instance.search(1).hasOnlyLeftChild());
        assertEquals(false, instance.search(3).hasChild());
        assertEquals(false, instance.search(3).hasOnlyRightChild());
        assertEquals(false, instance.search(3).hasOnlyLeftChild());
        assertEquals(false, instance.search(5).hasChild());
        assertEquals(false, instance.search(5).hasOnlyRightChild());
        assertEquals(false, instance.search(5).hasOnlyLeftChild());
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(1));
        // Root
        assertEquals(true, instance.search(4).hasChild());
        assertEquals(false, instance.search(4).hasOnlyRightChild());
        assertEquals(false, instance.search(4).hasOnlyLeftChild());
        // 1st childs
        assertEquals(true, instance.search(2).hasChild());
        assertEquals(true, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        assertEquals(true, instance.search(6).hasChild());
        assertEquals(false, instance.search(6).hasOnlyRightChild());
        assertEquals(false, instance.search(6).hasOnlyLeftChild());
        // 2nd childs
        assertEquals(false, instance.search(3).hasChild());
        assertEquals(false, instance.search(3).hasOnlyRightChild());
        assertEquals(false, instance.search(3).hasOnlyLeftChild());
        assertEquals(false, instance.search(5).hasChild());
        assertEquals(false, instance.search(5).hasOnlyRightChild());
        assertEquals(false, instance.search(5).hasOnlyLeftChild());
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(3));
        // Root
        assertEquals(true, instance.search(4).hasChild());
        assertEquals(false, instance.search(4).hasOnlyRightChild());
        assertEquals(false, instance.search(4).hasOnlyLeftChild());
        // 1st childs
        assertEquals(false, instance.search(2).hasChild());
        assertEquals(false, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        assertEquals(true, instance.search(6).hasChild());
        assertEquals(false, instance.search(6).hasOnlyRightChild());
        assertEquals(false, instance.search(6).hasOnlyLeftChild());
        // 2nd childs
        assertEquals(false, instance.search(5).hasChild());
        assertEquals(false, instance.search(5).hasOnlyRightChild());
        assertEquals(false, instance.search(5).hasOnlyLeftChild());
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(6));
        // Root
        assertEquals(true, instance.search(4).hasChild());
        assertEquals(false, instance.search(4).hasOnlyRightChild());
        assertEquals(false, instance.search(4).hasOnlyLeftChild());
        // 1st childs
        assertEquals(false, instance.search(2).hasChild());
        assertEquals(false, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        assertEquals(true, instance.search(5).hasChild());
        assertEquals(true, instance.search(5).hasOnlyRightChild());
        assertEquals(false, instance.search(5).hasOnlyLeftChild());
        // 2nd childs
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(4));
        // Root
        assertEquals(true, instance.search(2).hasChild());
        assertEquals(true, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        // 1st childs
        assertEquals(true, instance.search(5).hasChild());
        assertEquals(true, instance.search(5).hasOnlyRightChild());
        assertEquals(false, instance.search(5).hasOnlyLeftChild());
        // 2nd childs
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(5));
        // Root
        assertEquals(true, instance.search(2).hasChild());
        assertEquals(true, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
        // 1st childs
        assertEquals(false, instance.search(7).hasChild());
        assertEquals(false, instance.search(7).hasOnlyRightChild());
        assertEquals(false, instance.search(7).hasOnlyLeftChild());

        assertEquals(true, instance.remove(7));
        // Root
        assertEquals(false, instance.search(2).hasChild());
        assertEquals(false, instance.search(2).hasOnlyRightChild());
        assertEquals(false, instance.search(2).hasOnlyLeftChild());
    }

}
