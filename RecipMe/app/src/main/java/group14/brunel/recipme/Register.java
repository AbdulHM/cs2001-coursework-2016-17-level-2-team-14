package group14.brunel.recipme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    private TextView textViewUserEmail;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private DatabaseReference databaseReference;
    //This lets us store data in firebase

    private EditText editTextName, editTextAddress;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initializing firebase authentication object
        firebaseAuth = FirebaseAuth.getInstance();

        //If the user is not logged in
        //That means current usr will return null
        if (firebaseAuth.getCurrentUser() ==null) {
            //Closing this activity
            finish();
            //Starting Login Activity
            startActivity(new Intent(this, Login.class));
        }

        databaseReference = FirebaseDatabase.getInstance().getReference();

        editTextAddress = (EditText) findViewById(R.id.register_email);
        editTextName = (EditText) findViewById(R.id.register_username);
        buttonSave = (Button) findViewById(R.id.register_button);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        //initializing views
        //(Add in the code if you want it to display the email address and what not
    }

}
