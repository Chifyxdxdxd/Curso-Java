package poo.areapoligonos;

public class Triangulo extends Poligono {
    //Atributos
    private double lado1, lado2, lado3;
    
    //Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo:\nArea: " + this.area() + "\nLado 1: " + lado1 + 
                ", lado 2: " + lado2 + ", lado 3:" + lado3;
    }
     //Metodo
    public double area(){
        return (this.lado1 * this.lado2 * this.lado3)/2;
    }
    
}
