package com.example.a11contactlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ListView ListView1;
    String[] mobilearray={"Kavya \n 0071027013","Niharika \n 9600000009","Archana M \n 7004698756","Varshitha \n 0171027013","Varsha \n 9620000009","Swathi \n 7858965756","Vidhya \n 0000027013","Pragna \n 9600120009","Raksha \n 7854000056"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.activity_listview,R.id.textView,mobilearray);
        ListView listView1=findViewById(R.id.list1);
        listView1.setAdapter(adapter);

    }
}