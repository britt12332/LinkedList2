package com.example.brittany.linkedlist;


import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StackActivity extends AppCompatActivity
{
    private LinearLayout tower1Click;
    private LinearLayout tower2Click;
    private LinearLayout tower3Click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);
        this.tower1Click = (LinearLayout) this.findViewById(R.id.tower1);
        this.tower2Click = (LinearLayout) this.findViewById(R.id.tower2);
        this.tower3Click = (LinearLayout) this.findViewById(R.id.tower3);

        TOHCore.tower1 = new TowerFragment();
        TOHCore.tower2 = new TowerFragment();
        TOHCore.tower3 = new TowerFragment();
        this.getSupportFragmentManager().beginTransaction().add(R.id.tower1, TOHCore.tower1).commit();
        this.getSupportFragmentManager().beginTransaction().add(R.id.tower2, TOHCore.tower2).commit();
        this.getSupportFragmentManager().beginTransaction().add(R.id.tower3, TOHCore.tower3).commit();
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        TOHCore.tower1.addDisk(4);
        TOHCore.tower1.addDisk(7);
        TOHCore.tower1.addDisk(10);

    }
    public void llClicked (View sender)
    {
        if(sender == tower1Click )
        {
            System.out.println("***Tower 1 clicked");
            //need to store the disk that is being moved.
            //delete it
            //then place somewhere else.
            TOHCore.tower1.removeDisk();


        }
        else if(sender == tower2Click )
        {
            System.out.println("***Tower 2 clicked");
            TOHCore.tower2.removeDisk();
        }
        else if(sender == tower3Click )
        {
            System.out.println("***Tower 3 clicked");
            TOHCore.tower3.removeDisk();
        }
    }

}
