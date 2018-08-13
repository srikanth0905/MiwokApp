package com.example.greymat9er.miwokapp;

public class Word {

    //Default(English) translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
