package com.example.root.smstest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SmsListener extends BroadcastReceiver {

    String number;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("SMS", "hi");
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                String messageBody = smsMessage.getMessageBody();

                number = smsMessage.getOriginatingAddress();
                //Toast.makeText(context, number, Toast.LENGTH_LONG).show();

                new Crawl().execute();

            }
        }
    }

    public class Crawl extends AsyncTask<Void, Void, String> {


        @Override
        protected void onPreExecute() {

        }

        @Override
        protected String doInBackground(Void... params) {


            try {
                Document doc = Jsoup.connect("http://site21.way2sms.com/LocateMobile/" + number).get();
                Elements metaElems = doc.select("input[id=circle]");

                return metaElems.attr("value");
            }

            catch (Exception e) {
                return e.toString();

            }


        }

        @Override
        protected void onPostExecute(String result) {
            String location = result;
        }
    }
}
