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
public class Node<Type> {

    private Type value;
    private Node leftSon;
    private Node rightSon;

    public Node() {
    }

    public Node(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

}
