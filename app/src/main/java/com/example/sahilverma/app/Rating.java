package com.example.sahilverma.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sahilverma on 01/10/16.
 */

public class Rating extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating);
    }

    public void onClickHome(View x) {
//        Intent startMain = new Intent(Intent.MainActivity);
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);
        if (x.getId() == R.id.Ratedone) {
//            Intent j=new Intent(MainActivity.this,Rating.class);
//            startActivity(j);
            finish();
        }
    }
}