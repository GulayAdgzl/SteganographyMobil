package com.example.denemebottomnavigation.Text.AsyncTaskCallback;

import com.example.denemebottomnavigation.Text.ImageSteganography;

/**
 * This the callback interface for TextEncoding AsyncTask.
 */

public interface TextEncodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
