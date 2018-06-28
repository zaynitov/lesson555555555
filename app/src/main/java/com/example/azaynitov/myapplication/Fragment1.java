package com.example.azaynitov.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    private TextView editText;
    private CustomBroadcastReciever mReciever;
    private IntentFilter mFilter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment1, container, false);

        return inflate;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText=(TextView) view.findViewById(R.id.textView2);
        mReciever = new CustomBroadcastReciever();
        mFilter = new IntentFilter("GETER");
        getActivity().registerReceiver(mReciever, mFilter);



    }


    private class CustomBroadcastReciever extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            System.out.println("DSFDSFDSFFDFDSF");
            System.out.println("DSFDSFDSFFDFDSF");

            System.out.println("DSFDSFDSFFDFDSF");

            System.out.println("DSFDSFDSFFDFDSF");

            System.out.println("DSFDSFDSFFDFDSF");

            System.out.println("DSFDSFDSFFDFDSF");

            editText.setText(intent.getStringExtra("String"));


        }


    }
}
