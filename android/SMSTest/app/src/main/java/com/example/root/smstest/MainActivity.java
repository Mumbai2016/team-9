package com.example.root.smstest;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Log.e("SMS", "1");
               SmsManager smsManager = SmsManager.getDefault();
               smsManager.sendTextMessage("9970887374", null, "sms message", null, null);




                //Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG).show();


                Cursor cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);

                if (cursor.moveToFirst()) { // must check the result to prevent exception
                    do {
                        String msgData = "";
                        for(int idx=0;idx<cursor.getColumnCount();idx++)
                        {
                            msgData += " " + cursor.getColumnName(idx) + ":" + cursor.getString(idx);
                        }
                        //Toast.makeText(getApplicationContext(), msgData, Toast.LENGTH_LONG).show();
                    } while (cursor.moveToNext());
                } else {
                    // empty box, no SMS
                    Log.e("SMS", "no");
                }

                Log.e("SMS", "2");


//                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
//                sendIntent.putExtra("sms_body", "default content");
//                sendIntent.setType("vnd.android-dir/mms-sms");
//                startActivity(sendIntent);

            }
        });
    }


}
