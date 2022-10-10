package poo.areapoligonos;

public class Poligono {
    //Atributos
    protected int numeroLados;
    
    //contructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Poligono{" + "numeroLados=" + numeroLados + '}';
    }
    
    
}
