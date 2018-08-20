package com.example.user.internproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference myref;
   ArrayList<Myorder> myorderslist=new ArrayList<>();
   RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        ///recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(new MyAdapter(this,myorderslist));
        Toast.makeText(this, "hii beforedatabase", Toast.LENGTH_SHORT).show();
        firebaseDatabase=FirebaseDatabase.getInstance();
        myref=firebaseDatabase.getReference("myorders");
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("aftercalling","before calling the method");
                collectcolleges((Map<String,Object>) dataSnapshot.getValue());
                Log.i("aftercalling","after calling the method");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //recyclerView.setAdapter(new MyAdapter(this,myorderslist));
    }
    private void collectcolleges(Map<String, Object> value) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        String namevalues="";
        Log.i("incollegemethod","in collegemethod");
        myorderslist=new ArrayList<>();
        for (Map.Entry<String, Object> entry : value.entrySet()){
            Map singleUser = (Map) entry.getValue();
            Myorder cp=new Myorder((String) singleUser.get("Grandtotal"),(String) singleUser.get("Rate"),
                    (String) singleUser.get("Servicerequired"),(String) singleUser.get("amount"),(String) singleUser.get("bn")
                    ,(String) singleUser.get("date"),(String) singleUser.get("image"),(String) singleUser.get("name"),
                    (String) singleUser.get("paymentstatus"),(String) singleUser.get("role"),
                    (String) singleUser.get("status"),(String) singleUser.get("wheretowork"));
            myorderslist.add(cp);
            Toast.makeText(this, cp.bn, Toast.LENGTH_SHORT).show();
            Log.i("99name",cp.name);
        }

        if(myorderslist.size()>0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new MyAdapter(this, myorderslist));
        }

    }

}