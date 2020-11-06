package com.example.contactapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> Friends = new ArrayList<>();
        Friends.add(new ContactModel("MSD","9089788891","msd@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("VK","7790127790","vk@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("RS","6736679901","rs@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("DK","9099871124","dk@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("KL","9900034571","kl@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("HP","6366790119","hp@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("KP","9089788999","kp@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("KJ","9089999891","kj@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("CPP","9986544000","cpp@gmail.com",R.drawable.download));
        Friends.add(new ContactModel("SWR","2309976541","swr@gmail.com",R.drawable.download));

        RecyclerView Friends_recyclerView = findViewById(R.id.Recycler2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Friends, R.color.category_Friends);
        Friends_recyclerView.setAdapter(contactAdapter);
    }
}