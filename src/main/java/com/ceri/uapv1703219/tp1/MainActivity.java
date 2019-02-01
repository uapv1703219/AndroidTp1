package com.ceri.uapv1703219.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listview = findViewById(R.id.listCountry);
        final ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, CountryList.getNameArray());
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String item =(String) parent.getItemAtPosition(position);
                //Toast.makeText(MainActivity.this, "You selected " + item, Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(MainActivity.this, CountryActivity.class);
                myIntent.putExtra("country", item);
                startActivity(myIntent);
            }
        });
    }


}
