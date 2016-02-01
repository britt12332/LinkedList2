package com.example.brittany.linkedlist;

import android.renderscript.Sampler;
import android.widget.LinearLayout;

public class LinkedList
{
    private Node head;
    private LinearLayout layout;

    public LinkedList(LinearLayout layout)
    {
        this.head = new Node(null);
        this.layout = layout;
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("****Empty List");
        }
        else
        {
            System.out.println(this.head.getPayload());//display the list in a reasonable format
        }
    }

    public void addFront(String value)
    {
        Node curr = new Node(null);
        curr.setPayload(value);
        this.head = curr;
        //this adds a new Node to the front of the list with payload == value
    }

    public Node removeFront()
    {
        if(this.head.getPayload() != null)
        {
            Node temp = new Node("this test");
            temp = this.head.getNextNode();
            this.head.setPayload(null);
            System.out.println(temp);
        }
        else
        {
            System.out.println("Empty list");
        }
        //this removes and returns the Node that is currently sitting at the
        //front of the list.  The new front of the list, should be the old
        //second node or null in the event it was a 1-list
        return this.head.getNextNode();
    }
}
