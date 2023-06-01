package fr.ezeit.fsi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiBilan2 {
    @GET("api_bilan_2") Call<ArrayList<Bilan2>> getbilan_2();
}
