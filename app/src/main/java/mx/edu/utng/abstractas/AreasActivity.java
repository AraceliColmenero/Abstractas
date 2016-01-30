package mx.edu.utng.abstractas;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Created by hasan_000 on 24/01/2016.
 */
public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private EditText edtLado;
    private Triangulo triangulo;
    private EditText edtBase;
    private EditText edtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_layout);
        cuadrado= new Cuadrado();
        edtLado= (EditText)findViewById(R.id.edt_Lado);
        triangulo= new Triangulo();
        edtBase=(EditText)findViewById(R.id.edt_Base);
        edtAltura=(EditText)findViewById(R.id.edt_Altura);

    }
    public void calcular(){
        float lado= Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area del Cuadrado: " + cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();

    }
    public void calcularTriangulo(){
        float base=Float.parseFloat(edtBase.getText().toString());
        triangulo.setBase(base);
        float altura=Float.parseFloat(edtAltura.getText().toString());
        triangulo.setAltura(altura);
        Toast.makeText(this, "Area del Triangulo: " + triangulo.calcularArea(), Toast.LENGTH_SHORT).show();


    }
}
