package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class CreateRecipe extends AppCompatActivity {

    ArrayList<String> ingredientsList = null;
    ListView listy = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_recipe);

        Spinner spin = (Spinner) findViewById(R.id.difficultySpin);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Difficulty,android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);


    }


}
