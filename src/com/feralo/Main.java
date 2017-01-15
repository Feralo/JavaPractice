package com.feralo;

public class Main {

    public static void main(String[] args) {
        // Test drive of the integer-based linked list
        IntNode node = new IntNode(12, null);
        node.addNodeAfter(155);
        System.out.println(IntNode.listLength(node));
    }
}
