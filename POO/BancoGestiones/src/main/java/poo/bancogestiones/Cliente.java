package poo.bancogestiones;

public class Cliente {

    //atributos
    private final int DNI;
    private final String nombre, apellido;
    Cuenta cuentas[];

    //constructor

    public Cliente(int DNI, String nombre, String apellido, Cuenta[] cuentas) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = cuentas;
    }
    

    //Getters
    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    
    
    //metodos
    public double consultarDinero (int nCuenta){
        return cuentas[nCuenta].getSaldo();
    }
    
    public void ingresarDinero (int nCuenta, double dinero){
        cuentas[nCuenta].ingresarDinero(dinero);
    }
    
    public void retirarDinero (int nCuenta, double dinero){
        cuentas[nCuenta].retirarDinero(dinero);
    }
}
