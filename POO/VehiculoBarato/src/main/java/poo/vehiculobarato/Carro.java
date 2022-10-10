package poo.vehiculobarato;

public class Carro {
    //Atributos
    String marca, modelo;
    float precio;
    
    //Constructor
    public Carro(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Getters
    public String getCarro(){
        return "Las especificaciones del carro son:\nMarca: " + this.getMarca()+ 
                "\nModelo: " + this.getModelo() + "\nPrecio: " + this.getPrecio() +
                " dolares";
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }
    
}
