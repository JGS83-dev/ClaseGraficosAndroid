package com.dsm.registro.clasegraficosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        Intent actividadGrafico = new Intent(this,MainActivity.class);
        if(checked){
            if(R.id.crear_figuras_01 == view.getId()){
                actividadGrafico = new Intent(this,Figuras.class);
            }else if(R.id.crear_grafico01 == view.getId()){
                actividadGrafico = new Intent(this,Grafico.class);
            }else if(R.id.crear_curvas01 == view.getId()){
                actividadGrafico = new Intent(this,Curvas.class);
            }else if(R.id.crear_figuras_02 == view.getId()){
                actividadGrafico = new Intent(this,OtrasFiguras.class);
            }else if(R.id.crear_mediaonda == view.getId()){
                actividadGrafico = new Intent(this,MediaOnda.class);
            }

            startActivity(actividadGrafico);
        }

    }
}