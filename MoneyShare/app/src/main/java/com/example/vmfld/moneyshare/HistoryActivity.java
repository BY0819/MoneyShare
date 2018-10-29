package com.example.vmfld.moneyshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private ListView m_oListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Create BackButton
        getSupportActionBar().setDisplayShowTitleEnabled(false); // Remove Real Title

        //데이터 임의 생성

        String[] strDate = {"10/03","10/05","10/12","10/17","10/23","10/28"};

        int nDatCnt = 0;

        ArrayList<HistoryItemData> oData = new ArrayList<>();

        for(int i=0; i<20; ++i)
            {
            HistoryItemData oItem = new HistoryItemData();
            oItem.strDate = strDate[nDatCnt++];
            oItem.strTotal = "20,000" ;
            oData.add(oItem);

            if(nDatCnt >= strDate.length) nDatCnt = 0;
        }

        m_oListView = (ListView) findViewById(R.id.history_listview);
        HistoryListAdapter oAdapter = new HistoryListAdapter(oData);
        m_oListView.setAdapter(oAdapter);
    }


}
