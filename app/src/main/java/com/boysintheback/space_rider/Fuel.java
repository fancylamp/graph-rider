package com.boysintheback.space_rider;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;

public class Fuel extends GameObject {

    private Bitmap image;

    public Fuel(int x, int y, int speed, Bitmap image) {
        super(x, y, speed, "Fuel");
        this.image = image;
    }

    public void render(Canvas c) {
        c.drawBitmap(image,x,y,null);
    }

    public void update() {
        y += speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType(){return type;}
}
