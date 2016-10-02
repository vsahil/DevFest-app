package com.example.sahilverma.app;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Userhome extends MainActivity2 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userhome);
    }
    public void onClickBooka(View z)
    {
        if(z.getId()==R.id.Booka)
        {
            Intent o=new Intent(Userhome.this,Form.class);
            startActivity(o);
        }
    }
    public void onRateDriver(View w)
    {
        if(w.getId()==R.id.Driver)
        {
            Intent j=new Intent(Userhome.this,RatingD.class);
            startActivity(j);
        }
    }

}