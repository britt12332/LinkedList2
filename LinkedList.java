package com.example.brittany.linkedlist;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class LinkedList
{
    public Node getHead()
    {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private Node head;
    private LinearLayout layout;

    public LinkedList(LinearLayout layout)
    {
        this.head = null;
        this.layout = layout;
    }

    public void display()
    {
        //this.layout.removeAllViews();
        if(this.head == null)
        {
            View v = ListCore.inflater.inflate(R.layout.node, null);
            TextView tf = (TextView) v.findViewById(R.id.theValueTF);
            tf.setText("Empty List");
            this.layout.addView(v);
        }
        else
        {
            //display the list in a reasonable format
            this.head.display(this.layout);
        }
        View v = ListCore.inflater.inflate(R.layout.node, null);
        TextView tf = (TextView) v.findViewById(R.id.theValueTF);
        tf.setText("_____________");
        this.layout.addView(v);
    }

    public void addFront(String value)
    {
        //this adds a new Node to the front of the list with payload == value
        Node n = new Node(value);
        n.setNextNode(this.head);
        this.head = n;

    }

    public Node removeFront()
    {
        //this removes and returns the Node that is currently sitting at the
        //front of the list.  The new front of the list, should be the old
        //second node or null in the event it was a 1-list
        Node nodeToReturn = this.head;
        if(this.head != null)
        {
            this.head = this.head.getNextNode();
        }
        nodeToReturn.setNextNode(null);
        return nodeToReturn;
    }
    public void addEnd(String s )
    {
        Node follower = null;
        Node curr = this.head;

        while(curr != null)
        {
            follower = curr;
            curr = curr.getNextNode();
        }
        follower.setNextNode(new Node(s));

    }
    public void removeEnd()
    {
        Node temp = this.head;

        while(temp.getNextNode().getNextNode() != null)
        {
            temp = temp.getNextNode();
        }

        temp.setNextNode(null);

    }
}