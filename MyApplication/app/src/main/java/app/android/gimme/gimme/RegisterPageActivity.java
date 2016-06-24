package app.android.gimme.gimme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
    }

    public void regRegisterClicked(View view){
        Intent homeScreenIntent = new Intent(getApplicationContext(), HomeScreenActivity.class);
        startActivity(homeScreenIntent);
    }
}
