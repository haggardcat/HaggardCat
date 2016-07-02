package kr.co.ipdisk.cattree.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btCalc:
                this.startActivity(new Intent(this,CalcActivity.class));
                break;
            case R.id.btCalendar:
                this.startActivity(new Intent(this,CalendarActivity.class));
                break;
        }
    }

    Button btCalc, btCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCalc = (Button) findViewById(R.id.btCalc);
        btCalender = (Button) findViewById(R.id.btCalendar);
        btCalc.setOnClickListener(this);
        btCalender.setOnClickListener(this);
    }
}
