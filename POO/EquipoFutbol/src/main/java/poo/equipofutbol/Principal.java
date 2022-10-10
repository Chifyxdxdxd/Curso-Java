package poo.equipofutbol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un programa para simular un equipo de futbol (fulbolista, entrenador y 
 * doctor), para lo cual tendremos lo siguiente:
 *  - Una super clase Persona, datos: nombre, apellido y edad.
 *  - La sub clase Futbolista, datos: dorsal y posición.
 *  - La sub clase Entrenador, dato: tipo de estrategia.
 *  - La sub clase Doctor, datos: titulación y años de experiencia.
 * Hacer un menú dónde se tengan las siguientes opciones: Viaje de equipo,
 * entrenamiento, partido de futbol, planificar entrenamiento, entrevista, curar
 * lesión.
 */
public class Principal {
    static ArrayList<Persona> per = new ArrayList<>();
    
    static Persona fut1 = new Futbolista("Jason", "Ramos", 24, 1,"Centro");
    static Persona fut2 = new Futbolista("Miguel", "Salamanca", 26, 12,"Defensa");
    static Persona tra = new Entrenador("luis", "Perez", 24, "agresiva");
    static Persona doc = new Medico("Paco", "Rodrigez", 24, "fisioterapia", 5);
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int pos;
        
        //Menú
        do {
            System.out.println("""
                           \tMENÚ:
                           1. Viaje en equipo
                           2. Entrenamiento
                           3. Partido de futbol
                           4. Planificar entrenamiento
                           5. Entrevista
                           6. Curar lesion
                           0. SALIR""");
            pos = ent.nextInt();
            if (pos == 0) {
                break;
            }
            
            switch (pos){
                case 1 ->{
                    for (int i = 0; i < per.size(); i++) {
                        System.out.println("El miembro del equipo " + per.get(i).getNombre());
                        per.get(i).viajar();
                    }
                }
                case 2 ->{
                    for (int i = 0; i < per.size(); i++) {
                        System.out.println("El miembro del equipo " + per.get(i).getNombre());
                        per.get(i).entrenamiento();
                    }
                }
                case 3 ->{
                    for (int i = 0; i < per.size(); i++) {
                        System.out.println("El miembro del equipo " + per.get(i).getNombre());
                        per.get(i).partidoFutbol();
                    }
                }
                case 4 ->{
                    System.out.println(tra.getNombre()+" "+ tra.getApellido());
                    ((Entrenador)tra).planificar();
                }
                case 5 ->{
                    System.out.println(fut1.getNombre()+" "+fut1.getApellido());
                    ((Futbolista)fut1).entrevista();
                    System.out.println(fut2.getNombre()+" "+fut2.getApellido());
                    ((Futbolista)fut2).entrevista();
                }
                case 6 ->{
                    System.out.println(doc.getNombre() + " " + doc.getApellido());
                    ((Medico)doc).curarLesion();
                }
                default -> System.out.println("número equivocado, por favor intente otra vez");
            }
            
        }while(pos!=0);
    }
}
