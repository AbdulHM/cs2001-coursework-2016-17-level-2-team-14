package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

/**
 * Created by jayalam on 06/02/2017.
 */

public class Home extends AppCompatActivity {


    private ActionBarDrawerToggle mToggle;

    private Toolbar mToolbar;

    private DrawerLayout mDrawerLayout;
    private String[] mMenuTitles;
    public ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_menu);

//        mMenuTitles = getResources().getStringArray(R.array.menu_array);
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout;
//        mDrawerList = (ListView) findViewById(R.id.left_drawer);
//
//        // Set the adapter for the list view
//        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
//                R.layout.drawer_list_item, mMenuTitles));
//        // Set the list's click listener
//        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
//
//
////        mToolbar = (Toolbar) findViewById(R.id.nav_action);
////        setSupportActionBar(mToolbar);
//
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
//
//        mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        if(mToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    public void onClickListener(String id){
//
//    }


}
