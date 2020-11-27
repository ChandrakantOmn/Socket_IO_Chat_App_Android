package com.cskapp.socketdemo27;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

/**
 * Created by Chandra Kant on 11/27/20.
 */
class ChatApplication {
  //  String SERVER_URL="http://192.168.43.121:3000";
    String SERVER_URL="http://10.0.2.2:3000";
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket(SERVER_URL);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }
}
