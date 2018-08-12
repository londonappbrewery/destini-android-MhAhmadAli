package com.londonappbrewery.destini;

public class Stories {

    private int mStoryId;
    private int mAnwerId1;
    private int mAnswerId2;

    public Stories(int mStory) {
        mStoryId = mStory;
    }

    public Stories(int mAnswer1, int mAnswer2) {

        mAnwerId1 = mAnswer1;
        mAnswerId2 = mAnswer2;
    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getAnwerId1() {
        return mAnwerId1;
    }

    public void setAnwerId1(int anwerId1) {
        mAnwerId1 = anwerId1;
    }

    public int getAnswerId2() {
        return mAnswerId2;
    }

    public void setAnswerId2(int answerId2) {
        mAnswerId2 = answerId2;
    }
}
