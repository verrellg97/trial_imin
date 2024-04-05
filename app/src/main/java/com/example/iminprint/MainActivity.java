package com.example.iminprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.imin.image.ILcdManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView btnLcdString;
    private EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLcdString = findViewById(R.id.send2);
        etNumber = findViewById(R.id.etNumber);

        btnLcdString.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i("onclick","ok");
        int id = view.getId();

        if(id == R.id.send2){
//            ILcdManager.getInstance(this).sendLCDCommand(1);
//            ILcdManager.getInstance(this).sendLCDCommand(4);

            Log.i("LcdString", etNumber.getText().toString());
            ILcdManager.getInstance(this)
                    .sendLCDString(etNumber.getText().toString().trim());
        }
    }
}