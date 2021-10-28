package com.example.modul2_kel27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DataMahasiswa extends AppCompatActivity {

    ListView listView;
    String NamaNim[] = {
            "Farrel Ahmad Yudithia- 21120119130067",
            "Muhammad Yafi Alhakim - 21120119130064",
            "Muhammad Farizan Kholis- 21120119130090",
            "Elmar Leonard - 21120119140145"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                NamaNim);
        listView.setAdapter(adapter);

    }
}