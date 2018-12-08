package com.example.vmfld.moneyshare;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DivideApi {

    String DivideUrl = "http://13.209.5.124:3000/";

    @POST("api/devide/money")
    Call<DivideData> getDivideData(@Query("roomid") Integer roomid);

}
