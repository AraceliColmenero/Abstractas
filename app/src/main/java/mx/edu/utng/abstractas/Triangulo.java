package mx.edu.utng.abstractas;

/**
 * Created by hasan_000 on 22/01/2016.
 */
public class Triangulo extends Figura {
    private float base;
    private float altura;
    @Override
    public float calcularArea(){
        return(base*altura)/2;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
