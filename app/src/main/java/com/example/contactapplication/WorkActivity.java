package com.example.contactapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> Work = new ArrayList<>();
        Work.add(new ContactModel("RDJ","2333459908","rdj@gmail.com",R.drawable.download));
        Work.add(new ContactModel("DS","9980231456","ds@gmail.com",R.drawable.download));
        Work.add(new ContactModel("TIH","9090881340","tih@gmail.com",R.drawable.download));
        Work.add(new ContactModel("CAP","9900123990","cap@gmail.com",R.drawable.download));
        Work.add(new ContactModel("BP","9994599801","bp@gmail.com",R.drawable.download));
        Work.add(new ContactModel("Thor","9988776655","thor@gmail.com",R.drawable.download));
        Work.add(new ContactModel("BWG","1234567890","bwg@gmail.com",R.drawable.download));
        Work.add(new ContactModel("AMW","9876543211","amw@gmail.com",R.drawable.download));
        Work.add(new ContactModel("Vision","9090909090","vision@gmail.com",R.drawable.download));
        Work.add(new ContactModel("AWM","9988123670","awm@gmail.com",R.drawable.download));

        RecyclerView Work_recyclerView = findViewById(R.id.Recycler3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,Work, R.color.category_Work);
        Work_recyclerView.setAdapter(contactAdapter);
    }
}