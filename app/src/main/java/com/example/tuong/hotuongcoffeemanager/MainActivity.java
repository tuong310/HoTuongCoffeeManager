package com.example.tuong.hotuongcoffeemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.tuong.ardapter.AdapterCoffeeTable;
import com.example.tuong.model.coffeeTable;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView activity_main_lvCoffeeTable;
    ArrayList<coffeeTable> ArrayListCoffeeTable;
    AdapterCoffeeTable adapterCoffeeTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        activity_main_lvCoffeeTable = findViewById(R.id.activity_main_lvCoffee);
        ArrayListCoffeeTable = new ArrayList<>();

        ArrayListCoffeeTable.add(new coffeeTable("Bàn 1",true, false,false,false));
        ArrayListCoffeeTable.add(new coffeeTable("Bàn 2",false,true, false,false));
        ArrayListCoffeeTable.add(new coffeeTable("Bàn 3",false,false,true, false));
        ArrayListCoffeeTable.add(new coffeeTable("Bàn 4",false,false,false,true));

        adapterCoffeeTable = new AdapterCoffeeTable(MainActivity.this,R.layout.items,ArrayListCoffeeTable);
        activity_main_lvCoffeeTable.setAdapter(adapterCoffeeTable);
    }

    private void addEvents() {

    }
}
