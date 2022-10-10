package poo.equipofutbol;

public abstract class Persona {
    //Atributos
    protected String nombre, apellido;
    protected int edad;
    
    //Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters
    public String getNombre(){    
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    
    public int getEdad() {    
        return edad;
    }

    //metodos
    public void viajar() {
        System.out.println("Viajar");
    }
    
    public abstract void partidoFutbol();
    
    public abstract void entrenamiento();
}
