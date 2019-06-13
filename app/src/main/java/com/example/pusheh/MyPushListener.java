package com.example.pusheh;


import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import co.ronash.pushe.PusheListenerService;

public class MyPushListener extends PusheListenerService
{

//    http://wiadevelopers.ir/api/gift.json
  //  json example that we put on pushe website to send to our application

//    {
//        "id":"1",
//            "coinNumber":"5",
//            "type":"عید نوروز"
//    }



    @Override
    public void onMessageReceived(JSONObject json, JSONObject jsonObject1) {
//        super.onMessageReceived(jsonObject, jsonObject1);

        Log.i("OutPut", json.toString());

//        Toast.makeText(this, json.toString(), Toast.LENGTH_SHORT).show();

        try {
            String type = json.getString("type");
            String coinNumber = json.getString("coinNumber");
            int id = json.getInt("id");


           // now we can set the  received objects in a model which we create

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
