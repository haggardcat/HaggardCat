package kr.co.ipdisk.cattree.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageActivity extends Activity implements View.OnClickListener {
    Button netximage, previmage;
    ImageView ivimage;
    TextView tvimage;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.netximage:

                break;
            case R.id.previmage:

                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        netximage = (Button) findViewById(R.id.netximage);
        previmage = (Button) findViewById(R.id.previmage);
        ivimage = (ImageView) findViewById(R.id.ivimage);
        tvimage = (TextView) findViewById(R.id.tvimage);
        netximage.setOnClickListener(this);
        previmage.setOnClickListener(this);

    }
}
