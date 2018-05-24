package edu.hanover.bcherbalremides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChineseDrinkCatagoryActivity extends Activity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_activity_drink_catagory);
        ArrayAdapter<ChineseTea> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, ChineseTea.chinaDrinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks2);
        listDrinks.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(ChineseDrinkCatagoryActivity.this,
                                ChineseDrinkActivity.class);
                        intent.putExtra(ChineseDrinkActivity.EXTRA_DRINK_ID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
