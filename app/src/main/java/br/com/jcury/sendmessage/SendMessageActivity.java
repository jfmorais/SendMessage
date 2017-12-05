package br.com.jcury.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by jcury on 19/10/2017.
 */

public class SendMessageActivity extends AppCompatActivity {

    public static final String TAG="SEND MESSAGE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_message_view);
        Log.i(TAG,"Pronto para enviar mensagem...");
    }

    public void onSendMessage(View v){
        Log.i(TAG,"enviando mensagem...");
        Intent i = new Intent(this, ReceiveMessageActivity.class);
        EditText message = (EditText) findViewById(R.id.message_send);

        Log.i(TAG,"enviando mensagem..."+message.getText().toString());
        i.putExtra(ReceiveMessageActivity.MESSAGE, message.getText().toString());

        startActivity(i);

    }

    public void onChosseApp(View v){
        Log.i(TAG,"escolhendo o app...");
        Intent i = new Intent(Intent.ACTION_SEND);
        EditText message = (EditText) findViewById(R.id.message_send);
        String message_subject = "Teste";

        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,  message.getText().toString());
        i.putExtra(Intent.EXTRA_SUBJECT, message_subject);

        startActivity(i);
    }
}
