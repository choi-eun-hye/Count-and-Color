package com.example.myapplication;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;

    private Button countbtn, colorbtn;

    @Override
    //액티비티 런치 후 최초 실행 시 호출, 리소스 초기화
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 액티비티에서 xml 리소스 가져오기
        // final TextView textCounter = (TextView) findViewById(R.id.txtcounter);

        // 위젯에 대한 참조
        countbtn = (Button) findViewById(R.id.countbtn);
        colorbtn = (Button) findViewById(R.id.colorbtn);

        // 탭 버튼에 리스너 연결
        countbtn.setOnClickListener(this);
        colorbtn.setOnClickListener(this);

        // 프래그먼트 정함
        callFragment(FRAGMENT1);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.countbtn:
                callFragment(FRAGMENT1);
                break;

            case R.id.colorbtn:
                callFragment(FRAGMENT2);
                break;
        }
    }

    private void callFragment(int fragment_no) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment_no) {
            case 1:
                CountFragment countfragment = new CountFragment();
                transaction.replace(R.id.fragment_container, countfragment);
                transaction.commit();
                break;

            case 2:
                ColorFragment colorfragment = new ColorFragment();
                transaction.replace(R.id.fragment_container, colorfragment);
                transaction.commit();
                break;
        }
    }
}
