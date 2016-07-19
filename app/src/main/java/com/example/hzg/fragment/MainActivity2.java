package com.example.hzg.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hzg on 2016/7/18.
 */
public class MainActivity2 extends Activity{

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button button=(Button) findViewById(R.id.button);
        tv=(TextView) findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("TextView改变了");
            }
        });

    }
}
