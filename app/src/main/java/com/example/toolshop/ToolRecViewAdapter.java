package com.example.toolshop;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ToolRecViewAdapter extends RecyclerView.Adapter<ToolRecViewAdapter.ViewHolder> {
    private static final String TAG = "BookRecViewAdapter";

    private ArrayList<Tool> tools = new ArrayList<>();
    private Context mContext;

    public ToolRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_tool, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.txtToolName.setText(tools.get(position).getName());
        Glide.with(mContext)
                .asBitmap()
                .load(tools.get(position).getImgUrl())
                .into(holder.imgTool);

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, tools.get(position).getName() + " Selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,LogInActivity.class);
                mContext.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return tools.size();
    }


    public void setTools(ArrayList<Tool> tools) {
        this.tools = tools;
        notifyDataSetChanged();

//        TODO: Get Data From Website
    }


//    This class holds all View Items
    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView imgTool;
        private TextView txtToolName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            parent = itemView.findViewById(R.id.parent);
            imgTool = itemView.findViewById(R.id.imgTool);
            txtToolName = itemView.findViewById(R.id.txtToolName);

        }
    }
}
