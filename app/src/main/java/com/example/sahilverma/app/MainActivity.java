package com.example.sahilverma.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.Bdisplay)
        {
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        }
    }
    public void onRateClick(View w)
    {
        if(w.getId()==R.id.Rdisplay)
        {
            Intent j=new Intent(MainActivity.this,Rating.class);
            startActivity(j);
        }
    }
    public void onClickHome(View x) {
//        Intent startMain = new Intent(Intent.MainActivity);
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);
        if(x.getId()==R.id.Ratedone)
        {
//            Intent j=new Intent(MainActivity.this,Rating.class);
//            startActivity(j);
            finish();
        }
    }

}
