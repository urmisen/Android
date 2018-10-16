package com.example.user.bookaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HiistoryActivity extends AppCompatActivity {
    private static ListView list_view;
    private static String[] BOOKS = new String[]{"1776", "The Rise And fall of The Third Reich", "The Guns of August", "The Diary of a Young","The Selfish Gene", "Guns,Germs and Steel", "The Demon-Haunted", "The God Delusion", "Surely YOU're Joking","The Origin of Species", "The Man Who Mistook His Wife for a Hat and Other Clinical Tales", "The Demon-Haunted", "The God Delusion"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiistory);
        list_view=(ListView) findViewById(R.id.listView);
        listView();
    }
    public void listView(){
        list_view=(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.books,BOOKS);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String value=(String) list_view.getItemAtPosition(position);
                        Toast.makeText(HiistoryActivity.this,"Position :"+ position + "value :"+ value,Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            Intent myintent = new Intent(view.getContext(), QuizActivity.class);
                            startActivityForResult(myintent, 0);
                        }
                        if (position == 1) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 2) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 3) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 4) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 5) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 6) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 7) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 8) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }
                        if (position == 9) {
                            Toast.makeText(HiistoryActivity.this,"Position :"+ position + "OOPS! Still Under Construction "+ value,Toast.LENGTH_LONG).show();
                        }


                    }
                });

    }
}
