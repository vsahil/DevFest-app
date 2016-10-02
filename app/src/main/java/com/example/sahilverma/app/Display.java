package com.example.sahilverma.app;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }
    public void onClickBook(View z)
    {
        if(z.getId()==R.id.book)
        {
            Intent o=new Intent(Display.this,Userhome.class);
            startActivity(o);
        }
    }

}