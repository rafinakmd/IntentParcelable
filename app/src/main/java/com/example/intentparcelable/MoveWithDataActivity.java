package com.example.intentparcelable;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MoveWithDataActivity extends AppCompatActivity{

    public static  String EXTRA_AGE = "extra age";
    public static  String EXTRA_NAME = "extra name";
    private TextView tvDataRecived;

    protected void  onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataRecived = (TextView)findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Nama : " +name+", Umur lu : "+age;
        tvDataRecived.setText(text);
    }
}
