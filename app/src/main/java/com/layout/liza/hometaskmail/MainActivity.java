package com.layout.liza.hometaskmail;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static List<Mail> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        initializeData();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(persons);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

    }


    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Mail("Emma Wilson", R.drawable.people, "How about to have a walk?", "Hi, how are you? Could you please tell me ehwn you'll be free", false, new Time(14, 30, 00), false));
        persons.add(new Mail("Lavery Maiss", R.drawable.user, "How about to have a walk?", "Hi, how are you? Could you please tell me ehwn you'll be free", true, new Time(14, 30, 00), false));
        persons.add(new Mail("Alex Hiker", R.drawable.user_1, "How about to have a walk?", "Hi, how are you? Could you please tell me ehwn you'll be free", false, new Time(14, 30, 00), true));
        persons.add(new Mail("Emma Wilson", R.drawable.user_2, "How about to have a walk?", "Hi, how are you? Could you please tell me ehwn you'll be free", true, new Time(14, 30, 00), false));
        persons.add(new Mail("Lillie Watts", R.drawable.user_3, "How about to have a walk?", "Hi, how are you? Could you please tell me ehwn you'll be free", false, new Time(14, 30, 00), false));
    }

}

