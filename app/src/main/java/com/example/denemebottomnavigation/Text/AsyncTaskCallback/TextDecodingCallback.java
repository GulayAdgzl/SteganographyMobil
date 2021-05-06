package com.example.denemebottomnavigation.Text.AsyncTaskCallback;

import com.example.denemebottomnavigation.Text.ImageSteganography;
import com.example.denemebottomnavigation.Text.ImageSteganography;

/**
 * This the callback interface for TextDecoding AsyncTask.
 */

public interface TextDecodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
