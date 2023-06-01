package fr.ezeit.fsi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.sqlite.SQLiteConnection;

import fr.ezeit.fsi.SQLite.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Permet de faire appel à la bdd
        DBHelper sqLiteManager;
        sqLiteManager = new DBHelper(MainActivity.this);

        /*Boolean insert = sqLiteManager.insertData("marine","lol");
        if(insert == true){
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
        } else {
            insert = false;
        }*/

        // Fait le lien avec les boutons de UI Android.
        EditText DataUser = (EditText) findViewById(R.id.editTextConnectionLogin);
        EditText DataPassword = (EditText) findViewById(R.id.editTextConnectionPassword);

        // Fait le lien avec le bouton connexion de UI.
        Button buttonConnection = (Button)findViewById(R.id.buttonConnection);
        buttonConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Permet de convertir les EditText en String.
                 user = DataUser.getText().toString();
                 pass = DataPassword.getText().toString();

                 //Fait appel à la fonction dans DBHelper qui permet de vérifier le mot de passe.
                Boolean checkcredentials = sqLiteManager.checkusernamepassword(user, pass);
                if(checkcredentials == true){

                    //Intent vers page d'accueil si utilisateur + mot de passe correct.
                    Intent Navhome = new Intent(MainActivity.this, Home.class);
                    Toast.makeText(MainActivity.this, "Authentification reussite :)", Toast.LENGTH_LONG).show();
                    startActivity(Navhome);
                } else {
                    Toast.makeText(MainActivity.this, "Authentification Echouée :(", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    // variable correspondant à l'utlisateur et le mot de passe pour la connexion à la bdd SQLite.
    private String user;
    private String pass;
}