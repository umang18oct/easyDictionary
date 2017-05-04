package com.example.umang18oct.easydictionary21;

/**
 * Created by umang18oct on 28-04-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//add dependencies to your class
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.R.attr.name;


public class DictionaryActivity extends AppCompatActivity {
    TextView word, meaning, antonyms, synonyms;
    Button goBack, history;
    String w,def,syn,ant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        w = intent.getExtras().getString("word").trim().replaceAll("\n", "").trim();
        w=w.toLowerCase();

        word = (TextView) findViewById(R.id.word);
        meaning = (TextView) findViewById(R.id.meaning);
        antonyms = (TextView) findViewById(R.id.antonyms);
        synonyms = (TextView) findViewById(R.id.synonyms);
        goBack = (Button) findViewById(R.id.goback);
        history = (Button) findViewById(R.id.history);

        word.setText(w);

        new CallbackTask().execute(dictionaryEntries1(), dictionaryEntries2());

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

    private String dictionaryEntries1() {
        final String language = "en";
        final String word = w;
        final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id;
    }

    private String dictionaryEntries2() {
        final String language = "en";
        final String word = w;
        final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id + "/synonyms;antonyms";
    }

    private String dictionaryEntries3() {
        Intent intent = getIntent();
        String w = intent.getExtras().getString("word");
        final String language = "en";
        final String word = w;
        final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id;
    }


    //in android calling network requests on the main thread forbidden by default
    //create class to do async job
    private class CallbackTask extends AsyncTask<String, Integer, String[]> {

        @Override
        protected String[] doInBackground(String... params) {

            //TODO: replace with your own app id and app key
            final String app_id = "2ce75fa7";
            final String app_key = "3c31898c205c456693eb5915701ae25c";
            String[] sb = new String[2];
            try {
                URL url = new URL(params[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                urlConnection.setRequestProperty("Accept", "application/json");
                urlConnection.setRequestProperty("app_id", app_id);
                urlConnection.setRequestProperty("app_key", app_key);

                // read the output from the server
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));


                String line = null;
                String res = "";
                while ((line = reader.readLine()) != null) {
                    res += line + "\n";
                }
                reader.close();
                sb[0] = res;

                //return sb[0].toString();
                System.out.println(params[1]);
                url = new URL(params[1]);
                urlConnection = (HttpsURLConnection) url.openConnection();
                urlConnection.setRequestProperty("Accept", "application/json");
                urlConnection.setRequestProperty("app_id", app_id);
                urlConnection.setRequestProperty("app_key", app_key);
                System.out.println(urlConnection.getResponseCode() + " : " + urlConnection.getResponseMessage());
                // read the output from the server
                reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

                line = null;
                String res2 = "";
                while ((line = reader.readLine()) != null) {
                    res2 += line + "\n";
                }
                reader.close();
                sb[1] = res2;

                //return sb[1].toString();
                return sb;
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "Sorry no data found online :/",Toast.LENGTH_LONG).show();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String[] result) {
            try {
            super.onPostExecute(result);


                JSONObject jObject = new JSONObject(result[0]);
                def = jObject.getJSONArray("results").getJSONObject(0)
                        .getJSONArray("lexicalEntries").getJSONObject(0)
                        .getJSONArray("entries").getJSONObject(0)
                        .getJSONArray("senses").getJSONObject(0)
                        .getJSONArray("definitions").getString(0);
                System.out.println("definition = " + def);
                meaning.setText(def);

            } catch (NullPointerException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "Sorry no data found online :/",Toast.LENGTH_LONG).show();
            }
            catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "No definition found :/",Toast.LENGTH_LONG).show();
            }

            //System.out.println(result[0]);
            try {
                JSONObject jObject = new JSONObject(result[1]);
                JSONObject oObject = jObject.getJSONArray("results").getJSONObject(0)
                        .getJSONArray("lexicalEntries").getJSONObject(0)
                        .getJSONArray("entries").getJSONObject(0)
                        .getJSONArray("senses").getJSONObject(0);

                ant="";
                JSONArray arr1 = oObject.getJSONArray("antonyms");
                for(int i=0;i<arr1.length();i++){
                    ant +=oObject.getJSONArray("antonyms").getJSONObject(i).getString("text") +  ", ";
                }

                System.out.println("antonyms = " + ant);
                antonyms.setText(ant);


            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "No antonym found :/",Toast.LENGTH_LONG).show();
            }
            try {
                JSONObject jObject = new JSONObject(result[1]);
                JSONObject oObject = jObject.getJSONArray("results").getJSONObject(0)
                        .getJSONArray("lexicalEntries").getJSONObject(0)
                        .getJSONArray("entries").getJSONObject(0)
                        .getJSONArray("senses").getJSONObject(0);

                syn = "";
                JSONArray arr2 = oObject.getJSONArray("synonyms");
                for(int i=0;i<arr2.length();i++){
                    syn +=oObject.getJSONArray("synonyms").getJSONObject(i).getString("text") +  ", ";
                }

                System.out.println("synonyms = " + syn);
                synonyms.setText(syn);

            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "No synonym found :/",Toast.LENGTH_LONG).show();
            }

            System.out.println(result[1]);
            // Write a message to the database
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("WORDS");

            DatabaseReference wordRef = myRef.child(w);

            Map<String, String> wordData = new HashMap<String, String>();
            wordData.put("Definition", def);
            wordData.put("Synonyms", syn);
            wordData.put("Antonyms", ant);
            wordRef.setValue(wordData);
        }
    }
}


