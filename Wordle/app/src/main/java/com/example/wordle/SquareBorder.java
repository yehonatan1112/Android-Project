package com.example.wordle;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SquareBorder extends Square{
    public SquareBorder(int x, int y, int xEnd, int yEnd)
    {
        super(x, y, xEnd, yEnd);
    }

    @Override
    public void Draw(Canvas canvas, Paint paint)
    {
        Paint paint2 = new Paint();

            paint2.setColor(Color.BLACK);
            paint2.setTextSize(50);
            paint2.setTextAlign(Paint.Align.CENTER);
            float textSize = paint2.getTextSize();
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(x,y,xEnd,yEnd,paint);
            //canvas.drawText(String.valueOf(shipsCount), x+((xEnd-x)/2), y+((yEnd-y)/2), paint2);




    }
}
