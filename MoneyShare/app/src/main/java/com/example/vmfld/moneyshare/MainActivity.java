package com.example.vmfld.moneyshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Create BackButton
        getSupportActionBar().setDisplayShowTitleEnabled(false); // Remove Real Title

      /*  클릭리스너
        final Button RoomButton1 = (Button) findViewById(R.id.RoomButton1);

        RoomButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 1-flag;

                if( flag == 0)
                {
                    RoomButton1.setBackgroundResource(R.drawable.clicked_makeroom);
                    RoomButton1.setText("지원이와 함께하는 유럽여행");
                    RoomButton1.setTextColor(
                            getResources().getColorStateList(R.color.colorWhite)
                    );
                    RoomButton1.setTextSize(25);

                }
                else {
                    RoomButton1.setBackgroundResource(R.drawable.makeroom);
                }
        });
        */

    }

   public void onRoom1Clicked (View v){
        Intent intent = new Intent(this, RoomActivity.class);
        startActivity(intent);
    }

    public void onRoom2Clicked (View v){
        Intent intent = new Intent(this, MakeRoomActivity.class);
        startActivity(intent);
    }

    public void onRoom3Clicked (View v){
        Intent intent = new Intent(this, ManageMoneyActivity.class);
        startActivity(intent);
    }

    public void onRoom4Clicked (View v){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void onRoom5Clicked (View v){
        Intent intent = new Intent(this, DivideActivity.class);
        startActivity(intent);
    }

}
