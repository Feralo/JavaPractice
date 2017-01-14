package com.feralo;

/**
 * Created by ncs on 1/14/17.
 */
public class IntNode {
    // Invariant of the IntNode class:
    //    1. the node's Integer data is the instance variable data
    //    2. For the final node of a list the link part is null.
    //       Otherwise, the link part is a reference to the next node of the list.

    private int data;
    private IntNode link;

    public IntNode(int initialData, IntNode intialLink)
    {
        data = initialData;
        link = intialLink;
    }

    public void addNodeAfter(int element)
    {
        link = new IntNode(element, link);
    }

    public int getData()
    {
        return data;
    }

    public IntNode getLink()
    {
        return link;
    }
}
