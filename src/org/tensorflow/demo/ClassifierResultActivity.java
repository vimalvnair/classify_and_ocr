package org.tensorflow.demo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ClassifierResultActivity extends Activity {
    RecognitionScoreView mRecognitionScoreView = null;
    Gson mGson = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifier_result);
        mRecognitionScoreView = (RecognitionScoreView) findViewById(R.id.results_2);
        mGson = new Gson();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String resultMessage = intent.getStringExtra("result");
        Type listType = new TypeToken<ArrayList<Classifier.Recognition>>(){}.getType();
        List<Classifier.Recognition> result = mGson.fromJson(resultMessage, listType);
        mRecognitionScoreView.setResults(result);
    }
}
