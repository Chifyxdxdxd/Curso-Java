
package poo.enviopaquetes;

public class Paquete {
    //Atributps
    private int numeroPaquete, prioridad;
    private double peso;
    private String dni;
    
    //constructor
    public Paquete(int numeroPaquete, int prioridad, double peso, String dni) {
        this.numeroPaquete = numeroPaquete;
        this.prioridad = prioridad;
        this.peso = peso;
        this.dni = dni;
    }
    
    //Getters
    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public String getDni() {
        return dni;
    }
    
    public String mostarDatosPaquete (){
        return "El paquete con el número: " + this.getNumeroPaquete() + 
                "\ntiene un peso de " + this.getPeso() + " kg\n" + 
                "Esta a nombre de la persona con DNI " + this.getDni() +
                "\n-------------------------------------------------";
    }
    
}
