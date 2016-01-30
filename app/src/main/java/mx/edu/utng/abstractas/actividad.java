package mx.edu.utng.abstractas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hasan_000 on 22/01/2016.
 */


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
public class actividad extends Activity {


    /**
     * Created by hasan_000 on 22/01/2016.
     */
        private Cuadrado cuadrado;
        private EditText edtLado;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.area_layout);
            cuadrado= new Cuadrado();
            edtLado= (EditText)findViewById(R.id.edt_Lado);

        }
        public void calcular(){
            float lado= Float.parseFloat(edtLado.getText().toString());
            cuadrado.setLado(lado);
            Toast.makeText(this, "Area del Cuadrado: " + cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();

        }
    public void calcularTriangulo(){

    }
    }

