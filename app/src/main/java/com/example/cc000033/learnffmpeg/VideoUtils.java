package com.example.cc000033.learnffmpeg;

public class VideoUtils {

    static {
        System.loadLibrary("avutil-54");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("postproc-53");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("avdevice-56");
        System.loadLibrary("native-lib");
    }

    public native String stringFromJNI();

    public native void playMyMedia(String url);
}
