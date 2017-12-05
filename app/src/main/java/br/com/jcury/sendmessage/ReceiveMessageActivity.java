package br.com.jcury.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by jcury on 05/12/2017.
 */

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";
    public static final String TAG="RECEIVE MESSAGE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_message_view);
        Log.i(TAG,"recebendo mensagem...");
        TextView t = (TextView) findViewById(R.id.message_received);


        Intent i = getIntent();
        String message = i.getStringExtra(MESSAGE);
        Log.i(TAG,"recebendo mensagem..."+message);
        t.setText(message);
    }
}
