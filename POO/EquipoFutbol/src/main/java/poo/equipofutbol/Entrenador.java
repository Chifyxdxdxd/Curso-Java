package poo.equipofutbol;

public class Entrenador extends Persona {
    //Atributos
    private String estrategia;
    
    //Constructor
    public Entrenador(String nombre, String apellido, int edad,String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }
    
    //Getters
    public String getEstrategia() {
        return estrategia;
    }
    
    //Metodos
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige el partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirige el entrenamiento");
    }
    public void planificar(){
        System.out.println("Planifica el entrenamiento de forma " + this.getEstrategia());
    }
}
    
