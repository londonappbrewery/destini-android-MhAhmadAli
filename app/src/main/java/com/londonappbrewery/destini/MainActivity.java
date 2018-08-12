package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView mStoryText;
        Button mTopButton;
        Button mBottomButton;
        int mIndex;
        int mStory;
        int mAnswer1;
        int mAnswer2;

        public Stories[] mStories = new Stories[] {
                new Stories(R.string.T1_Story),
                new Stories(R.string.T2_Story),
                new Stories(R.string.T3_Story),
                new Stories(R.string.T4_End),
                new Stories(R.string.T5_End),
                new Stories(R.string.T6_End)
        };

        public Stories[] mAnswers = new Stories[] {
                new Stories(R.string.T1_Ans1, R.string.T1_Ans2),
                new Stories(R.string.T2_Ans1, R.string.T2_Ans2),
                new Stories(R.string.T3_Ans1, R.string.T3_Ans2)
        };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateQuestion(true);

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateQuestion(false);

            }
        });

    }

    public void updateQuestion(boolean mTrueFalse) {

        if (mIndex == 0 && mTrueFalse == true) {

            mIndex = 2;
            mStory = mStories[mIndex].getStoryId();
            mStoryText.setText(mStory);
            mAnswer1 = mAnswers[mIndex].getAnwerId1();
            mTopButton.setText(mAnswer1);
            mAnswer2 = mAnswers[mIndex].getAnswerId2();
            mBottomButton.setText(mAnswer2);

        } else if (mIndex == 0 && mTrueFalse == false) {

            mIndex = 1;
            mStory = mStories[mIndex].getStoryId();
            mStoryText.setText(mStory);
            mAnswer1 = mAnswers[mIndex].getAnwerId1();
            mTopButton.setText(mAnswer1);
            mAnswer2 = mAnswers[mIndex].getAnswerId2();
            mBottomButton.setText(mAnswer2);

        } else if (mIndex == 2 && mTrueFalse == true) {

            mIndex = 5;
            mStory = mStories[mIndex].getStoryId();
            mStoryText.setText(mStory);
            mTopButton.setVisibility(View.INVISIBLE);
            mBottomButton.setVisibility(View.INVISIBLE);

        } else if (mIndex == 2 && mTrueFalse == false) {

            mIndex = 4;
            mStory = mStories[mIndex].getStoryId();
            mStoryText.setText(mStory);
            mTopButton.setVisibility(View.INVISIBLE);
            mBottomButton.setVisibility(View.INVISIBLE);

        } else if (mIndex == 1 && mTrueFalse == true) {

            mIndex = 0;
            updateQuestion(true);

        } else if (mIndex ==1 && mTrueFalse == false) {

            mIndex = 3;
            mStory = mStories[mIndex].getStoryId();
            mStoryText.setText(mStory);
            mTopButton.setVisibility(View.INVISIBLE);
            mBottomButton.setVisibility(View.INVISIBLE);
        }
    }
}
