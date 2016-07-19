package com.example.hzg.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hzg on 2016/7/18.
 */
public class MyFragment2 extends Fragment{
    private String aaa;
    public String getAaa(){
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa=aaa;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        //layout布局文件转换成View对象
        /**
         * resource:Fragment需要加载的布局文件
         * root：加载layout的父ViewGroup
         * attactToRoot：false，不返回父ViewGroup
         */
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView text=(TextView) view.findViewById(R.id.text);
        Button button = (Button) view.findViewById(R.id.button);
        text.setText("动态加载Fragment");
        button.setText("获取内容");
        setAaa("aaa");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String value = getAaa();
                Toast.makeText(getActivity(), "value="+value, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
