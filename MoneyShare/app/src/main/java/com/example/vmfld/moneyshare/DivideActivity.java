package com.example.vmfld.moneyshare;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DivideActivity extends AppCompatActivity {

    private ListView DivideDataListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        DivideDataListView = (ListView)findViewById(R.id.divideListView);

        dataSetting();

    }

    private void dataSetting(){

        DivideListAdapter divideListAdapter = new DivideListAdapter();

        int[] personalusedlist = {3000,27000,0};
        int personaltotalused = 0;
        int memnum = personalusedlist.length;
        for(int i = 0; i< personalusedlist.length; i++){
            personaltotalused = personaltotalused +personalusedlist[i];
        }

        divideListAdapter.addItem("김유빈", 27000,450000,90000, personaltotalused,memnum);
        divideListAdapter.addItem("유지현", 3000,450000,90000, personaltotalused,memnum);
        divideListAdapter.addItem("안아영", 0,450000,90000, personaltotalused,memnum);


        TextView str_i_totalleft = (TextView)findViewById(R.id.str_i_totalleft);
        str_i_totalleft.setText(Integer.toString(90000));

        DivideDataListView.setAdapter(divideListAdapter);
    }
}
