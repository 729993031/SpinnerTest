package com.example.SpinnerTest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MyActivity extends Activity {
    Spinner spinner;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        spinner=(Spinner)findViewById(R.id.spinner);
        String[] arr={"小悟空","猪八戒","唐僧"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arr);
        spinner.setAdapter(adapter);
    }
}
