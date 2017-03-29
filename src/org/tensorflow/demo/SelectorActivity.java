package org.tensorflow.demo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import ocr.CaptureActivity;

public class SelectorActivity extends Activity {

    Button mOcr = null;
    Button mClassify = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        mOcr = (Button) findViewById(R.id.ocr);
        mClassify = (Button) findViewById(R.id.classify);

        mOcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectorActivity.this, CaptureActivity.class);
                startActivity(intent);
            }
        });

        mClassify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectorActivity.this, ClassifyImageActivity.class);
                startActivity(intent);
            }
        });
    }

}
