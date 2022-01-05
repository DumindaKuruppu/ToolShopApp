package com.example.toolshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopNowActivity extends AppCompatActivity {

    private RecyclerView toolRecView;
    private ToolRecViewAdapter adapter;

    private Button btnSearchCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_now);

        adapter = new ToolRecViewAdapter(this);
        toolRecView = findViewById(R.id.toolRecView);
        btnSearchCategory = findViewById(R.id.btnSearchCategory);

        toolRecView.setAdapter(adapter);
        toolRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Tool> tools = new ArrayList<>();

        tools.add(new Tool(1,"Hammer",100.57,3,2,true,"https://images-na.ssl-images-amazon.com/images/I/71tTWyypTKL._AC_SX679_.jpg"));

        tools.add(new Tool(2,"Wireless Drill",150.00,3,2,true,"https://4.imimg.com/data4/PL/KU/MY-9613110/cordless-drill-machine-500x500.jpg"));

        tools.add(new Tool(2,"BOSCH Angle Grinder",200.00,3,2,true,"https://images-na.ssl-images-amazon.com/images/I/61o4AJt%2BqdL._AC_SY355_.jpg"));

        tools.add(new Tool(2,"DEWALT Angle Grinder",240.00,3,2,true,"https://images-na.ssl-images-amazon.com/images/I/71oD73mzcSL._AC_SY355_.jpg"));

        tools.add(new Tool(2,"148-Piece Tool Set",300.00,3,2,true,"https://images-na.ssl-images-amazon.com/images/I/91JQZ%2BjOi4L._AC_SY355_.jpg"));

        tools.add(new Tool(2,"Black & Decor Gigsaw",180.00,3,2,true,"https://www.blackanddecker.ca/NA/product/images/500x500x72/BDEJS600C/BDEJS600C_3.jpg"));

        tools.add(new Tool(2,"DEWALT Power Saw",400.00,3,2,true,"https://images-na.ssl-images-amazon.com/images/I/51S%2BRAScBnL._AC_SY355_.jpg"));

        tools.add(new Tool(2,"High Power Air Compressor",130.00,3,2,true,"https://img.buzzfeed.com/buzzfeed-static/static/2018-08/22/10/asset/buzzfeed-prod-web-06/sub-buzz-17969-1534948634-10.jpg"));

        adapter.setTools(tools);


        btnSearchCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopNowActivity.this,SelectCategoryActivity.class);
                startActivity(intent);
            }
        });


    }
}