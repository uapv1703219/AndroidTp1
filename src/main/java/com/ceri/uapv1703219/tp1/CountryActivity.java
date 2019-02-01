package com.ceri.uapv1703219.tp1;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        Country country = CountryList.getCountry(getIntent().getStringExtra("country"));

    final TextView countrynametext = findViewById(R.id.countryname);
    final String countryname = getIntent().getStringExtra("country");
    countrynametext.setText(countryname);

    final EditText editcapitale = findViewById(R.id.editCapital);
    final String capitalname = country.getmCapital();
    editcapitale.setText(capitalname);

    final EditText editlanguage = findViewById(R.id.editlanguage);
    final String language = country.getmLanguage();
    editlanguage.setText(language);

    final EditText editmonnaie = findViewById(R.id.editmonnaie);
    final String monnaie = country.getmCurrency();
    editmonnaie.setText(monnaie);

    final EditText editpopulation = findViewById(R.id.editpopulation);
    final String population =  Integer.toString(country.getmPopulation());
    editpopulation.setText(population);

    final EditText editsuperficie = findViewById(R.id.editsuperficie);
    final String superficie =  Integer.toString(country.getmArea());
    editsuperficie.setText(superficie);

    final ImageView imageview = findViewById(R.id.countryflag);
    int id = getResources().getIdentifier("@drawable/" + country.getmImgFile() , null, null);
    imageview.setImageResource(id);


    }
}
