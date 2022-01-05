package com.example.toolshop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelectCategoryActivity extends AppCompatActivity {

    private TextView txtViewHandTools, txtViewPowerTools, txtViewFastners, txtViewGardeningTools;
    private Button btnCategorySelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        initializedViews();

        txtViewHandTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectCategoryActivity.this, "Hand Tools Selected", Toast.LENGTH_SHORT).show();
            }
        });

        txtViewPowerTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectCategoryActivity.this, "Power Tools Selected", Toast.LENGTH_SHORT).show();
            }
        });

        txtViewFastners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectCategoryActivity.this, "Fasteners Selected", Toast.LENGTH_SHORT).show();
            }
        });

        txtViewGardeningTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectCategoryActivity.this, "Gardening Tools Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }


    //    Initializing layout elements.
    private void initializedViews() {
        txtViewHandTools = findViewById(R.id.txtViewHandTools);
        txtViewPowerTools = findViewById(R.id.txtViewPowerTools);
        txtViewFastners = findViewById(R.id.txtViewFastners);
        txtViewGardeningTools = findViewById(R.id.txtViewGardeningTools);
        btnCategorySelect = findViewById(R.id.btnCategorySelect);
    }
}