package fr.ezeit.fsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfidentialInformationsActivity extends AppCompatActivity{

    TextView firstname;
    TextView lastname;
    TextView age;
    TextView post;
    TextView email;
    TextView classe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confidential_informations);

        firstname = (TextView) findViewById(R.id.textViewCIFirstName);
        lastname = (TextView) findViewById(R.id.textViewCILastName);
        age = (TextView) findViewById(R.id.textViewCIYears);
        post = (TextView) findViewById(R.id.textViewCIAddress);
        email = (TextView) findViewById(R.id.textViewCIEmail);
        classe = (TextView) findViewById(R.id.textViewCICIass);

        CallAPI();
    }

    private void CallAPI(){
        Call<ArrayList<Etudiant>> call = ControllerApiRead
                .getInstance()
                .getApiEtudiant()
                .geteleve();

        call.enqueue(new Callback<ArrayList<Etudiant>>() {
            @Override
            public void onResponse(Call<ArrayList<Etudiant>> call, Response<ArrayList<Etudiant>> response) {
                ArrayList<Etudiant> etudiant;
                etudiant = response.body();
                firstname.setText(etudiant.get(0).getPre_etu());
                /*lastname.setText(etudiant.getNom_etu());
                age.setText(etudiant.getNom_etu());
                post.setText(etudiant.getNom_etu());
                email.setText(etudiant.getNom_etu());
                classe.setText(etudiant.getNom_etu());*/
            }

            @Override
            public void onFailure(Call<ArrayList<Etudiant>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t);
            }
        });
    }

}