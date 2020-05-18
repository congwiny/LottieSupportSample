package com.congwiny.lottiesupportsample;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;

public class LottieDrawableActivity extends FragmentActivity {

    private LottieDrawable mLottieDrawable;
    private ImageView mLottieIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_drawable);
        mLottieIv = findViewById(R.id.lottie_iv);
        mLottieDrawable = new LottieDrawable();
        mLottieDrawable.setRepeatMode(LottieDrawable.RESTART);
        mLottieDrawable.setRepeatCount(LottieDrawable.INFINITE);
        mLottieIv.setImageDrawable(mLottieDrawable);
    }

    public void playDrawableAnim(View view) {
        mLottieDrawable.clearComposition();
        LottieTask<LottieComposition> task = LottieCompositionFactory.fromAsset(this,"vr_animation.json");
        task.addListener(new LottieListener<LottieComposition>() {
            @Override
            public void onResult(LottieComposition lottieComposition) {
                mLottieDrawable.setComposition(lottieComposition);
                mLottieDrawable.playAnimation();
            }
        });

        task.addFailureListener(new LottieListener<Throwable>(){

            @Override
            public void onResult(Throwable result) {

            }
        });

    }

    public void playZipAnim(View view) {
        mLottieDrawable.clearComposition();
        LottieTask<LottieComposition> task = LottieCompositionFactory.fromAsset(this,"camptravel.zip");
        task.addListener(new LottieListener<LottieComposition>() {
            @Override
            public void onResult(LottieComposition lottieComposition) {
                mLottieDrawable.setComposition(lottieComposition);
                mLottieDrawable.playAnimation();
            }
        });

    }
}
