package com.example.vmfld.moneyshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ManageMoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_money);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Create BackButton
        getSupportActionBar().setDisplayShowTitleEnabled(false); // Remove Real Title

        final Button btn_addMoney = (Button) findViewById(R.id.btn_addMoney);
        final Button btn_subMoney = (Button) findViewById(R.id.btn_subMoney);

        btn_addMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    btn_addMoney.setBackgroundResource(R.color.MainColor);
                    btn_subMoney.setBackgroundResource(R.color.colorGray);
            }
        });

        btn_subMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_subMoney.setBackgroundResource(R.color.MainColor);
                btn_addMoney.setBackgroundResource(R.color.colorGray);
            }
        });
    }

}
