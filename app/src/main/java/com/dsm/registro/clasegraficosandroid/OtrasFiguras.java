package com.dsm.registro.clasegraficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OtrasFiguras extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new OtrasFigurasView(this));
    }

    public class OtrasFigurasView extends View {
        public OtrasFigurasView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);
            canvas.drawCircle(350,150,100,paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLUE);
            RectF oval1 = new RectF(50,100,250,500);
            canvas.drawOval(oval1,paint);
            int color;
            color = getResources().getColor(R.color.color_circulo);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.YELLOW);
            paint.setColor(color);
            canvas.drawRect(300,300,500,600,paint);
        }
    }
}
