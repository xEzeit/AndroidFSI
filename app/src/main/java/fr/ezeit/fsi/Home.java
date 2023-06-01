package fr.ezeit.fsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Bouton qui permet d'envoyer vers la page (des informations personnelles) de l'utilisateur connectée.
        Button buttonHomeConfidentialInformations = (Button)findViewById(R.id.buttonHomeConfidentialInformations);
        buttonHomeConfidentialInformations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NavConfidentialInfo = new Intent(Home.this, ConfidentialInformationsActivity.class);
                //On s'en 34 IntentAddItem.putExtra("article", ListArticle);
                startActivity(NavConfidentialInfo);
            }
        });

        // Bouton qui permet d'envoyer vers la page (des notes) de l'utilisateur connectée.
        Button buttonHomeSchoolMark = (Button)findViewById(R.id.buttonHomeMySchoolMark);
        buttonHomeSchoolMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NavSchoolMark = new Intent(Home.this, SchoolMarkActivity.class);
                //On s'en 34 IntentAddItem.putExtra("article", ListArticle);
                startActivity(NavSchoolMark);
            }
        });

        // Bouton qui permet d'envoyer vers la page (des notes) de l'utilisateur connectée.
        Button buttonHomeDeco = (Button)findViewById(R.id.buttonLogOut);
        buttonHomeDeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NavSchoolMarkLogOut = new Intent(Home.this, MainActivity.class);
                //On s'en 34 IntentAddItem.putExtra("article", ListArticle);
                startActivity(NavSchoolMarkLogOut);
            }
        });

    }
}