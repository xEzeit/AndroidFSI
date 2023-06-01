package fr.ezeit.fsi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiBilan {
    @GET("api_bilan_1") Call<ArrayList<Bilan>> getbilan();
}
