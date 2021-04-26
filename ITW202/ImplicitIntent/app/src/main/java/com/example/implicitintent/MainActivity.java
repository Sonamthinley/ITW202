package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    EditText webpage;
    EditText location;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webpage = (EditText)findViewById(R.id.text1);
        location = (EditText)findViewById(R.id.text2);
        text = (EditText)findViewById(R.id.text3);
    }

    public void openwebpage(View view) {
        String str = webpage.getText().toString();
        Uri uri = Uri.parse(str);
        Intent obj = new Intent(Intent.ACTION_VIEW, uri);

        if(obj.resolveActivity(getPackageManager())!=null){
            startActivity(obj);
        }
        else{
            Log.d("Implement Message","Error in Operation");
        }
    }

    public void openlocation(View view) {
        String str = location.getText().toString();
        Uri url = Uri.parse("geo:0,0?q=" + str);
        Intent obj = new Intent(Intent.ACTION_VIEW, url);

        if(obj.resolveActivity(getPackageManager())!=null){
            startActivity(obj);
        }
        else{
            Log.d("implement Message", "Error");
        }
    }

    public void sharetext(View view) {

        String str = text.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Message To: ")
                .setText(str)
                .startChooser();
    }

}