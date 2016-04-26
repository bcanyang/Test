package com.example.administrator.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;


public class MainActivity extends Activity {

    private FrameLayout framelyout;
    private RadioButton home,hehe,setting,userinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initData() {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction();
        home.setOnClickListener(new mOnClickListener());
        hehe.setOnClickListener(new mOnClickListener());
        setting.setOnClickListener(new mOnClickListener());
        userinfo.setOnClickListener(new mOnClickListener());
    }

    private void initView() {
        framelyout = (FrameLayout) findViewById(R.id.framelayout);
        home = (RadioButton) findViewById(R.id.home);
        hehe = (RadioButton) findViewById(R.id.hehe);
        setting = (RadioButton) findViewById(R.id.setting);
        userinfo = (RadioButton) findViewById(R.id.userinfo);

//        Environment.getExternalStoageState(Environment.MEDIA_MOUNTED);
        String str = Environment.getExternalStorageState();
    }


    class mOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.home:

                    break;

            }

        }
    }
}


