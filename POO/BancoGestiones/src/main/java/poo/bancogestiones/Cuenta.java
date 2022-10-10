package poo.bancogestiones;

public class Cuenta {

    //atributos
    private final int numeroC;
    private double saldo;

    //constructor
    public Cuenta(int numeroC, double saldo) {
        this.numeroC = numeroC;
        this.saldo = saldo;
    }

    //Getters
    public int getNumeroC() {
        return numeroC;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodos
    public void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        this.saldo -= cantidad;
    }
}
