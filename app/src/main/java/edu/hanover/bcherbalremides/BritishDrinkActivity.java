package edu.hanover.bcherbalremides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class BritishDrinkActivity extends Activity {
    public static final String EXTRA_DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_british_drink);

        //Get the drink from the intent
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINK_ID);
        BritishTea britishTea = BritishTea.britainDrinks[drinkId];

        //Populate the drink name
        TextView name2 = (TextView)findViewById(R.id.name3);
        name2.setText(britishTea.getName());

        //Populate the drink description
        TextView description2 = (TextView)findViewById(R.id.description3);
        description2.setText(britishTea.getDescription());

        //Populate the drink image
        ImageView photo2 = (ImageView)findViewById(R.id.photo3);
        photo2.setImageResource(britishTea.getImageResourceId());
        photo2.setContentDescription(britishTea.getName());
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DelayedMessageService.class);
        intent.putExtra(DelayedMessageService.EXTRA_MESSAGE,
                getResources().getString(R.string.response));
        startService(intent);
    }
}
