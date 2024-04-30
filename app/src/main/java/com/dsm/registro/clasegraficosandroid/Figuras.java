package com.dsm.registro.clasegraficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Figuras extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new FigurasView(this));
    }

    public class FigurasView extends View {
        public FigurasView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            int alto = getMeasuredHeight();
            int ancho = getMeasuredWidth();

            Paint miRelleno = new Paint();
            miRelleno.setStyle(Paint.Style.FILL);
            miRelleno.setColor(Color.GREEN);
            canvas.drawRect(0,0,ancho/4,alto *0.85f,miRelleno);

            miRelleno.setColor(Color.MAGENTA);
            canvas.drawRect(ancho/4,0,2*(ancho/4),alto *0.85f,miRelleno);

            miRelleno.setColor(Color.RED);
            canvas.drawRect(2*(ancho/4),0,3 * (ancho/4),alto *0.85f,miRelleno);

            miRelleno.setColor(Color.BLUE);
            canvas.drawRect(3*(ancho/4),0,4*(ancho/4),alto *0.85f,miRelleno);

            miRelleno.setColor(Color.BLACK);
            canvas.drawRect(0,alto*0.85f,ancho,alto,miRelleno);

            Paint miBorde = new Paint();
            miBorde.setStyle(Paint.Style.STROKE);
            miBorde.setColor(Color.WHITE);

            canvas.drawRect(1,0,ancho -1,alto*0.85f,miBorde);
            canvas.drawRect(1,0,ancho -1,alto-1,miBorde);
        }
    }
}
