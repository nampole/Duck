package com.hfad.duck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(android.view.View view) {
//        버튼을 클릭하면 수행됨
    }

    public void onToggleButtonClicked (android.view.View view) {
        boolean tbon = ((ToggleButton) view).isChecked();
            if (tbon) {
//            on 의 값이 true 일 경우
            }
            else {
//            on 의 값이 false 일 경우
            }
    }

    public void onSwitchClicked (android.view.View view) {
        boolean son = ((android.widget.Switch) view).isChecked();
        if (son) {
//            on 의 값이 true 일 경우
        }
        else {
//            on 의 값이 false 일 경우
        }
    }
}
