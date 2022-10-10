package poo.numeroscomplejos;

public class NumeroComplejo {

    //Atributos
    private double imag, real;

    //constructor
    public NumeroComplejo(double real, double imaginario) {
        this.imag = imaginario;
        this.real = real;
    }

    //Getters
    public String getComplejo(){
        return "el número complejo es: " + this.real  + " + (" + this.imag + ")i";
    }
    
    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    //Métodos
    public NumeroComplejo calcularSuma(NumeroComplejo c2) {
        double real, imag;
        real = this.getReal() + c2.getReal();
        imag = this.getImag() + c2.getImag();
        return new NumeroComplejo(real, imag);
    }

    public NumeroComplejo calcularProducto(NumeroComplejo c1 ){
        double real, imag;
        real = (this.getReal() * c1.getReal()) - (this.getImag() * c1.getImag());
        imag = (this.getReal() * c1.getImag()) + (c1.getReal() * this.getImag());
        return new NumeroComplejo(real, imag);
    }

    public boolean comprobarIgualdad(NumeroComplejo c1, NumeroComplejo c2) {
        boolean igualdad = true;
        if (c1.getReal() != c2.getReal()) {
            igualdad = false;
        }
        if (c1.getImag() != c2.getImag()) {
            igualdad = false;
        }
        return igualdad;
    }

    public NumeroComplejo productoPorEntero(NumeroComplejo c1, int entero) {
        double real, imag;
        real = c1.getReal() * entero;
        imag = c1.getImag() * entero;
        return new NumeroComplejo(real, imag);
    }
}
