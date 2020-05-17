package com.congwiny.lottiesupportsample;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAnim(View v) {
        LottieAnimationView view = findViewById(R.id.progress_icon_iv);
        // view2.setAnimation(R.raw.download);
        view.setAnimation("LottieLogo2.json");
        view.playAnimation();
    }
}
