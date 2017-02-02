package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

/**
 * Created by jayalam on 26/01/2017.
 */

public class Profile extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

    }

//        getActionBar().setDisplayShowTitleEnabled(false);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        ListView lv = (ListView)findViewById(R.id.listViewRecipe);
//        ArrayList<String> arrayRecipes = new ArrayList<>();
//        arrayRecipes.addAll(Arrays.asList(getResources().getStringArray(R.array.array_recipe)));
//
//        adapter = new ArrayAdapter<>(
//                Profile.this,
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
