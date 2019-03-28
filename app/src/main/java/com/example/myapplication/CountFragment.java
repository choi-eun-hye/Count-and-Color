package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CountFragment extends Fragment implements View.OnClickListener{

   // private Button counterbtn;// = (Button) getView().findViewById(R.id.counterfbtn);;
    public TextView tv;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.counterfragment, container, false);

        Button counterbtn = (Button) root.findViewById(R.id.counterfbtn);
        counterbtn.setOnClickListener(this);

        // inflater를 통해 화면 구성
        return root;

    }

    @Override
    public void onClick(View v) {
        tv = getActivity().findViewById(R.id.txtcounter);
        Integer count = Integer.parseInt(tv.getText().toString());
        tv.setText(String.valueOf(count+1));
    }

}
