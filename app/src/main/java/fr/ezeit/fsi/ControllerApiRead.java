package fr.ezeit.fsi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ControllerApiRead {

    private static final String url = "https://olen-ort.fr/P2023/SIO/BOUMALLASSA/phpmaster/phpmaster-main/src/api/";
    private static ControllerApiRead apiController;
    private static Retrofit retrofit;

    ControllerApiRead(){
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ControllerApiRead getInstance(){
        if (apiController == null){
            apiController = new ControllerApiRead();
        }
        return apiController;
    }

    public Api getApiEtudiant(){
        return retrofit.create(Api.class);
    }

}
