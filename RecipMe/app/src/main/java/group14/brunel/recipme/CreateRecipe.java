package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class CreateRecipe extends AppCompatActivity {

    ArrayList<String> ingredientsList = null;
    ListView listy = null;

    private Button mFirebaseBtn;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_recipe);

        Spinner spin = (Spinner) findViewById(R.id.difficultySpin);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Difficulty,android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        mFirebaseBtn = (Button) findViewById(R.id.create_recipe_btn);

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
