package com.example.brittany.linkedlist;


import android.widget.LinearLayout;
import android.widget.TextView;

public class Node
{
    private String payload;
    private Node nextNode;
    private TextView valueLabel;
    private LinearLayout layout;

    public Node(String payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public String getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
        this.payload = payload;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }
}

