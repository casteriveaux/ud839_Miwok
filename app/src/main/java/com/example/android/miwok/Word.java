package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * @param defaultTranslation is the word in a language that a user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the resource ID for the audio file associated with this word
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a language that a user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param picture            is the resource ID of the image associated with this word
     * @param audioResourceId    is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int picture, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId = picture;
        mAudioResourceId = audioResourceId;
    }

    /**
     * @return
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * @param mDefaultTranslation
     */
    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    /**
     *
     * @return
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * @return
     */
    public int getImageResourceId() {

        return imageResourceId;
    }

    /**
     * returns
     *
     * @return
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }


}
