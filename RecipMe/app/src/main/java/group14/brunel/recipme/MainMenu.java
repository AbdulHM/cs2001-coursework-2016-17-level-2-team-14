package group14.brunel.recipme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainMenu extends AppCompatActivity {

    private Button mSignOutBtn;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(MainMenu.this, Login.class));
                }
            }
        };

        mSignOutBtn = (Button) findViewById(R.id.sign_out);

        mSignOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)     {
                mAuth.signOut();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        mAuth.addAuthStateListener(mAuthListener);
    }

    public void StartSearch (View view) {
        Intent search = new Intent(this, Search.class);
        startActivity(search);
    }


    public void StartCuisines (View view) {
        Intent cuisines = new Intent(this, Profile.class);
//        startActivity(cuisines);
    }

    public void StartMyRecipes (View view) {
        Intent myRecipes = new Intent(this, Profile.class);
//        startActivity(myRecipes);
    }

    public void StartMyFavourites(View view) {
        Intent myFavourites = new Intent(this, Profile.class);
//        startActivity(myFavourites);
    }

    public void StartProfile (View view) {
        Intent profile = new Intent(this, Profile.class);
        startActivity(profile);
    }

    public void StartShoppingList (View view) {
        Intent shoppingList = new Intent(this, Profile.class);
//        startActivity(shoppingList);
    }



}
