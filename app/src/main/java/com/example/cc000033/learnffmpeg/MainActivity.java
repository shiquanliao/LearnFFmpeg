package com.example.cc000033.learnffmpeg;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    VideoUtils videoUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        videoUtils = new VideoUtils();
        videoUtils.playMyMedia("http://blog.csdn.net/ywl5320");
        tv.setText(videoUtils.stringFromJNI());

        Log.e("shiquan", "onCreate: -----" );

        Button button = findViewById(R.id.button);
        String input = new File(Environment.getExternalStorageDirectory(),"input.mp4").getAbsolutePath();
        String output = new File(Environment.getExternalStorageDirectory(),"output_1280x720_yuv420p.yuv").getAbsolutePath();
        VideoUtils.decode(input, output);
    }



}
