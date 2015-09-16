package com.example.marcos.holamundomvc;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by marcos on 16/09/15.
 */
public class ScreenManager {
    EditText input;
    TextView output;
    Button button;
    ImageView image;

    public ScreenManager(MainActivity context) {
        input = (EditText) context.findViewById(R.id.input);
        output = (TextView) context.findViewById(R.id.output);
        button = (Button) context.findViewById(R.id.button);
        image = (ImageView) context.findViewById(R.id.image);
    }
}
