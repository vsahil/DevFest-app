package com.example.sahilverma.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sahilverma on 01/10/16.
 */

public class RatingD extends Userhome {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingd);
    }

    public void OnClick(View x) {
//        Intent startMain = new Intent(Intent.MainActivity);
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);
        if (x.getId() == R.id.Rateone) {
//            Intent j=new Intent(MainActivity.this,Rating.class);
//            startActivity(j);
            finish();
        }
    }
}