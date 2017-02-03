package group14.brunel.recipme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static group14.brunel.recipme.R.id.buttonSave;

public class Register extends AppCompatActivity implements View.OnClickListener {
    //public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

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
        buttonSave = (Button) findViewById(R.id.buttonSave);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        //initializing views
        //(Add in the code if you want it to display the email address and what not
        //Logout button?

        buttonSave.setOnClickListener(this);

    }

    private void saveUserInformation(){

    String name = editTextName.getText().toString().trim();
    String add = editTextAddress.getText().toString().trim();

        UserInformation usernInformation = new UserInformation(name, add);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        databaseReference.child(user.getUid()).setValue(usernInformation);

        Toast.makeText(this, "Info Saved", Toast.LENGTH_LONG).show();

    }
    public void onClick (View v){
        if(v == buttonSave){
            saveUserInformation();

    }

    }

}