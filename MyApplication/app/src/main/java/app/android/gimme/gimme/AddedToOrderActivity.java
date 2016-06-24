package app.android.gimme.gimme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddedToOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_to_order);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClick(View view){
        switch (view.getId()){
            case (R.id.gimme_more_button):
                Intent goToHomeScreenActivity = new Intent(getApplicationContext(),HomeScreenActivity.class);
                startActivity(goToHomeScreenActivity);
                break;
            case (R.id.place_order_button):
                //Intent goToPlaceOrderActivity = new Intent(getApplicationContext(), PlaceOrderActivity.class);
                //startActivity(goToPlaceOrderActivity);
                break;
        }
    }
}
