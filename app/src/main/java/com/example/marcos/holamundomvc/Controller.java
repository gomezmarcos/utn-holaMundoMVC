package com.example.marcos.holamundomvc;

import android.view.View;

import com.bumptech.glide.Glide;

/**
 * Created by marcos on 16/09/15.
 */
public class Controller {
    ScreenManager mScreenManager;
    MainActivity mContext;

    public Controller(MainActivity context ) {
        mContext = context;
        mScreenManager = new ScreenManager(context);
        init();
    }

    private void init(){
        Glide.with(mContext).load("http://www.escudosfc.com.br/images/lanusc.png").into(mScreenManager.image);
        mScreenManager.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = new Model().createText();
                mScreenManager.output.setText(text + " " + mScreenManager.input.getText().toString());
            }
        });
    }
}
