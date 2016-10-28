/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.arvore;

/**
 * @author Elton Viana
 * @param <Type>
 */
public class Node<Type extends Comparable<Type>> {

    private Type value;
    private Node leftChild;
    private Node rightChild;

    public Node() {
        leftChild = null;
        rightChild = null;
    }

    public Node(Type value) {
        this();
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean hasChild() {
        return this.getLeftChild() != null || this.getRightChild() != null;
    }

    public boolean hasOnlyLeftChild() {
        return this.getLeftChild() != null && this.getRightChild() == null;
    }

    public boolean hasOnlyRightChild() {
        return this.getLeftChild() == null && this.getRightChild() != null;
    }

}
