package com.example.vmfld.moneyshare;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class individualMoney extends Fragment {

    private ListView m_oListView;

    public individualMoney() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int nDatCnt = 0;

        String[] strDate = {"10/01","10/02","10/03","10/04","10/05","10/06"};

        ArrayList<IndividualItemData> oData = new ArrayList<>();

        for(int i=0; i<20; ++i)
        {
            IndividualItemData oItem = new IndividualItemData();
            oItem.strDate = strDate[nDatCnt++];
            oItem.strName = "아영";
            oItem.strUse1 = "치킨";
            oItem.strUse2 = "피자" ;
            oItem.strPrice1 = "20,000";
            oItem.strPrice2 = "30,000";

            if(nDatCnt >= strDate.length) nDatCnt = 0;
        }


        View rootView = inflater.inflate(R.layout.fragment_individual_money, container, false);
        m_oListView = (ListView) rootView.findViewById(R.id.indiv_list);
       IndividualListAdapter oAdpter =new IndividualListAdapter(oData);
       m_oListView.setAdapter(oAdpter);



        return rootView;
    }

}
