package com.example.asus.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by Asus on 2016/4/10.
 */
public class LifeCycleActivity extends AppCompatActivity implements View.OnClickListener{
    private FragmentManager fragmentManager;
    private LifeCycleFragment lifeCycleActivity;
    private Button mButton1,mButton2;
//    private FrameLayout frameLayout;
    private static String LGA="LifeCycleActivity";
    private int page;
    private LifeFragmentSce lifeFragmentSce;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        fragmentManager=getSupportFragmentManager();
        lifeCycleActivity= (LifeCycleFragment) fragmentManager.findFragmentById(R.id.search_edit_frame);
        mButton1= (Button) findViewById(R.id.but1);
        mButton1.setOnClickListener(this);
        mButton2= (Button) findViewById(R.id.but2);
        mButton2.setOnClickListener(this);
        lifeFragmentSce= (LifeFragmentSce) fragmentManager.findFragmentById(R.id.gramentlayout);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LGA,"Activity运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LGA,"Activity运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LGA,"Activity运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LGA,"Activity运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LGA,"Activity运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.but1:
                page++;
                transaction.add(R.id.gramentlayout,new LifeFragmentSce(),page+"");
                transaction.addToBackStack(page+"");
                transaction.commit();
                Log.d(LGA,"层数"+fragmentManager.getBackStackEntryCount());
                break;
            case R.id.but2:
                Toast.makeText(this,"清除",Toast.LENGTH_SHORT).show();
//                frameLayout.removeAllViews();
//                transaction.remove(lifeCycleActivity);清除一个指定的页面
                fragmentManager.popBackStack();//清除最上层
                transaction.commit();
                Log.d(LGA,"层数"+fragmentManager.getBackStackEntryCount());
                break;
        }
    }
}
