package com.faisal.hiddencameradetector.TipsContent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.faisal.hiddencameradetector.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Bathroom extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);

        //admob
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }


}
