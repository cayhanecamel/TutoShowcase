package com.github.florent37.tutoshowcase.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Square extends Shape {

    private int x;
    private int y;
    private int width;
    private int height;
    public static final int BORDER_PADDING = 30;

    public Square(int x, int y, int width, int height) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void drawOn(Canvas canvas) {
        if(isDisplayBorder()){
            drawSquare(canvas, getX() - BORDER_PADDING, getY() - BORDER_PADDING, getX() + getWidth() + BORDER_PADDING, getY() + getHeight() + BORDER_PADDING, getBorderPaint());
        }
        drawSquare(canvas, getX(), getY(), getX() + getWidth(), getY() + getHeight(), paint);
    }

    private static void drawSquare(Canvas canvas, float left, float top, float right, float bottom, Paint paint) {

        RectF rectF = new RectF(left, top, right, bottom);
        canvas.drawRoundRect(rectF, 0, 0, paint);
    }
}
