package com.example.hzg.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by hzg on 2016/7/19.
 */
public class MainActivity3 extends Activity {
    private Button button;
    //    private Fragment fragment;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        init();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                //事务
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                if (flag) {
                    MyFragment4 myFragment4 = new MyFragment4();
                    //main4中的LinearLayout
                    beginTransaction.replace(R.id.layout, myFragment4);
                    flag = false;
                } else {
                    MyFragment3 myFragment3 = new MyFragment3();
                    beginTransaction.replace(R.id.layout, myFragment3);
                    flag = true;
                }
                beginTransaction.commit();
            }
        });
    }

    private void init() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        MyFragment3 myFragment3 = new MyFragment3();
        beginTransaction.add(R.id.layout, myFragment3);
        beginTransaction.commit();
    }
}
