package fr.ezeit.fsi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
 @GET("api_eleve") Call<ArrayList<Etudiant>> geteleve();
}
