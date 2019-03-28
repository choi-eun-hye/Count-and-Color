package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;

public class ColorFragment extends Fragment implements View.OnClickListener{

    public FrameLayout framel;
    public Button counterbtn;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstantState){
        View root = inflater.inflate(R.layout.colorfragment, container, false);

        counterbtn = (Button) root.findViewById(R.id.colorffbtn);
        counterbtn.setOnClickListener(this); // 이 this는 눌리는 버튼을 가리킴.

        // inflater를 통해 화면 구성
        return root;
    }

    @Override
    public void onClick(View v) { // v가 눌렸을 때 이벤트 발생
        framel = getActivity().findViewById(R.id.framelayout);
        colorChange(framel);
    }

    public void colorChange(View v){
        Random random = new Random();
        int color = 0;
        color = Color.rgb(random.nextInt(225),
                random.nextInt(225),
                random.nextInt(225));
        v.setBackgroundColor(color);

    }
}
