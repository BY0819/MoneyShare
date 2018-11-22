package com.example.vmfld.moneyshare;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DivideListAdapter  extends BaseAdapter {

    private Context context;
    private List<DivideData> DivideDataList;

    public DivideListAdapter(Context context, List<DivideData> divideDataList) {
        this.context = context;
        DivideDataList = divideDataList;
    }

    @Override
    public int getCount() {
        return DivideDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return DivideDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context, android.R.layout.list_content, null);

        TextView nameText = (TextView) v.findViewById(R.id.str_i_name);
        TextView publicText = (TextView) v.findViewById(R.id.str_i_public);
        TextView privateText = (TextView) v.findViewById(R.id.str_i_private);
        TextView leftText = (TextView) v.findViewById(R.id.str_i_left);
        TextView publicPriceText = (TextView) v.findViewById(R.id.str_i_publicprice);
        TextView privatePriceText = (TextView) v.findViewById(R.id.str_i_privateprice);
        TextView leftPriceText = (TextView) v.findViewById(R.id.str_i_leftprice);

        nameText.setText(DivideDataList.get(position).getName());
        publicText.setText("공금 사용 금액");
        privateText.setText("개인 사용 금액");
        leftText.setText(DivideDataList.get(position).getLeftmoney());
        publicPriceText.setText(DivideDataList.get(position).getPublicused());
        privatePriceText.setText(DivideDataList.get(position).getPersonalused());
        leftPriceText.setText(DivideDataList.get(position).getLeftmoney());

        v.setTag(DivideDataList.get(position).getClass());
        return v;
    }
}
