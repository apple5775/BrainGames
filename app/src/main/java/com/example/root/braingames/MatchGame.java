package com.example.root.braingames;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MatchGame {
    public MatchGame(MainActivity mainActivity){
        mainActivity.setContentView(R.layout.matchgame);

        GridLayout gridLayout = (GridLayout) mainActivity.findViewById(R.id.board);

        ImageView horizontal = new ImageView(mainActivity);
        horizontal.setImageResource(R.drawable.matchstick_horizontal);
        ImageView vertical = new ImageView(mainActivity);
        vertical.setImageResource(R.drawable.matchstick_vertical);

        gridLayout.removeAllViews();

        for(int row = 0; row < 7; row += 2)
            for (int col = 1; col < 6; col += 2) {
//                gridLayout.removeView(new GridLayout.LayoutParams(
//                        GridLayout.spec(row, GridLayout.CENTER),
//                        GridLayout.spec(col, GridLayout.CENTER)
//                ));
                ImageView h = new ImageView(mainActivity);
                h.setImageResource(R.drawable.matchstick_horizontal);
                gridLayout.addView(h, new GridLayout.LayoutParams(
                        GridLayout.spec(row, GridLayout.CENTER),
                        GridLayout.spec(col, GridLayout.CENTER)));
            }
    }
 }
