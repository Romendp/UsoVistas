package com.example.romen.ac26_usodevistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Es posible hacer sólo un método mostrar usando vista.getId, si es el botonEstrella
    //que haga una cosa, si es el botonStop , que haga otra
    public void mostrar(View vista){

        final ToggleButton bEstrella;
        bEstrella  = (ToggleButton)findViewById(R.id.botonEstrella);
        final ToggleButton bStop = (ToggleButton)findViewById(R.id.botonStop);
        final TextView anuncios = (TextView)findViewById(R.id.anuncios);

        bEstrella.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(bEstrella.isChecked())
                    anuncios.setText("ESTRELLADO");
                else
                    anuncios.setText("SIN ESTRELLAS");
            }
        });

    }

    public void mostrar2(View vista){

        final ToggleButton bStop = (ToggleButton)findViewById(R.id.botonStop);
        final TextView anuncios = (TextView)findViewById(R.id.anuncios);

            bStop.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg0)
                {
                    if(bStop.isChecked())
                        anuncios.setText("PARADO");
                    else
                        anuncios.setText("EN MARCHA");
                }
            });

    }
}
