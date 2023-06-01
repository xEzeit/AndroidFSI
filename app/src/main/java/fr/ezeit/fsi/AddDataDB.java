package fr.ezeit.fsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.sqlite.core.DB;

import fr.ezeit.fsi.SQLite.DBHelper;

public class AddDataDB extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_db);

        EditText DataUser = (EditText) findViewById(R.id.EditTextAddDataDBUser);
        EditText DataPassword = (EditText) findViewById(R.id.EditTextAddDataDBPassword);


    }
}