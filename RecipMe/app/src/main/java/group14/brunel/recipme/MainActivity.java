package group14.brunel.recipme;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
<<<<<<< HEAD

=======
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;
>>>>>>> 7241b9e7476d142d4fa015b2fbf1ce576ec834d5
public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        ListView lv = (ListView)findViewById(R.id.listViewRecipe);
//        ArrayList<String> arrayRecipes = new ArrayList<>();
//        arrayRecipes.addAll(Arrays.asList(getResources().getStringArray(R.array.array_recipe)));
//
//        adapter = new ArrayAdapter<>(
//                MainActivity.this,
//                android.R.layout.simple_list_item_1,
//                arrayRecipes);
//        lv.setAdapter(adapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_search, menu);
//        MenuItem item = menu.findItem(R.id.menuSearch);
//        SearchView searchView = (SearchView)item.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter.getFilter().filter(newText);
//
//                return false;
//            }
//        });
//
//
//        return super.onCreateOptionsMenu(menu);
//    }
}

