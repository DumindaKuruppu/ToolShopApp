package com.example.toolshop;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //    Declaring layout elements
    private Button btnShopNow, btnLogIn, btnSignIn;
    private ImageView imgAppIcon, imgBackgroundRectangle, imgToolShopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Initializing the layout elements with initializedViews method
        initializedViews();

//        Navigating to the Shop now activity
        btnShopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShopNowActivity.class);
                startActivity(intent);
            }
        });

//        Navigating to Log In Activity
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });

//        Navigating to Sign In Activity
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

//        ToolShop Bar Clicking TOAST Message
        imgToolShopBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "සිත්මි මෝඩියෙක්", Toast.LENGTH_SHORT).show();
            }
        });

//        Navigating to ToolShop Website by long clicking the ToolShopBar image
        imgToolShopBar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("ToolShop");
                builder.setMessage("Do you want to visit ToolShop Website ?");

                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setPositiveButton("Visit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(MainActivity.this, WebActivity.class);
                        startActivity(intent);
                    }
                });

                builder.create().show();
                return true;

            }
        });

//        AppIcon Click TOAST Message
        imgAppIcon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "You Clicked ToolShop App Icon", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

                return false;
            }
        });
    }


    //    Initializing layout elements.
    private void initializedViews() {
        btnShopNow = findViewById(R.id.btnShopNow);
        btnLogIn = findViewById(R.id.btnLogIn);
        btnSignIn = findViewById(R.id.btnSignUp);


        imgToolShopBar = findViewById(R.id.imgToolShopBar);
        imgAppIcon = findViewById(R.id.imgAppIcon);
    }
}