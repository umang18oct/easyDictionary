package com.example.umang18oct.easydictionary21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DescriptionActivity extends AppCompatActivity {
    TextView word, meaning, antonyms, synonyms;
    Button goBack, history;
    String w,def,syn,ant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Intent intent = getIntent();
        w = intent.getExtras().getString("word");

        word = (TextView) findViewById(R.id.word);
        meaning = (TextView) findViewById(R.id.meaning);
        antonyms = (TextView) findViewById(R.id.antonyms);
        synonyms = (TextView) findViewById(R.id.synonyms);
        goBack = (Button) findViewById(R.id.goback);
        history = (Button) findViewById(R.id.history);

        word.setText(w);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("WORDS");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ant = dataSnapshot.child(w).child("Antonyms").getValue(String.class);
                syn = dataSnapshot.child(w).child("Synonyms").getValue(String.class);
                def = dataSnapshot.child(w).child("Definition").getValue(String.class);
                System.out.println("**********"+ant+"**********"+syn+"**********"+def);


                meaning.setText(def);
                antonyms.setText(ant);
                synonyms.setText(syn);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Toast.makeText(getApplicationContext(), "Unable to read data", Toast.LENGTH_LONG).show();
            }
        });


        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(j);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), HistoryActivity.class);
                startActivity(k);
            }
        });

    }
}
