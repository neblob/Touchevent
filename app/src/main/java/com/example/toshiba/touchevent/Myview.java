package com.example.toshiba.touchevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Myview extends View {

    private float mX,mY;
    Paint paint = new Paint();
    public Myview(Context context){
        super(context);
        setOnTouchListener(new OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("touch",event.toString());
                mX = event.getX();
                mY = event.getY();
                invalidate();
                return true;
            }
        });
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        canvas.drawLine(0, mY, canvas.getWidth(), mY, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(40);
        float p = mY / canvas.getHeight();
        canvas.drawText("" + p * 100 + "%", 0, mY, paint);
    }
}