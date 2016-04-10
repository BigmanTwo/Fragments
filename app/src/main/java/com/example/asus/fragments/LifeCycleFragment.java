package com.example.asus.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asus on 2016/4/10.
 */
public class LifeCycleFragment extends Fragment {
    private static String LGA="LifeCycleFragment";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
        return inflater.inflate(R.layout.fragment_layout,null);

    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LGA,"运行的方法"+Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
