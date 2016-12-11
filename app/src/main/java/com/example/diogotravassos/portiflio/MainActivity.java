package com.example.diogotravassos.portiflio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void genericToast(View view) {
        Button b = (Button) view;
        String buttonText = b.getText().toString();

        String toastText =  String.format(getResources().getString(R.string.app_button_info), buttonText);

        Toast toast = Toast.makeText(view.getContext(), toastText, Toast.LENGTH_SHORT);
        toast.show();
    }
}
