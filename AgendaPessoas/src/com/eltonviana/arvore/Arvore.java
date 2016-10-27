/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.arvore;

import java.util.Comparator;

/**
 * @author Elton Viana
 * @param <Type>
 */
public class Arvore<Type> {

    private Node<Type> root;
    private Comparator<Type> cmp;

    public Arvore(Comparator<Type> cmp) {
        this.root = null;
        this.cmp = cmp;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getHeight() {
        return getHeight(this.root);
    }

    public int getHeight(Node<Type> node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = getHeight(node.getLeftSon());
        int rightHeight = getHeight(node.getRightSon());

        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    public Node<Type> getSmallestElement() {
        return getSmallestElement(root);
    }

    private Node<Type> getSmallestElement(Node<Type> node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftSon() == null) {
            return node;
        }

        return getSmallestElement(node.getLeftSon());
    }

    public Node<Type> getBiggestElement() {
        return getBiggestElement(root);
    }

    private Node<Type> getBiggestElement(Node<Type> node) {
        if (node == null) {
            return null;
        }

        if (node.getRightSon() == null) {
            return node;
        }

        return getBiggestElement(node.getRightSon());
    }

    public void insert(Type element) {
        this.insert(new Node(element), root);
    }

    private void insert(Node<Type> newNode, Node<Type> prevNode) {
        if (this.root == null) {
            root = newNode;
            return;
        }

        if (prevNode == null) {
            prevNode = newNode;
            return;
        }

        if (cmp.compare(newNode.getValue(), prevNode.getValue()) < 0) {
            insert(newNode, prevNode.getLeftSon());
        } else if (cmp.compare(newNode.getValue(), prevNode.getValue()) > 0) {
            insert(newNode, prevNode.getRightSon());
        }
    }
}
