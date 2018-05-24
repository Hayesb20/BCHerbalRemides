package edu.hanover.bcherbalremides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ChineseDrinkActivity extends Activity {
    public static final String EXTRA_DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_drink);

        //Get the drink from the intent
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINK_ID);
        ChineseTea chinaDrink = ChineseTea.chinaDrinks[drinkId];

        //Populate the drink name
        TextView name1 = (TextView)findViewById(R.id.name1);
        name1.setText(chinaDrink.getName());

        //Populate the drink description
        TextView description1 = (TextView)findViewById(R.id.description1);
        description1.setText(chinaDrink.getDescription());

        //Populate the drink image
        ImageView photo1 = (ImageView)findViewById(R.id.photo1);
        photo1.setImageResource(chinaDrink.getImageResourceId());
        photo1.setContentDescription(chinaDrink.getName());
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DelayedMessageService.class);
        intent.putExtra(DelayedMessageService.EXTRA_MESSAGE,
                getResources().getString(R.string.response));
        startService(intent);
    }
}