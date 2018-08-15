package com.example.greymat9er.miwokapp;

import android.media.MediaPlayer;

public class Word {

    //Default(English) translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    private static final int NO_IMAGE_REFERENCE = -1;

    //Resource id for images
    private int mImageResourceId = NO_IMAGE_REFERENCE;

    //Resource id for audio files
    private int mAudioResource;

    Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResource;
        mAudioResource = audioResource;
    }

    Word(String defaultTranslation, String miwokTranslation, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = audioResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_REFERENCE;
    }

    public int getmAudioResource() {
        return mAudioResource;
    }
}
