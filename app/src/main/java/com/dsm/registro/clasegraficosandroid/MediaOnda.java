package com.dsm.registro.clasegraficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MediaOnda extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MediaOndaView(this));
    }

    public class MediaOndaView extends View {
        public MediaOndaView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2);
            paint.setAntiAlias(true);

            int ancho = getMeasuredWidth();
            int alto = getMeasuredHeight();

            Path path = new Path();
            path.moveTo(0,0);

            for(int i=1;i<ancho;i++){
                path.lineTo(i,(float) ((-1)*(0.3183+(0.5)*Math.sin(i/30f)+(Math.cos(i*2/30f)/3+Math.cos(4*i/30f)/15)*(-1)*(-0.6366))*(-200)+150));
            }
            path.offset(0,100);
            canvas.drawPath(path,paint);
        }
    }
}
