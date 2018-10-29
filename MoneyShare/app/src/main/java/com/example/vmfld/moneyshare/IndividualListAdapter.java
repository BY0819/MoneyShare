package com.example.vmfld.moneyshare;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class IndividualListAdapter  extends BaseAdapter {
    LayoutInflater inflater = null;
    private ArrayList<IndividualItemData> m_oData = null;
    private int nListCnt = 0;


    public IndividualListAdapter(ArrayList<IndividualItemData> _oData)
    {
        m_oData = _oData;
        nListCnt = m_oData.size();
    }

    @Override
    public int getCount()
    {
        Log.i("TAG", "getCount");
        return nListCnt;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            final Context context = parent.getContext();
            if(inflater == null)
            {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.mem_listview_item, parent, false);

        }
        TextView oTextDate = (TextView) convertView.findViewById(R.id.str_i_date);
        TextView oTextName = (TextView) convertView.findViewById(R.id.str_i_name);
        TextView oTextUse1 = (TextView) convertView.findViewById(R.id.str_i_use1);
        TextView oTextUse2 = (TextView) convertView.findViewById(R.id.str_i_use2);
        TextView oTextPrice1= (TextView) convertView.findViewById(R.id.str_i_price1);
        TextView oTextPrice2 = (TextView) convertView.findViewById(R.id.str_i_price2);


        oTextDate.setText(m_oData.get(position).strDate);
        oTextName.setText(m_oData.get(position).strName);
        oTextUse1.setText(m_oData.get(position).strUse1);
        oTextUse2.setText(m_oData.get(position).strUse2);
        oTextPrice1.setText(m_oData.get(position).strPrice1);
        oTextPrice2.setText(m_oData.get(position).strPrice2);


        return convertView;
    }
}
