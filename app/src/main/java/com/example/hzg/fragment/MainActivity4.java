package com.example.hzg.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hzg on 2016/7/19.
 */
public class MainActivity4 extends Activity implements MyFragment5.MyListener{
    private EditText editext;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        editext = (EditText) findViewById(R.id.editText);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editext.getText().toString();
                MyFragment5 fragment5 = new MyFragment5();
                Bundle bundle = new Bundle();//数据包
                bundle.putString("name", text);

                fragment5.setArguments(bundle);//fragment传送数据包

                FragmentManager fragmentManager = getFragmentManager();//获取fragment管理者
                FragmentTransaction beginTransaction = fragmentManager//开启事务
                        .beginTransaction();
                beginTransaction.add(R.id.layout, fragment5, "fragment5");
                beginTransaction.commit();
                Toast.makeText(MainActivity4.this, "向Fragment发送数据" + text,
                        Toast.LENGTH_SHORT).show();
            }
        });
        FragmentManager fragmentManager=getFragmentManager();
        Fragment findFragmentById = fragmentManager.findFragmentById(R.id.frag);
        MyFragment frag= (MyFragment) findFragmentById;//转换
        frag.setAaa("fragment静态传值");

    }

    @Override
    public void thank(String code) {
        Toast.makeText(MainActivity4.this, "已成功接收到" + code + ",客气了！", Toast.LENGTH_SHORT).show();

    }
}