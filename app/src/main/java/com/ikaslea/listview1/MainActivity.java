package com.ikaslea.listview1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listav;
    String[] s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = getResources().getStringArray(R.array.OpcionesLista);


        listav = (ListView) findViewById(R.id.listView1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, s);
        listav.setAdapter(adapter);

        listav.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.e("La opción elegida es ", s[position]);
            }
        });

    }

    }