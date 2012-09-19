package com.example.sqlite.second;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        DatabaseHandler db = new DatabaseHandler(this);
        
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Nathan", "8504098540985098"));
        db.addContact(new Contact("Theo", "54835438"));
        db.addContact(new Contact("Gracie", "543890809"));
        db.addContact(new Contact("Rik", "34554095435"));
        
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();
        
        for (Contact cn : contacts) {
        	String log = "Id: " + cn.getID()+ " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
        
        	Log.d("Name: ", log);
        }
    }
}
