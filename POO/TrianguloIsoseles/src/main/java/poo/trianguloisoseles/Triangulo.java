package poo.trianguloisoseles;

public class Triangulo {

    //Atributos
    private double base, lado;

    //Constructor
    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    //getters
    public String getDatos() {
        return "el triangulo de mayor superficie tiene un perimetro de " 
                + this.getPerimetro() + " cm y una area de " + this.getArea() + 
                " cm^2.\nCon un lado de " + this.getLado() + " cm y una base de "
                + this.getBase() + " cm.";
    }

    public double getArea() {
        return (this.base * this.lado) / 2;
    }

    public double getPerimetro() {
        return (this.lado * 2) + this.base;
    }

    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }

}
