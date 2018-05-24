package edu.hanover.bcherbalremides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BritishDrinkCatagoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.british_activity_drink_catagory);
        ArrayAdapter<BritishTea> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, BritishTea.britainDrinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks3);
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
                        Intent intent = new Intent(BritishDrinkCatagoryActivity.this,
                                BritishDrinkActivity.class);
                        intent.putExtra(BritishDrinkActivity.EXTRA_DRINK_ID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}