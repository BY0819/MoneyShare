package com.example.vmfld.moneyshare;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonArray;

import org.w3c.dom.Text;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DivideActivity extends AppCompatActivity {

    private ListView DivideDataListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        DivideDataListView = (ListView)findViewById(R.id.divideListView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Create BackButton
        getSupportActionBar().setDisplayShowTitleEnabled(false); // Remove Real Title


        Retrofit divideretrofit = new Retrofit.Builder()
            .baseUrl(DivideApi.DivideUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

         final DivideApi divideApi = divideretrofit.create(DivideApi.class);
         Call<DivideData> call = divideApi.getDivideData(1);
         call.enqueue(new Callback<DivideData>() {
             @Override
             public void onResponse(Call<DivideData> call, Response<DivideData> response) {

                 Log.e("서버성공",response.message().toString());

                 DivideListAdapter divideListAdapter = new DivideListAdapter();

                 DivideData divideData = response.body();

                 TextView str_i_totalleft = (TextView)findViewById(R.id.str_i_totalleft);
                 str_i_totalleft.setText(divideData.getstrTotalLeft());

                 for(int i = 0; i<divideData.getMemnum();i++){
                     divideListAdapter.addItem(
                             divideData.getResult(),
                             divideData.getPublicUsed(),
                             divideData.getTotalleft(),
                             divideData.getDPSData(),
                             i);
                 }

                 DivideDataListView.setAdapter(divideListAdapter);

             }

             @Override
             public void onFailure(Call<DivideData> call, Throwable t) {
                Log.e("서버오류",t.getMessage());
             }
         });


                    // DivideListAdapter divideListAdapter = new DivideListAdapter();



                    // int[] personalusedlist = {3000,27000,0};
                    // int personaltotalused = 0;
                    // int memnum = personalusedlist.length;

                    // for(int i = 0; i< personalusedlist.length; i++){
                    //     personaltotalused = personaltotalused +personalusedlist[i];
                    // }

                    // divideListAdapter.addItem("김유빈", 27000,150000,90000, personaltotalused,memnum);
                    // divideListAdapter.addItem("유지현", 3000,150000,90000, personaltotalused,memnum);
                    // divideListAdapter.addItem("안아영", 0,150000,90000, personaltotalused,memnum);


                    // TextView str_i_totalleft = (TextView)findViewById(R.id.str_i_totalleft);
                    // str_i_totalleft.setText("90,000");

                    // DivideDataListView.setAdapter(divideListAdapter);


    }


}
