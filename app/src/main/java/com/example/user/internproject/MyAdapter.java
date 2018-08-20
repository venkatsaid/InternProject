package com.example.user.internproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context ct;
    ArrayList<Myorder> myorders= new ArrayList<>();
    public MyAdapter(MainActivity context, ArrayList<Myorder> list) {
        this.ct=context;
        this.myorders=list;
//        Log.i("h124",list.get(0).getName());
          Log.i("h1234",myorders.toString());
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v1= LayoutInflater.from(ct).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v1);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Picasso.with(ct).load(myorders.get(position).getImage()).error(R.mipmap.ic_launcher).into(holder.images);
        holder.date.setText(myorders.get(position).getDate());
        holder.id.setText(myorders.get(position).getBn());
        holder.status.setText(myorders.get(position).getPaymentstatus());
        holder.job.setText(myorders.get(position).getRole());
    }
    @Override
    public int getItemCount() {
        return (myorders == null) ? 0 : myorders.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView date,id,job,name,status;
        public MyViewHolder(View itemView) {
            super(itemView);
            images=itemView.findViewById(R.id.image);
            date=itemView.findViewById(R.id.date);
            id=itemView.findViewById(R.id.worker_id);
            status=itemView.findViewById(R.id.status);
            job=itemView.findViewById(R.id.job);
            images.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<String> info=new ArrayList<>();
                    int position=getLayoutPosition();
                    info.add(0,myorders.get(position).getGrandtotal());
                    info.add(1,myorders.get(position).getRate());
                    info.add(2,myorders.get(position).getServicerequired());
                    info.add(3,myorders.get(position).getAmount());
                    info.add(4,myorders.get(position).getBn());
                    info.add(5,myorders.get(position).getDate());
                    info.add(6,myorders.get(position).getImage());
                    info.add(7,myorders.get(position).getName());
                    info.add(8,myorders.get(position).getPaymentstatus());
                    info.add(9,myorders.get(position).getRole());
                    info.add(10,myorders.get(position).getStatus());
                    info.add(11,myorders.get(position).getWheretowork());
                    Intent intent=new Intent(ct,Main2Activity.class);
                    intent.putStringArrayListExtra("orderinfo",info);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
