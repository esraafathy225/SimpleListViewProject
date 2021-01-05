package com.company.simplelistviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    ArrayList<String> names;

    GridView gridView;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView=findViewById(R.id.gridView);

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


        adapter=new ArrayAdapter<>(GridActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,names);

        gridView.setAdapter(adapter);



    }
}