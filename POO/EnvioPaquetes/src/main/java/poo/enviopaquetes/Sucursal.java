package poo.enviopaquetes;

public class Sucursal {
    //Atributos
    private int numeroSucursal;
    private String direcion, ciudad;
    
    //Constructor
    public Sucursal(int numeroSucursal, String direcion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direcion = direcion;
        this.ciudad = ciudad;
    }
    
    //Getters
    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDirecion() {
        return direcion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String getDatosSucursal(){
        return "La sucusal se encuentra en la dirección " + this.getDirecion() + 
                " en la ciudad de " + this.getCiudad() + 
                " y el número de la sucursal es " + this.getNumeroSucursal() + 
                "\n--------------------------------------------------------";
    }
    
}
