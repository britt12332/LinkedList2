package com.example.brittany.linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



public class StackActivity extends AppCompatActivity
{
    private Button pushButton;
    private Button popButton;
    private Button peekButton;
    private TextView peekText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        this.pushButton = (Button)this.findViewById(R.id.pushButton);
        this.popButton = (Button)this.findViewById(R.id.popButton);
        this.peekButton = (Button)this.findViewById(R.id.peekButton);
        this.peekText = (TextView)this.findViewById(R.id.peekText);
        ListCore.newValueEditText = (EditText)this.findViewById(R.id.newValueET);

        ListCore.inflater = this.getLayoutInflater();

        LinearLayout svLL = (LinearLayout)this.findViewById(R.id.scrollViewLL);
        ListCore.ll = new LinkedList(svLL);
        ListCore.ll.addEnd("6");
        ListCore.ll.addEnd("7");
        ListCore.ll.addEnd("8");
        ListCore.ll.display();

    }
    public void stackButtonClicked(View sender)
    {
        if(sender == this.pushButton)
        {
            System.out.println("**** push pressed");
            ListCore.ll.addFront(ListCore.newValueEditText.getText().toString());
            // ListCore.newValueEditText.getText());

        }
        else if(sender == this.popButton)
        {
            System.out.println("**** pop pressed");
            ListCore.ll.removeFront();

        }
        else if(sender == this.peekButton)
        {
            int convertToInt = Integer.parseInt(ListCore.newValueEditText.getText().toString());
            System.out.println("**** peek pressed");
            ListCore.ll.getAtIndex(convertToInt);
            System.out.println(ListCore.ll.getAtIndex(convertToInt).getPayload());
            //this.peekText.append("The number : " + ListCore.ll.getAtIndex(1).getPayload() + " is at position ");
            this.peekText.setText("The number we peeked at is : " +ListCore.ll.getAtIndex(convertToInt).getPayload()+ " it is at position " + convertToInt );
        }
        ListCore.ll.display();



    }


}