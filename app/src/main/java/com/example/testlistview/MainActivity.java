package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
	ListView lvFrutas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvFrutas = findViewById(R.id.list_view);
		
		final ArrayList<String> lista_frutinhas = new ArrayList<>();
		
		lista_frutinhas.add("maca");
		lista_frutinhas.add("pera");
		lista_frutinhas.add("uva");
		lista_frutinhas.add("melancia");
		lista_frutinhas.add("melao");
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
				android.R.layout.simple_list_item_1,
				android.R.id.text1,
				lista_frutinhas);
		lvFrutas.setAdapter(adapter);
		lvFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MainActivity.this, lista_frutinhas.get(position), Toast.LENGTH_LONG).show();
				Intent intent = new Intent(MainActivity.this, ComponentView.class);
				startActivity(intent);
			}
		});
	}
}
