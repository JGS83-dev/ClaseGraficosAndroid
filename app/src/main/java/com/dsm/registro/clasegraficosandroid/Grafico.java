package com.dsm.registro.clasegraficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Type;

public class Grafico extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraficoView(this));
    }

    public class GraficoView extends View {
        public GraficoView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            canvas.drawColor(Color.rgb(132,132,115));
            Paint paint = new Paint();
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            paint.setTextSize(28);
            paint.setTypeface(Typeface.SERIF);
            canvas.drawText("ancho canvas = "+ancho + ", alto canvas = " +alto,20,40,paint);
            paint.setColor(Color.rgb(100,20,0));
            canvas.drawLine(0,40,ancho,40,paint);
            paint.setColor(Color.rgb(20,0,20));
            Path circulo = new Path();
            circulo.addCircle(250,350,150, Path.Direction.CCW);
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(circulo,paint);
            paint.setTextSize(40);
            canvas.drawTextOnPath("Desarrollo de software para moviles 2024 - EIC -",circulo,10,40,paint);
        }
    }
}
