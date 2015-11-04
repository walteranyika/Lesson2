package com.walter.lesson2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //button listener
    public void register(View xyz)
    {
       EditText edtNames = 	(EditText) findViewById(R.id.inputNames);
       EditText edtEmail = (EditText) findViewById(R.id.inputEmail);
       TextView tvResults =(TextView) findViewById(R.id.results);
       String names = edtNames.getText().toString();
       //method chaining
       String email = edtEmail.getText().toString();
       tvResults.setText(names +"\n"+email);
       
       
    }
    
    
    
    
    
    
    
}
