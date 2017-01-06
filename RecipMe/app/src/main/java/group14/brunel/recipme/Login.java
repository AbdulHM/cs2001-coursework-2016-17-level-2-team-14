package group14.brunel.recipme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by jayalam on 06/01/2017.
 */

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LoginButton (View view) {
        EditText editTextUsername = (EditText) findViewById(R.id.login_username);
        String username = editTextUsername.getText().toString();

        EditText editTextPassword = (EditText) findViewById(R.id.login_password);
        String password = editTextPassword.getText().toString();

        // Check to see if the method retrieves the data from the editText
        Log.v("Login", username + " " + password);

        Intent menu = new Intent(this,
                MainMenu.class);
        startActivity(menu);
    }

    public void CreateAccount (View view) {
        Intent register = new Intent(this,
                Register.class);
        startActivity(register);
    }


}