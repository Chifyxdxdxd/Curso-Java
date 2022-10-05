package poo.bancogestiones;

import java.util.Scanner;

/**
 * Hacer un programa sencillo para realizar gestiones en un banco para lo cual
 * tendremos 2 clases (cliente y Cuenta). Considerar que un cuentre se
 * caracteriza por su nombre, apellido y DNI. El cliente puede consultar saldo,
 * así como ingresar y retirar dinero de sus cuentas. Además cada cuenta se
 * caracteriza por un número de cuenta y saldo
 */
public class Principal {

    public static Cuenta crearCuenta() {
        Scanner entrada = new Scanner(System.in);
        int nCuenta;
        double saldo;

        System.out.println("Cual es el número de cuenta?");
        nCuenta = entrada.nextInt();
        System.out.println("Cuál es el saldo de la cuenta?");
        saldo = entrada.nextDouble();

        return new Cuenta(nCuenta, saldo);
    }

    public static Cliente crearCliente() {
        Scanner entrada = new Scanner(System.in);
        Cuenta cuentas[];
        int dni, nCuentas;
        String nombre, apellido;

        System.out.println("número de identificación del cliente");
        dni = entrada.nextInt();
        System.out.println("Nombre del cliente");
        nombre = entrada.next();
        System.out.println("Apellido del cliente");
        apellido = entrada.next();
        System.out.println("cuantas cuentas tiene el cliente?");
        nCuentas = entrada.nextInt();
        cuentas= new Cuenta[nCuentas];
        for (int i = 0; i < nCuentas; i++) {
            cuentas[i] = crearCuenta();
        }

        return new Cliente(dni, nombre, apellido, cuentas);
    }

    public static int seleccionarCliente(Cliente clientes[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione el cliente");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(i + 1 + ". cliente: " + clientes[i].getDNI()
                    + ", " + clientes[i].getNombre());
        }
        return entrada.nextInt() - 1;
    }

    public static int seleccionarCuenta(Cliente clientes[], Cuenta cuentas[], int pos) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("seleccionar cuenta");
        for (int i = 0; i < clientes[pos].getCuentas().length; i++) {
            System.out.println(i + 1 + ". Numero de cuenta: " + clientes[pos].cuentas[i].getNumeroC());
        }

        return entrada.nextInt()-1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente clientes[];
        int num, pos, ncuenta;
        double dinero;

        //crear clientes
        System.out.println("cuantos clientes vas a crear");
        num = entrada.nextInt();
        clientes = new Cliente[num];
        for (int i = 0; i < num; i++) {
            clientes[i] = crearCliente();
        }

        //seleccionar cliente y cuenta
        pos = seleccionarCliente(clientes);
        ncuenta = seleccionarCuenta(clientes, clientes[pos].getCuentas(), pos);

        //Menú
        do {
            //seleccionamos la opción
            System.out.println("""
                           \tMENÚ:
                           1. consultar saldo
                           2. ingresar saldo
                           3. retirar saldo
                           4. cambiar cliente y cuenta
                           0. SALIR""");
            pos = entrada.nextInt();
            if (pos == 0) {
                break;
            }
            switch (pos) {
                case 1 -> {
                    System.out.println("El saldo en la cuenta es: "
                            + clientes[pos].consultarDinero(ncuenta));

                }
                case 2 -> {
                    System.out.println("Cuanto va a ingresar?");
                    dinero = entrada.nextDouble();
                    clientes[pos].ingresarDinero(ncuenta, dinero);
                    System.out.println("El nuevo saldo en la cuenta es: "
                            + clientes[pos].consultarDinero(ncuenta));
                }
                case 3 -> {
                    System.out.println("Cuanto va a retirar?");
                    dinero = entrada.nextDouble();
                    clientes[pos].retirarDinero(ncuenta, dinero);
                    System.out.println("El nuevo saldo en la cuenta es: "
                            + clientes[pos].consultarDinero(ncuenta));
                }
                case 4 -> {
                    seleccionarCliente(clientes);
                    ncuenta = seleccionarCuenta(clientes, clientes[pos].getCuentas(), pos);
                }
                default ->
                    System.out.println("Número equivocado");
            }
        } while (pos != 0);
        System.out.println("saliendo, gracias");
    }
}
