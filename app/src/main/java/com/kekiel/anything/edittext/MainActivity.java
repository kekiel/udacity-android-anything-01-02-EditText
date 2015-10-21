package com.kekiel.anything.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *  Part of the Udacity course "How to create <anything> in Android"
 *  https://www.udacity.com/course/how-to-create-anything-in-android--ud802
 *  Section "How do I use ___ in Android"
 *    -> "User Input Controls"
 *      -> "How do I use Edit Text in an Android app?"
 *  see http://www.tutorialspoint.com/android/android_edittext_control.htm
 *  and http://www.feelzdroid.com/2015/06/textinputlayout-android-example.html
 */
public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_text);
        textView = (TextView) findViewById(R.id.text_view);
        actionButton = (Button) findViewById(R.id.button);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                textView.setText(str);
            }
        });

    }
}
