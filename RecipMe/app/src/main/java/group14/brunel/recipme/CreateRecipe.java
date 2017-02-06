package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class CreateRecipe extends AppCompatActivity {

    ArrayList<String> ingredientsList = null;
    ListView listy = null;

    private Button mFirebaseBtn;
    private DatabaseReference mDatabase;
    private Firebase mRef;

    private String cuisineTitle = "Title";
    private String cuisineDescription = "Description";
    private String cuisineDifficulty = "Very easy";
    private int cookingTime = 10;
    private String ingredients[] = {"bread", "butter"};
    private String method[] = {"toast bread for 2 mins", "spread butter on the toast"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_recipe);
        Firebase.setAndroidContext(this);


        Spinner spin = (Spinner) findViewById(R.id.difficultySpin);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Difficulty,android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        mRef = new Firebase("https://recipme-6db76.firebaseio.com/created-recipes");
        mFirebaseBtn = (Button) findViewById(R.id.create_recipe_btn);

        mFirebaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild1 = mRef.child("Title");
                mRefChild1.setValue(cuisineTitle);

                Firebase mRefChild2 = mRef.child("Description");
                mRefChild2.setValue(cuisineDescription);

                Firebase mRefChild3 = mRef.child("Difficulty");
                mRefChild3.setValue(cuisineDifficulty);

                Firebase mRefChild4 = mRef.child("Cooking Time");
                mRefChild4.setValue(cookingTime);

                Firebase mRefChild5 = mRef.child("Ingredients");
                mRefChild5.setValue(ingredients);

                Firebase mRefChild6 = mRef.child("Method");
                mRefChild6.setValue(method);

            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference();


//        mFirebaseBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String recipe ;
//                mDatabase.push().setValue(recipe);
//            }
//        });




    }


}
