package com.example.contactapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> Family = new ArrayList<>();
        Family.add(new ContactModel("Father","9741473667","father@gmail.com",R.drawable.download));
        Family.add(new ContactModel("Mother","9845731305","mother@gmail.com",R.drawable.download));
        Family.add(new ContactModel("Brother","9835372547","brother@gmail.com",R.drawable.download));
        Family.add(new ContactModel("Sister","9836453620","sister@gmail.com",R.drawable.download));
        Family.add(new ContactModel("Uncle","9834819300","uncle@gmail.com",R.drawable.download));
        Family.add(new ContactModel("Aunt","9965397122","aunt@gmail.com",R.drawable.download));
        Family.add(new ContactModel("GrandFather","7698990012","grandfather@gmail.com",R.drawable.download));
        Family.add(new ContactModel("GrandMother","7799001234","grandmother@gmail.com",R.drawable.download));
        Family.add(new ContactModel("CousinBrother","9900449801","cousinb@gmail.com",R.drawable.download));
        Family.add(new ContactModel("CousinSister","9090876577","cousins@gmail.com",R.drawable.download));

        RecyclerView Family_recyclerView = findViewById(R.id.Recycler1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Family, R.color.category_Family);
        Family_recyclerView.setAdapter(contactAdapter);
    }
}