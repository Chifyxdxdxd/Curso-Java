package poo.areapoligonos;

public class Rectangulo extends Poligono {
    //Atributos
    private double lado1, lado2;
    
    //Constructor
    public Rectangulo(double lado1, double lado2) {
        super (2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo:\nArea:" + this.area() + "\nLado 1: " + lado1 +
                ", lado 2: " + lado2;
    }
    
    //Metodos
    public double area(){
        return this.lado1 * this.lado2;
    }
}
