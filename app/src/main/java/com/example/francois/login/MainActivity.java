package com.example.francois.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText ET_NAME,ET_PASS;
    String login_name,login_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_NAME = (EditText)findViewById(R.id.name);
        ET_PASS = (EditText)findViewById(R.id.password);
    }

    public void onClickHome(View view)
    {
        switch (view.getId())
        {
            case R.id.connecte:

              String  login_name = ET_NAME.getText().toString();
              String  login_pass = ET_PASS.getText().toString();
                String method = "Login";
                BackgroundTask backgroundTask = new BackgroundTask(this);
                backgroundTask.execute(method,login_name,login_pass);


                break;
            case R.id.inscription:
                Intent intent = new Intent(this, Register.class);
                startActivity(intent);
                break;
        }
    }

}
