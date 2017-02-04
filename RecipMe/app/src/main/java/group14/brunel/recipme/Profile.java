package group14.brunel.recipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by deepali on 02/02/2017.
 */

public class Profile extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    final EditText editName = (EditText)findViewById(R.id.aboutField);
    final TextView displayText = (TextView)findViewById(R.id.aboutField);



}