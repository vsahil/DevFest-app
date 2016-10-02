package com.example.sahilverma.app;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity2 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity2);
    }
    public void onClickRegister(View z)
    {
        if(z.getId()==R.id.Register)
        {
            Intent o=new Intent(MainActivity2.this,Userhome.class);
            startActivity(o);
        }
    }

}
//package com.example.sahilverma.app;
//
///**
// * Created by sahilverma on 02/10/16.
// */
//import android.app.ProgressDialog;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.example.sahilverma.app.R;
//import android.app.ProgressDialog;
//
//import java.util.HashMap;
//
//public class MainActivity2 extends MainActivity implements View.OnClickListener{
//
//    private EditText editTextName;
//    private EditText editTextUsername;
//    private EditText editTextPassword;
//    private EditText editTextEmail;
//
//    private Button buttonRegister;
//
//    private static final String REGISTER_URL = "http://simplifiedcoding.16mb.com/UserRegistration/register.php";
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.mainactivity2);
//
//        editTextName = (EditText) findViewById(R.id.editTextName);
//        editTextUsername = (EditText) findViewById(R.id.editTextUserName);
//        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
//        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
//
//        buttonRegister = (Button) findViewById(R.id.buttonRegister);
//
//        buttonRegister.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View v) {
//        if(v == buttonRegister){
//            registerUser();
//        }
//    }
//
//    private void registerUser() {
//        String name = editTextName.getText().toString().trim().toLowerCase();
//        String username = editTextUsername.getText().toString().trim().toLowerCase();
//        String password = editTextPassword.getText().toString().trim().toLowerCase();
//        String email = editTextEmail.getText().toString().trim().toLowerCase();
//
//        register(name,username,password,email);
//    }
//
//    private void register(String name, String username, String password, String email) {
//        class RegisterUser extends AsyncTask<String, Void, String>{
//            ProgressDialog loading;
//            RegisterUserClass ruc = new RegisterUserClass();
//
//
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                loading = ProgressDialog.show(MainActivity2.this, "Please Wait",null, true, true);
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                loading.dismiss();
//                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            protected String doInBackground(String... params) {
//
//                HashMap<String, String> data = new HashMap<String,String>();
//                data.put("name",params[0]);
//                data.put("username",params[1]);
//                data.put("password",params[2]);
//                data.put("email",params[3]);
//
//                String result = ruc.sendPostRequest(REGISTER_URL,data);
//
//                return  result;
//            }
//        }
//
//        RegisterUser ru = new RegisterUser();
//        ru.execute(name,username,password,email);
//    }
//    public static boolean isInterNetUp(Context ctx) {
//        boolean connected = false;
//        try {
//            ConnectivityManager connectivityManager = (ConnectivityManager) ctx
//                    .getSystemService(Context.CONNECTIVITY_SERVICE);
//
//            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
//            connected = networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
//            return connected;
//
//
//        } catch (Exception e) {
//            //exception
//        }
//        return connected;
//    }
//
//}
//
//
