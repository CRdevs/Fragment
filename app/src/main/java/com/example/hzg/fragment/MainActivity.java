package com.example.hzg.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.first: {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            }
            case R.id.second: {
                MyFragment2 myFragment2=new MyFragment2();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction beginTransaction=fragmentManager.beginTransaction();
                beginTransaction.add(R.id.frame, myFragment2);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;
            }
            case R.id.thrid: {
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);

                break;
            }
            case R.id.fourth: {
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);

                break;
            }
        }
    }
}
