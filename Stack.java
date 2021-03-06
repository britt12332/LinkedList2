package com.example.brittany.linkedlist;


import android.app.Fragment;
import android.widget.LinearLayout;


public class Stack extends LinkedList
{
    public Stack(LinearLayout layout)
    {
        super(layout);
    }

    public Node peek()
    {
        return this.getAtIndex(0);
    }

    public Node pop()
    {
        return this.removeFront();
    }

    public void push(String value)
    {
        this.addFront(value);
    }
}