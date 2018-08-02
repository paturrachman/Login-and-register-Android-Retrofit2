package com.example.alienware18.login.apihelper;

import retrofit2.Retrofit;
/*https://comeliest-adaptions.000webhostapp.com/*/
public class UtilsApi {
    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API = "https://retro2.000webhostapp.com/login_android/Login/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
