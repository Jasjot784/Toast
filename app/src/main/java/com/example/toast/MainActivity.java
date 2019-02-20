package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(MainActivity.this, "toast" , Toast.LENGTH_LONG);//first parameter is context and third is duration also can be written as a number which is in milliseconds
        toast.show();//or .show without making object
        //we can specify anything in custom toast
    }
}
// toST IS SHORT POPUP messsage