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

    public static IntNode listCopy(IntNode source)
    {
        IntNode copyHead;
        IntNode copyTail;

        // Handle the special case of an empty list.
        if (source ==  null)
            return null;

        // Make the first node for a newly created list
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list
        while (source.link != null)
        {
            source = source.link;
            copyTail .addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        return copyHead;
    }

    public static IntNode[] listCopyWithTail(IntNode source)
    {
        // Notice that the return value is an array of two IntNode components.
        // the [0[ component is the head reference for the new list and the [1]
        // component is the tail reference to the new list.
        // Also notice that the answer array is automatically initialized to contain
        // two null values. Arrays with components that are references are always
        // initialized this way
        IntNode copyHead;
        IntNode copyTail;
        IntNode[] answer = new IntNode[2];

        // Handle the special case of an empty list.
        if (source ==  null)
            return null;

        // Make the first node for a newly created list
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list
        while (source.link != null)
        {
            source = source.link;
            copyTail .addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail reference for the new list.
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }

    public static int listLength(IntNode head)
    {
        IntNode cursor;
        int answer;

        answer = 0;
        for (cursor = head; cursor != null; cursor = cursor.link)
            answer++;

        return answer;
    }

    public static IntNode[] listPart(IntNode start, IntNode end)
    {
        // Notice that the return value is an array of two IntNode components.
        // The [0] component is the head reference for the new list and
        // the [1] compoent is the tail reference for the new list.
        IntNode copyHead;
        IntNode copyTail;
        IntNode[] answer = new IntNode[2];

        // Check for illegal null at start or end
        if (start == null)
            throw new IllegalArgumentException("start is null");
        if (end == null)
            throw new IllegalArgumentException("end is null");

        // Make the first node for the newly created list.
        copyHead =  new IntNode(start.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list
        while(start != end)
        {
            start = start.link;
            if (start == null)
                throw new IllegalArgumentException("end node was not found on the list");
            copyTail.addNodeAfter(start.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail reference for the new list.
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }

    public static IntNode listPostition(IntNode head, int position)
    {
        IntNode cursor;
        int i;

        if (position <= 0)
            throw new IllegalArgumentException("position is not positive");

        cursor = head;
        for (i = 1; (i < position) && (cursor != null); i++)
            cursor = cursor.link;

        return cursor;
    }

    public static IntNode listSearch(IntNode head, int target)
    {
        IntNode cursor;

        for (cursor = head; cursor != null; cursor = cursor.link)
            if (target == cursor.data)
                return cursor;

        return null;
    }
}
