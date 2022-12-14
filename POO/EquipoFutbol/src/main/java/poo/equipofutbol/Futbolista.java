package poo.equipofutbol;

public class Futbolista extends Persona {
    //Atributos
    private int dorsal;
    private String posicion;
    
    //Constructor
    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    //Getters
    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
    
    //Métodos
    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partido de futbol");
    }
    
    @Override
    public void entrenamiento() {
        System.out.println("Entrena");
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }

}
