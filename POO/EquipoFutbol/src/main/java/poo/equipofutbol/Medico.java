
package poo.equipofutbol;


public class Medico extends Persona {
    //Atributos
    private String titulación;
    private int añosExperiencia;
    
    //Constructor
    public Medico(String nombre, String apellido, int edad, String titulación, int añosExperiencia) {
        super(nombre, apellido, edad);
        this.titulación = titulación;
        this.añosExperiencia = añosExperiencia;
    }
    
    //Getters
    public String getTitulación() {
        return titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    //Métodos
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia al partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia en el entrenamiento");
    }
    public void curarLesion(){
        System.out.println("Cura la lesión");
    }
}
