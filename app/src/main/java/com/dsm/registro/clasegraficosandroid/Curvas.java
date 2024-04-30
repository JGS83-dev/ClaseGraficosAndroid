package com.dsm.registro.clasegraficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Patterns;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Curvas extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CurvasView(this));
    }

    public class CurvasView extends View{
        public CurvasView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            canvas.drawColor(Color.WHITE);

            Paint paint = new Paint();
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2);
            paint.setAntiAlias(true);

            int ancho = getMeasuredWidth();
            int altura = getMeasuredHeight();

            Path path = new Path();
            path.moveTo(0,0);
            for(int i = 1;i<ancho;i++){
                path.lineTo(i,(float) Math.sin(i/20f)*(-50)-10);
            }

            path.offset(0,100);
            canvas.drawPath(path,paint);
            float[] intervalos ={10,10};
            DashPathEffect efecto = new DashPathEffect(intervalos,1);
            paint.setPathEffect(efecto);

            path.offset(0,100);
            canvas.drawPath(path,paint);
            float[] intervalos2 ={2,4};
            DashPathEffect efecto2 = new DashPathEffect(intervalos2,1);
            paint.setPathEffect(efecto2);

            path.offset(0,100);
            canvas.drawPath(path,paint);
        }
    }
}
