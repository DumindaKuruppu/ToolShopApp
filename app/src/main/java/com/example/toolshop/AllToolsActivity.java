package com.example.toolshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllToolsActivity extends AppCompatActivity {

    private RecyclerView toolsRecView;
    private ToolRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tools);

        adapter = new ToolRecViewAdapter(this);
        toolsRecView = findViewById(R.id.toolsRecView);

        toolsRecView.setAdapter(adapter);

        toolsRecView.setLayoutManager(new GridLayoutManager(this,1));

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
    }
}