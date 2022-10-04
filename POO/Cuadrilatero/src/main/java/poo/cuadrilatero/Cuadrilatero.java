package poo.cuadrilatero;

public class Cuadrilatero {
    //atriburtos
    private float lado1, lado2;
   
    //Constructor 1
    public Cuadrilatero(float l, float a){
        this.lado1 = l;
        this.lado2 = a;
    }

    public Cuadrilatero(float l) {
        this.lado1 = l;
        this.lado2 = l;
    }

    public float getPerimetro(float lado1, float lado2) {
        float perimetro = (lado1 + lado2) * 2;
        return perimetro;
    }
    public float getArea(float lado1, float lado2) {
        float area = lado1 * lado2;
        return area;
    }
}
