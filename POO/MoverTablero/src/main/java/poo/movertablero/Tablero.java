package poo.movertablero;

public class Tablero {

    //Atriburtos
    private int x, y;

    //Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodos
    public void moverArriba(int inc) {
        this.y += inc;
    }

    public void moverAbajo(int inc) {
        this.y -= inc;
    }

    public void moverDerecha(int inc) {
        this.x += inc;
    }

    public void moverIzquierda(int inc) {
        this.x -= inc;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
