package com.a134.anhlt.androidautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textFullName;
    private AutoCompleteTextView textCountries;
    private MultiAutoCompleteTextView textLanguage;
    private Button button;
    private String[] countries =   {"Vietnam","England","Canada","France","Australia"};
    private String[] language = {"Java","C#","Visual Basic","Swift","Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            textFullName = (EditText) findViewById(R.id.editText);
            textCountries = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
            textLanguage = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
            button = (Button) findViewById(R.id.button);
        ArrayAdapter adapterCountries = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        textCountries.setAdapter(adapterCountries);
        //Set minium character to show suggestion
        textCountries.setThreshold(1);

        ArrayAdapter adapterLanguage = new ArrayAdapter(this, android.R.layout.simple_list_item_1, language);
        textLanguage.setAdapter(adapterLanguage);
        textLanguage.setThreshold(1);
        textLanguage.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                submitForm();
            }
        });

    }
    private void submitForm() {
        String text="Fullname: "+ this.textFullName.getText().toString()
                +"\nCountry: "+ this.textCountries.getText().toString()
                +"\nLanguages: "+ this.textLanguage.getText().toString();
        Toast.makeText(this, text,Toast.LENGTH_LONG).show();
    }
}
