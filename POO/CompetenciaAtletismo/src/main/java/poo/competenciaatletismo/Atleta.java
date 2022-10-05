package poo.competenciaatletismo;

public class Atleta {

    //Atributos
    String nombre;
    int numero;
    float tiempo;

    //Constructor
    public Atleta(String nombre, int numero, float tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    //Getters
    public String getAtleta() {
        return "El atleta de nombre " + this.getNombre() + " que es el número "
                + this.getNumero() + ". Gana la carrera con el tiempo: "
                + this.getTiempo() + " segundos";
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public float getTiempo() {
        return tiempo;
    }
}
