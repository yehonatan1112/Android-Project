package com.example.wordle;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;

public class Board extends View {
    private Paint paint;
    private Paint bgPaint;
    Square[] sqr=new Square[6];

    public Board(Context context){
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(12);
        bgPaint = new Paint();
        bgPaint.setColor(Color.WHITE);

            for(int j=0; j<sqr.length; j++)
            {
                int j2= j*100;
                if(j==0)
                    sqr[j] = new SquareBorder(j2, 100, j2+100, 200);
                else
                    sqr[j] = new Square(j2, 100, j2+100, 200);
            }

        Random rnd = new Random();
        int size=3, count=1;
        boolean horizontal = false;
        boolean vertical = false;
        int i=0,i2=0,j=0,j2=0;
        int length = size;
        int borderLength = length+2;
        int rand = rnd.nextInt(2);
        /*while(count<6)
        {
            i = rnd.nextInt(10)+1;
            i2 = i;
            j = rnd.nextInt(10)+1;
            j2 = i;
            length=size;
            borderLength = length+2;
            rand = rnd.nextInt(2);

            if(rand==1)
                horizontal = true;
            else
                vertical = true;

            if(horizontal)
            {
                while(i+size>=11)
                {
                    i= rnd.nextInt((10 - 1) + 1) + 1;
                    i2 = i;
                }
            }
            else
            {
                while(j+size>=11)
                {
                    j= rnd.nextInt((10 - 1) + 1) + 1;
                    j2 = j;
                }
            }

                if(horizontal && !sqr[i+size][j].getIsBorder() && !sqr[i+size][j].getIsShip()  ) {
                    //Builds head of ship
                    sqr[i][j] = new ShipActivity(i * 100, j * 100, (i * 100) + 100, (j * 100) + 100);
                    sqr[i][j].setIsShip(true);
                    //Builds  ship
                    while (length >= 1) {
                        sqr[i2 + 1][j] = new ShipActivity((i2 + 1) * 100, j * 100, ((i2 + 1) * 100) + 100, (j * 100) + 100);
                        sqr[i2 + 1][j].setIsShip(true);
                        i2++;
                        length--;
                    }


                    //finds the ship's borders
                    for (int k = 1; k < borderLength; k++) {
                        SetBorders(sqr, i, j);
                        i++;
                    }

                }
                if(vertical==true&& sqr[i][j+size].getIsBorder()==false && sqr[i][j+size].getIsShip()==false){
                    //builds head of the ship
                    sqr[i][j] = new ShipActivity(i * 100, j * 100, (i * 100) + 100, (j * 100) + 100);
                    sqr[i][j].setIsShip(true);
                    //builds the rest of the ship
                    while (length >= 1) {
                        sqr[i][j2 + 1] = new ShipActivity(i * 100, (j2 + 1) * 100, (i2 * 100) + 100, ((j2 + 1) * 100) + 100);
                        sqr[i][j2 + 1].setIsShip(true);
                        j2++;

                        length--;
                    }
                    //finds the ship's borders
                    for (int k = 1; k < borderLength; k++) {
                        SetBorders(sqr, i, j);
                        j++;
                    }
                }
                count++;
                if(size==3&&count==2)
                    size--;
                if(size==2&&count==4)
                    size--;
                if(size==1&&count==7)
                    size--;

            i=0; j=0; i2=0; j2=0;
            horizontal = false; vertical = false;
        }*/
   /*     for (int k=1; k<11; k++)
        {
            for(int l=1; l<11; l++)
            {
                if(sqr[k][l] instanceof ShipActivity)
                {
                    if (sqr[0][l] instanceof SquareBorder)
                        ((SquareBorder) sqr[0][l]).addShip();
                    if (sqr[k][0] instanceof SquareBorder)
                        ((SquareBorder) sqr[k][0]).addShip();
                }
                sqr[k][l].setIsBorder(false);
            }
        }*/
    }
}
