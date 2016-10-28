/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonviana.BST;

/**
 * @author Elton Viana
 * @param <Type>
 */
public class BinarySearchTree<Type extends Comparable<Type>> {

    private Node<Type> root;

    public BinarySearchTree() {
        this.root = null;
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

        int leftHeight = getHeight(node.getLeftChild());
        int rightHeight = getHeight(node.getRightChild());

        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    public int getDepth(Node<Type> node) {
        return getDepth(node, root);
    }

    private int getDepth(Node<Type> node, Node<Type> father) {
        if (node == null || father == null) {
            return -1;
        }

        if (node == father) {
            return 0;
        }

        int depth = getDepth(
                node,
                father.getValue().compareTo(node.getValue()) < 0
                ? father.getRightChild() : father.getLeftChild()
        );

        return depth != -1 ? 1 + depth : -1;
    }

    public Node<Type> getSmallestElement() {
        return getSmallestElement(root);
    }

    private Node<Type> getSmallestElement(Node<Type> node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftChild() == null) {
            return node;
        }

        return getSmallestElement(node.getLeftChild());
    }

    public Node<Type> getBiggestElement() {
        return getBiggestElement(root);
    }

    private Node<Type> getBiggestElement(Node<Type> node) {
        if (node == null) {
            return null;
        }

        if (node.getRightChild() == null) {
            return node;
        }

        return getBiggestElement(node.getRightChild());
    }

    public Node<Type> search(Type val) {
        return search(val, root);
    }

    private Node<Type> search(Type val, Node node) {
        if (node == null) {
            return null;
        }

        if (node.getValue().compareTo(val) < 0) {
            return search(val, node.getRightChild());
        }

        if (node.getValue().compareTo(val) > 0) {
            return search(val, node.getLeftChild());
        }

        return node;
    }

    public Node<Type> insert(Type element) {
        return this.insert(new Node(element), root);
    }

    private Node<Type> insert(Node<Type> newNode, Node<Type> prevNode) {
        if (this.root == null) {
            root = newNode;
            return root;
        }

        if (newNode.getValue().compareTo(prevNode.getValue()) < 0) {
            if (prevNode.getLeftChild() == null) {
                prevNode.setLeftChild(newNode);
                return prevNode.getLeftChild();
            } else {
                return insert(newNode, prevNode.getLeftChild());
            }
        } else if (newNode.getValue().compareTo(prevNode.getValue()) > 0) {
            if (prevNode.getRightChild() == null) {
                prevNode.setRightChild(newNode);
                return prevNode.getRightChild();
            } else {
                return insert(newNode, prevNode.getRightChild());
            }
        }

        return null;
    }

    public boolean remove(Type val) {
        if (root == null) {
            return false;
        }

        Node prev = root;
        Node curr = root;
        int cmp = curr.getValue().compareTo(val);

        while (prev.hasChild() && cmp != 0) {
            prev = curr;
            curr = cmp < 0 ? curr.getRightChild() : curr.getLeftChild();
            cmp = curr.getValue().compareTo(val);
        }

        if (curr.getValue().compareTo(val) != 0) {
            return false;
        }

        boolean isLeftChild = prev.getValue().compareTo(val) > 0;

        // is leaf node
        if (!curr.hasChild()) {
            if (curr == root) {
                root = null;
            } else if (isLeftChild) {
                prev.setLeftChild(null);
            } else {
                prev.setRightChild(null);
            }

            return true;
        }

        // Has Only left Child
        if (curr.hasOnlyLeftChild()) {
            if (curr == root) {
                root = curr.getLeftChild();
            } else if (isLeftChild) {
                prev.setLeftChild(curr.getLeftChild());
            } else {
                prev.setRightChild(curr.getLeftChild());
            }

            return true;
        }

        // Has only Right Child
        if (curr.hasOnlyRightChild()) {
            if (curr == root) {
                root = curr.getRightChild();
            } else if (isLeftChild) {
                prev.setLeftChild(curr.getRightChild());
            } else {
                prev.setRightChild(curr.getRightChild());
            }

            return true;
        }

        // Has Both Childs
        Node<Type> smallest = getSmallestElement(curr);
        smallest.setRightChild(curr.getRightChild());

        if (curr == root) {
            root = smallest;
        } else if (isLeftChild) {
            prev.setLeftChild(smallest);
        } else {
            prev.setRightChild(smallest);
        }

        return true;
    }

    public void printInOrder() {
        System.out.print("[");
        printInOrder(root);
        System.out.println(" ]");
    }

    public void printPreOrder() {
        System.out.print("[");
        printPreOrder(root);
        System.out.println(" ]");
    }

    public void printPostOrder() {
        System.out.print("[");
        printPostOrder(root);
        System.out.println(" ]");
    }

    private void printInOrder(Node<Type> node) {
        if (node != null) {
            printInOrder(node.getLeftChild());
            System.out.print(" " + node.getValue());
            printInOrder(node.getRightChild());
        }
    }

    private void printPreOrder(Node<Type> node) {
        if (node != null) {
            System.out.print(" " + node.getValue());
            printPreOrder(node.getLeftChild());
            printPreOrder(node.getRightChild());
        }
    }

    private void printPostOrder(Node<Type> node) {
        if (node != null) {
            printPostOrder(node.getLeftChild());
            printPostOrder(node.getRightChild());
            System.out.print(" " + node.getValue());
        }
    }

}
