package fr.ezeit.fsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import fr.ezeit.fsi.Etudiant;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SchoolMarkActivity extends AppCompatActivity {

    ListView bilan1;
    ListView bilan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_mark);

            bilan1 = (ListView) findViewById(R.id.ListViewSchoolMarkBilan1Contenu);
            bilan2 = (ListView) findViewById(R.id.ListViewSchoolMarkBilan2Contenu);

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
                }

                @Override
                public void onFailure(Call<ArrayList<Etudiant>> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                    System.out.println(t);
                }
            });
        }
}