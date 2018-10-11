package com.hfad.duck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
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

    public void onCheckboxClicked (android.view.View view) {
        boolean con = ((android.widget.CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_milk:    //switchcase 문 분기할 때 콜론을 이용
                if (con) {
//            on 의 값이 true 일 경우 우유가 들어감. 밀크커피임
                } else {
//            on 의 값이 false 일 경우
                }
                break;
            case R.id.checkbox_sugar:    //switchcase 문 분기할 때 콜론을 이용
                if (con) {
//            on 의 값이 true 일 경우
                } else {
//            on 의 값이 false 일 경우 - 설탕 안들어감, 블랙커피임
                }
                break;

        }
    }

    public void onRadiobuttonClicked (android.view.View view) {
        RadioGroup rg = (RadioGroup) findViewById (R.id.radio_group);
        int rgid = rg.getCheckedRadioButtonId();
        switch (rgid) {
            case R.id.radio_caveman:
                // 라디오 버튼이 원시인 으로 선택되었을 경우
                break;
            case R.id.radio_astronaut:
                // 라디오 버튼이 우주인 으로 선택되었을 경우
                break;
        }
    }

    public void onSpinnerClicked (android.view.View view) {
        android.widget.Spinner sp = (android.widget.Spinner) findViewById (R.id.spinner);
        String spstr = String.valueOf(sp.getSelectedItem());
        // spinner 를 선택하였을 경우
    }

    public void onImageClicked (android.view.View view) {
        ImageView photo = (ImageView) findViewById(R.id.photo);
        int image = R.drawable.starbuzz_logo;
        String description = "This is the logo";
        photo.setImageResource(image);
        photo.setContentDescription(description);
    }
    public void onImgButonClicked  (android.view.View view) {
        // image button 을 선택하였을 경우
        CharSequence text = "토스트 입니다";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

}
