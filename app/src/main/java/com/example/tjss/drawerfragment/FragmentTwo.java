package com.example.tjss.drawerfragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tjss.drawerfragment.R;

import static com.example.tjss.drawerfragment.R.id.ClearButton01;

public class FragmentTwo extends Fragment implements View.OnClickListener{
    Button ClearButton01;
    SimpleDrawingView SDV01;
    public FragmentTwo() {
    }

    public static FragmentTwo newInstance() {
        FragmentTwo fragment = new FragmentTwo();
        return fragment;
    }


    // NEW FOR VERSION 2.0 - THIS FRAGMENT USES HIS OWN XML FILE!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        ClearButton01 = (Button) rootView.findViewById(R.id.ClearButton01);
        SDV01 = (SimpleDrawingView) rootView.findViewById(R.id.SDV01);
        ClearButton01.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        SDV01.resetPath();
    }
}
