package kr.co.ipdisk.cattree.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends Activity implements View.OnClickListener{
    Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        btHome = (Button) findViewById(R.id.btHome);
        btHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btHome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
