package com.company.simplelistviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> names;
    ListView listView;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list1);

        names=new ArrayList<>();

        names.add("Justin Mathews");
        names.add("Myla Micheal");
        names.add("Celia Ware");
        names.add("Stella Carter");
        names.add("Wendy Anthony");
        names.add("Agustin Casey");
        names.add("Carina Benson");
        names.add("Isaac Gonzales");
        names.add("Jagger Mills");
        names.add("Sofia Bush");

        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,names);

        listView.setAdapter(adapter);

    }

}