package com.example.tapesh.realmproject1;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button1,buttonretrieve;
    EditText editTextname,editTextemail,editTextaddress,editTextage;

    String name1,email1,address1;
    int age1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextname=(EditText)findViewById(R.id.editTextname);
        editTextemail=(EditText)findViewById(R.id.editTextemail);
        editTextaddress=(EditText)findViewById(R.id.editTextaddress);
        editTextage=(EditText)findViewById(R.id.editTextage);

        buttonretrieve=(Button)findViewById(R.id.buttonretrieve);
        button1=(Button)findViewById(R.id.button1);







        button1.setOnClickListener(this);
        buttonretrieve.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {

        Realm realm= Realm.getInstance(this);
       switch(v.getId()) {
           case R.id.button1:

               name1=editTextname.getText().toString();
               email1=editTextemail.getText().toString();
               address1=editTextaddress.getText().toString();
               try {
                   age1 = Integer.parseInt(editTextage.getText().toString());
               }catch (Exception e)
               {
                   Log.i("errror",e.toString());
               }

                Log.i("in the ","on click button1");


                realm.beginTransaction();
                Contect con = realm.createObject(Contect.class);
                con.setName(name1);
                con.setEmail(email1);
                con.setAddress(address1);
                con.setAge(age1);
                realm.commitTransaction();
              break;

           case R.id.buttonretrieve:
               RealmQuery<Contect> query=realm.where(Contect.class);
               query.greaterThan("age",20);
               RealmResults<Contect> results=query.findAll();
               Log.i("results",results.toString());


               break;




       }
       }
}
