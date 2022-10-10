package poo.enviopaquetes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Una empresa de envio de paquetes tine varias sucursales en todo el país. Cada
 * sucursal esta definida por su número de sucursal, dirección y ciudad. Para
 * calcular el precio que custa enviar cada paquete, las sucursales tienen en
 * cuenta el precio del paquete y la prioriidad, sabiendo que se cobra un dólar
 * por kilo, 10 dólares más si la prioridad s alta y 20 si es express. Cara
 * paquet enviado tendrá un número de referencia y el DNI de la persona que lo
 * envía.
 */
public class Principal {

    public static Sucursal crearSucursal() {
        Scanner entrada = new Scanner(System.in);
        int nSucursal;
        String direccion, ciudad;

        System.out.println("inserte el número de la sucursal");
        nSucursal = entrada.nextInt();
        System.out.println("inserte dirección de la sucursal");
        direccion = entrada.next();
        System.out.println("insete ciudad de la sucursal");
        ciudad = entrada.next();

        return new Sucursal(nSucursal, direccion, ciudad);
    }

    public static Paquete crearPaquete() {
        Scanner entrada = new Scanner(System.in);
        int nPaquete, prioridad;
        double peso;
        String dni;

        System.out.println("inserte el numero de paquete");
        nPaquete = entrada.nextInt();
        System.out.println("inserte la prioridad del paquete");
        prioridad = entrada.nextInt();
        System.out.println("inserte el peso del paquete");
        peso = entrada.nextDouble();
        System.out.println("inserte el dni de la persona que envia el paquete");
        dni = entrada.next();

        return new Paquete(nPaquete, prioridad, peso, dni);
    }

    public static void precioPaquete(double peso, int prioridad) {
        double suma = peso;
        if (prioridad == 2) {
            suma += 20;
        } else if (prioridad == 1) {
            suma += 10;
        }
        System.out.println("el precio de envio es: " + suma);
    }

    public static int buscarSucursal(ArrayList<Sucursal> suc, int nSucursal) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < suc.size(); i++) {
            if (nSucursal == suc.get(i).getNumeroSucursal()) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static int buscarPaquete(ArrayList<Paquete> paq, int nPaquete) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < paq.size(); i++) {
            if (nPaquete == paq.get(i).getNumeroPaquete()) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Paquete> paq = new ArrayList<>();
        ArrayList<Sucursal> suc = new ArrayList<>();
        int pos, numP, numS;

        //Menú
        do {
            //seleccionamos la opción
            System.out.println("""
                           \tMENÚ:
                           1. enviar paquete
                           2. consultar precio de envio 
                           3. mirar sucursales
                           4. mirar paquetes
                           5. Añadir sucursales
                           6. Añadir paquetes 
                           0. SALIR""");
            pos = entrada.nextInt();
            if (pos == 0) {
                break;
            }
            switch (pos) {
                case 1 -> {
                    System.out.println("cual paquete quiere enviar?");
                    numP = entrada.nextInt();

                    if (buscarPaquete(paq, numP) == -1) {
                        System.out.println("el paquete no se ha encontrado"
                                + "\nvolviendo al menú...");
                        break;
                    } else {
                        System.out.println("a cual sucursal lo va a enviar?");
                        numS = entrada.nextInt();
                        if (buscarPaquete(paq, numS) == -1) {
                            System.out.println("la sucursal no se ha encontrado"
                                    + "\nvolviendo al menú...");
                            break;
                        }
                        System.out.println("el paquete con los datos: "
                                + paq.get(numP).mostarDatosPaquete()
                                + "\nHa sido enviado a la sucursal con los datos:"
                                + suc.get(numS).getDatosSucursal() + "\n");
                        precioPaquete(paq.get(numS).getPeso(), paq.get(numS).getPrioridad());
                    }

                }
                case 2 -> {
                    System.out.println("cual paquete quiere consultar?");
                    numP = entrada.nextInt();
                    numS = buscarPaquete(paq, numP);

                    if (numS == -1) {
                        System.out.println("el paquete no se ha encontrado"
                                + "\nvolviendo al menú...");
                        break;
                    }

                    precioPaquete(paq.get(numS).getPeso(), paq.get(numS).getPrioridad());
                }
                case 3 -> {
                    //mirar sucursales
                    for (int i = 0; i < suc.size(); i++) {
                        System.out.println(suc.get(i).getDatosSucursal());
                    }
                }
                case 4 -> {
                    //mirar paquetes
                    for (int i = 0; i < paq.size(); i++) {
                        System.out.println(paq.get(i).mostarDatosPaquete());
                    }
                }
                case 5 -> {
                    //crear sucursales
                    System.out.println("numero de sucursales a crear");
                    pos = entrada.nextInt();
                    for (int i = 0; i < pos; i++) {
                        suc.add(crearSucursal());
                    }
                }
                case 6 -> {
                    //crear paquetes
                    System.out.println("numero de paquetes a crear");
                    pos = entrada.nextInt();
                    for (int i = 0; i < pos; i++) {
                        paq.add(crearPaquete());
                    }
                }
                default ->
                    System.out.println("Número equivocado");
            }
        } while (pos != 0);
        System.out.println("saliendo, gracias");

    }
}
