package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(MainActivity.this, "toast" , Toast.LENGTH_LONG);//first parameter is context and third is duration 
        toast.show();//or .show without making object
        //we can specify anything in custom toast
    }
}
// toaST IS SHORT POPUP messsage
