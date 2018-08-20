package com.example.user.internproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ArrayList<String> orderinfo=new ArrayList<>();
    ImageView imageView;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.image);
        tv1=findViewById(R.id.job);
        tv2=findViewById(R.id.address);
        tv3=findViewById(R.id.status);
        tv4=findViewById(R.id.wrkassigned);
        tv5=findViewById(R.id.track);
        tv6=findViewById(R.id.rate);
        tv7=findViewById(R.id.tax);
        tv8=findViewById(R.id.dist);
        tv9=findViewById(R.id.gtotal);
        tv10=findViewById(R.id.st);
        tv11=findViewById(R.id.et);
        tv12=findViewById(R.id.tt);
        tv13=findViewById(R.id.ps);
        orderinfo=getIntent().getStringArrayListExtra("orderinfo");//Taking data from adapter
        Picasso.with(this).load(orderinfo.get(6)).into(imageView);
        tv1.setText(orderinfo.get(9));
        tv2.setText(orderinfo.get(11));
        tv3.setText(orderinfo.get(10));
        tv4.setText(orderinfo.get(2));
        tv5.setText("tracking");
        tv6.setText("Rate: "+orderinfo.get(1));
        tv7.setText("Tax: ");
        tv8.setText("Discount: ");
        tv9.setText("Grand Total: "+orderinfo.get(0));
        tv10.setText("Start Time: ");
        tv11.setText("End Time: ");
        tv12.setText("Total Time: ");
        tv13.setText("Payment Status: "+orderinfo.get(10));
        getSupportActionBar().setTitle(orderinfo.get(4));

    }
}
